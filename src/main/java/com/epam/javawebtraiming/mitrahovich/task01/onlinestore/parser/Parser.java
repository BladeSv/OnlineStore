package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.parser;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
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
		Device temp = null;

		String[] fields = text.split(",");
		if (fields != null) {
			for (String str : fields) {

			}
		}

		return temp;

	}

	private Device parseLaptop(String text) {
		Device temp = null;

		return temp;

	}

	private Device parseMobilePhone(String text) {
		Device temp = null;

		return temp;

	}

	private DeviceType chooseDeviceType(String text) {
		return DeviceType.valueOf(text.substring(0, text.indexOf(",")));

	}
}
