package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.service;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.BeforeClass;
import org.junit.Test;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.daoimplemet.DaoStoreBaseArray;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.find.FindArray;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sum.SumArray;

public class FindArrayTest {
	static DaoStoreBaseArray dao;
	static StoreBase storeBase;
	static FindArray find;
	static SumArray sum;
	static Device d2;
	static Device d1;
	static Device d3;

	@BeforeClass
	public static void BeforeTest() {
		storeBase = new StoreBase();
		dao = new DaoStoreBaseArray(storeBase);
		find = new FindArray();
		sum = new SumArray();
		d1 = new MobilePhone(1, DeviceType.MOBILE_PHONE, "Xiaomi", "Redmi 6A", "Black", new BigDecimal(250.50), 5, 5.45,
				"MediaTek Helio A22", 2, 3000, "4G");

		d2 = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro CLT-L29", "While", new BigDecimal(1440.50),
				5, 6.1, "HiSilicon Kirin 970", 6, 5000, "5G");

		d3 = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new BigDecimal(556.0), 31, 15.6,
				"Intel Celeron N4000", 8, 7000, 500);
		dao.add(d1);
		dao.add(d2);
		dao.add(d3);
	}

	@Test
	public void findMaxPriceTest() {
		assertEquals(d2, find.findMaxPrice(storeBase));

	}

	@Test
	public void findMinPriceTest() {

		assertEquals(d1, find.findMinPrice(storeBase));
	}

	@Test
	public void sumPriceTest() {
		BigDecimal temp = new BigDecimal("0");

		temp = temp.add(d1.getPrice()).add(d2.getPrice()).add(d3.getPrice());

		assertEquals(temp, sum.sumPrice(dao.getAll()));

	}

}
