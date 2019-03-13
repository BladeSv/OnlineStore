package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type;

public enum DeviceType {

	MOBILE_PHONE(), LAPTOP(), TV();

	@Override
	public String toString() {

		return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase().replaceAll("_", " ");
	}

}
