package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type;

public enum DeviceType {

	MOBILE_PHONE("Mobile phone"), LAPTOP("Laptop"), TV("Television");

	private String type;

	/**
	 * @param type
	 */
	private DeviceType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
