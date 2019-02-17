package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.controller;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoStoreBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.daoimplemet.DaoStoreBaseArray;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.Тelevision;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.storebase.StoreBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.output.Output;

public class MainController {

	public void run() {

		StoreBase storeBase = new StoreBase();
		IDaoStoreBase daoStoreBase = new DaoStoreBaseArray(storeBase);
		Device d1 = new MobilePhone(1, DeviceType.MOBILE_PHONE, "Xiaomi", "Redmi 6A", "Black", 249.50, 5, 0.145, 5.45, "720x1440", "MediaTek Helio A22", 2000, 2, "Android 8.1 Oreo", 3000, "4G");
		System.out.println(d1);

		Device d2 = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro CLT-L29", "While", 1440.50, 5, 0.180, 6.1, "1080x2240", "HiSilicon Kirin 970", 2360, 6, "Android 8.1 Oreo", 5000, "5G");
		System.out.println(d2);
		Device d3 = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", 556.0, 31, 1.860, 15.6, "1366 x 768", "Intel Celeron N4000", 2600, 8, "Windows 10", 7000, "HDD", 500);

		Device d4 = new Laptop(4, DeviceType.LAPTOP, "Apple", "MacBook Pro", "Silver", 5953.0, 83.6, 1.830, 15.4, "2880 x 1800", "Intel Core i7 8850H", 4300, 16, "Mac OS", 8600, "SSD ", 512);
		System.out.println(d4);
		Device d5 = new Тelevision(5, DeviceType.TV, "Samsung", "UE43NU7120U", "Black", 999, 115, 9.8, 43, "3840x2160", "ЖК");
		Device d6 = new Тelevision(6, DeviceType.TV, "LG", "OLED55B8PLA", "Silver", 3146.18, 135, 17.8, 55, "3840x2160", "OLED");
		System.out.println(d6);
		daoStoreBase.add(d1);
		daoStoreBase.add(d2);
		daoStoreBase.add(d3);
		daoStoreBase.add(d4);
		daoStoreBase.add(d5);
		daoStoreBase.add(d6);

		Output.output(storeBase);
	}

}
