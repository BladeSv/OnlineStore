package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.parser;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Laptop;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.MobilePhone;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.Тelevision;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.validator.ValidatorDevice;

public class Parser {

	private ValidatorDevice validator;
	private Base<Device> base;

	public Parser(ValidatorDevice validator) {
		super();
		this.validator = validator;
	}

	public Base<Device> parse(String text) {
		base = new Base<Device>();

		String validText = validator.validate(text);
		if (validText != null) {
			String[] tempBase = validText.split("\n");
			for (String str : tempBase) {
				switch (chooseDeviceType(str)) {
				case TV:
					base.add(parseTV(str));
					break;
				case LAPTOP:
					base.add(parseLaptop(str));
					break;
				case MOBILE_PHONE:
					base.add(parseMobilePhone(str));
					break;

				}

			}
			return base;
		} else {
			return null;
		}

	}

	private Device parseTV(String text) {
		Тelevision temp = null;

		String[] fields = text.split(",");
		if (fields != null) {
			System.out.println(fields[1].trim());
			temp = new Тelevision(Integer.parseInt(fields[1].trim()),
					DeviceType.valueOf(fields[0].replace("DeviceType.", " ").trim()), fields[2].trim(),
					fields[3].trim(), fields[4].trim(), new BigDecimal(fields[5].trim()),
					Double.parseDouble(fields[6].trim()), Double.parseDouble(fields[7].trim()), fields[8].trim());

		}

		return temp;

	}

	private Device parseLaptop(String text) {
		Laptop temp = null;
		String[] fields = text.split(",");
		if (fields != null) {
			temp = new Laptop(Integer.parseInt(fields[1].trim()),
					DeviceType.valueOf(fields[0].replace("DeviceType.", " ").trim()), fields[2].trim(),
					fields[3].trim(), fields[4].trim(), new BigDecimal(fields[5].trim()),
					Double.parseDouble(fields[6].trim()), Double.parseDouble(fields[7].trim()), fields[8].trim(),
					Integer.parseInt(fields[9].trim()), Integer.parseInt(fields[10].trim()),
					Integer.parseInt(fields[11].trim()));

		}
		return temp;

	}

	private Device parseMobilePhone(String text) {
		MobilePhone temp = null;
		String[] fields = text.split(",");
		if (fields != null) {
			temp = new MobilePhone(Integer.parseInt(fields[1].trim()),
					DeviceType.valueOf(fields[0].replace("DeviceType.", " ").trim()), fields[2].trim(),
					fields[3].trim(), fields[4].trim(), new BigDecimal(fields[5].trim()),
					Double.parseDouble(fields[6].trim()), Double.parseDouble(fields[7].trim()), fields[8].trim(),
					Integer.parseInt(fields[9].trim()), Integer.parseInt(fields[10].trim()), fields[11].trim());

		}
		return temp;

	}

	private DeviceType chooseDeviceType(String text) {

		return DeviceType.valueOf(text.substring(0, text.indexOf(",")).replace("DeviceType.", " ").trim());

	}
}
