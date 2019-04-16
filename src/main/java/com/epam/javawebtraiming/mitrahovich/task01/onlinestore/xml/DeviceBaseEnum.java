package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml;

public enum DeviceBaseEnum {
	BASE, TELEVISION, MOBILE_PHONE, LAPTOP, ID, TYPE, MANUFACTURER, MODEL, COLOR, PRICE, POWER, DISPLAY_DIAGONAL, DISPLAY_TYPE, CPU, RAM, BATTERY_CAPACITY, MOBILE_CONNECTION, HDD_CAPACITY;

	@Override
	public String toString() {

		return name().toLowerCase();
	}

}
