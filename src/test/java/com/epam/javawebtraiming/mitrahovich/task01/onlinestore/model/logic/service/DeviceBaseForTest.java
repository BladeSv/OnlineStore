package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.implementation.DaoStoreBaseCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;

public class DeviceBaseForTest {
	private DaoBase dao;
	private Base storeBase;

	public final Device d1 = new MobilePhone(1, DeviceType.MOBILE_PHONE, "Xiaomi", "Redmi 6A", "Black",
			new BigDecimal(250.50), 5, 5.45, "MediaTek Helio A22", 2, 3000, "4G");
	public final Device d2 = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro CLT-L29", "While",
			new BigDecimal(1440.50), 5, 6.1, "HiSilicon Kirin 970", 6, 5000, "5G");
	public final Device d3 = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new BigDecimal(556.0),
			31, 15.6, "Intel Celeron N4000", 8, 7000, 500);

	public DeviceBaseForTest() {

	}

	public DaoBase getDaoBase() {
		Base<Device> base = new Base<>();

		base.add(d1);
		base.add(d2);
		base.add(d3);
		dao = new DaoStoreBaseCollection<>(base);

		return dao;
	}
}
