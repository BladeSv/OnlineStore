package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;

public abstract class XMLParser {
	protected Base<Device> deviceBase;

	public XMLParser() {
		deviceBase = new Base<>();
	}

	public Base getBase() {
		return deviceBase;
	}

	public abstract void createDeviceBase(String filename);
}
