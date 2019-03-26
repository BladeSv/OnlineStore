package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.mainapp;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.controller.MainController;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.exception.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;

public class MainApp {

	public static void main(String[] args) throws IndexOutOfRangeException, NotAddElementBaseException {
		MainController controller = new MainController();
		controller.run();
		// Device d5 = new Тelevision(5, DeviceType.TV, "Samsung", "UE43NU7120U",
		// "Black", new BigDecimal(999.0), 115, 43,
		// "ЖК");
		// String s = " DeviceType.TV ,5, Samsung, UE43NU7120U , Black, 999.0, 115,
		// 43,ЖК";
		// // public static final String REGEX_LAPTOP = " *DeviceType\\.LAPTOP *,
		// *[0-9]*
		// // *, *\\S* *, *\\S* *, *\\S* *, *[0-9]*\\.?[0-9]* *, *[0-9]*\\.?[0-9]* *,
		// // *[0-9]*\\.?[0-9]* *, *\\S* *, *[0-9]* *, *[0-9]* *, *[0-9]* *";
		// Device d4 = new Laptop(4, DeviceType.LAPTOP, "Apple", "MacBook Pro",
		// "Silver", new BigDecimal(5953.0), 83.6,
		// 15.4, "Intel Core i7 8850H", 16, 8600, 512);
		// String l = "DeviceType.LAPTOP, 4, Apple, MacBook Pro, Silver, 5953.0, 83.6 ,
		// 15.4 ,Intel Core i7 8850H, 16, 8600, 512";
		//
		// Device d2 = new MobilePhone(2, DeviceType.MOBILE_PHONE, "Huawei", "P20 Pro
		// CLT-L29", "While",
		// new BigDecimal(1440.50), 5, 6.1, "HiSilicon Kirin 970", 6, 5000, "5G");
		// String m = "DeviceType.MOBILE_PHONE , 2, Huawei ,P20 Pro CLT-L29, While,
		// 1440.50, 5, 6.1, HiSilicon Kirin 970, 6 , 5000, 5G";
		// ValidatorDevice v = new ValidatorDevice();
		// // System.out.println(v.checkTV(s));
		// // System.out.println(v.checkLaptop(l));
		// // System.out.println(v.checkMobilePhone(m));
		//
		// String total = s + "\n" + l + "\n" + m;
		// Parser p = new Parser(v);
		// Base b = p.parse(total);
		// System.out.println(b);

	}

}
