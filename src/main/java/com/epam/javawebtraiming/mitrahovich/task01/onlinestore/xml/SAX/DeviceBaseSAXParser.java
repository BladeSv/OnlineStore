package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.SAX;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;

public class DeviceBaseSAXParser {
	public static final Logger LOGGER;

	private Base<Device> deviceBase;
	private DeviceHandler handler;
	private XMLReader reader;
	static {
		LOGGER = Logger.getRootLogger();
	}

	public DeviceBaseSAXParser() {

		handler = new DeviceHandler();

		try {
			reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(handler);

		} catch (SAXException e) {
			LOGGER.error("SAX error: " + e.getMessage());
		}
	}

	public Base<Device> getBase() {
		return deviceBase;
	}

	public void buildDeviceBase(String fileName) {
		try {
			reader.parse(fileName);
		} catch (SAXException e) {
			LOGGER.error("SAX error: " + e);
		} catch (IOException e) {
			LOGGER.error("IO error: " + e);
		}
		deviceBase = handler.getDeviceBase();
	}
}
