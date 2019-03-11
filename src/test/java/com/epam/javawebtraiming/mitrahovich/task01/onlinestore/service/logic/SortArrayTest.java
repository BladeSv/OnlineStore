package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.service.logic;

import static org.junit.Assert.assertArrayEquals;

import java.math.BigDecimal;
import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.daoimplemet.DaoStoreBaseCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.comparator.SortByPriceDecrease;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.comparator.SortByPriceIncrease;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.daobase.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.service.CantSortException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sort.SortArray;

public class SortArrayTest {
	private IDaoBase dao;
	private Base storeBase;
	private SortArray sort;

	private Device d2;
	private Device d1;
	private Device d3;
	private Comparator comp;
	private Comparator comp2;

	@Before
	public void BeforeTest() {
		storeBase = new Base<Device>();
		dao = new DaoStoreBaseCollection(storeBase);
		sort = new SortArray();
		comp = new SortByPriceIncrease<Device>();
		comp2 = new SortByPriceDecrease<Device>();

		d1 = new MobilePhone(1, DeviceType.MOBILE_PHONE, "Xiaomi", "Redmi 6A", "Black", new BigDecimal(250.50), 5, 5.45,
				"MediaTek Helio A22", 2, 3000, "4G");

		d2 = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro CLT-L29", "While", new BigDecimal(1440.50),
				5, 6.1, "HiSilicon Kirin 970", 6, 5000, "5G");

		d3 = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new BigDecimal(556.0), 31, 15.6,
				"Intel Celeron N4000", 8, 7000, 500);
		try {
			dao.add(d1);
			dao.add(d2);
			dao.add(d3);
		} catch (NotAddElementBaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testSortByPrice() {

		DaoStoreBaseCollection expectedDao = new DaoStoreBaseCollection<Device>(new Base<Device>());
		try {
			expectedDao.add(d1);
			expectedDao.add(d3);
			expectedDao.add(d2);

			sort.sort(expectedDao, comp2);
		} catch (CantSortException | NotAddElementBaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertArrayEquals(expectedDao.toArray(), storeBase.toArray());

	}

	// @Test
	// public void testSortByManufacturerName() {
	// StoreBase expectedStoreBase = new StoreBase();
	// DaoStoreBaseArray expectedDao = new DaoStoreBaseArray(expectedStoreBase);
	// expectedDao.add(d3);
	// expectedDao.add(d2);
	// expectedDao.add(d1);
	// sort.sortByManufacturerName(storeBase);
	// assertArrayEquals(expectedStoreBase.getDeviceBase(),
	// storeBase.getDeviceBase());
	// }

}
