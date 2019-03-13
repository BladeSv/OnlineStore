package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Тelevision;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.dao.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.creator.random.DeviceBuilder;

public class CreatedEntityAdd {
	public static void add(DaoBase<Device> daoStoreBase) {

		Device d1 = new MobilePhone(1, DeviceType.MOBILE_PHONE, "Xiaomi", "Redmi 6A", "Black", new BigDecimal(250.50),
				5, 5.45, "MediaTek Helio A22", 2, 3000, "4G");

		Device d2 = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro CLT-L29", "While",
				new BigDecimal(1440.50), 5, 6.1, "HiSilicon Kirin 970", 6, 5000, "5G");

		Device d3 = new Laptop(3, DeviceType.LAPTOP, "HP", "250 G6 4QW22ES", "Black", new BigDecimal(556.0), 31, 15.6,
				"Intel Celeron N4000", 8, 7000, 500);

		Device d4 = new Laptop(4, DeviceType.LAPTOP, "Apple", "MacBook Pro", "Silver", new BigDecimal(5953.0), 83.6,
				15.4, "Intel Core i7 8850H", 16, 8600, 512);

		Device d5 = new Тelevision(5, DeviceType.TV, "Samsung", "UE43NU7120U", "Black", new BigDecimal(999.0), 115, 43,
				"ЖК");
		Device d6 = new Тelevision(6, DeviceType.TV, "LG", "OLED55B8PLA", "Silver", new BigDecimal(3146.18), 135, 55,
				"OLED");

		Device d7 = DeviceBuilder.newInstans();

		try {
			daoStoreBase.add(d1);

			daoStoreBase.add(d2);
			daoStoreBase.add(d3);
			daoStoreBase.add(d4);
			daoStoreBase.add(d5);
			daoStoreBase.add(d6);
			daoStoreBase.add(d7);
		} catch (NotAddElementBaseException e) {

			e.printStackTrace();
		}

	}
}
