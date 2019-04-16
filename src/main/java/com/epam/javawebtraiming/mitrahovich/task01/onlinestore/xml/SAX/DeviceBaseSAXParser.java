package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.SAX;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.XMLParser;

public class DeviceBaseSAXParser extends XMLParser {
	public static final Logger LOGGER;

	private static DeviceBaseSAXParser baseSAXParser;
	private static DeviceHandler handler;
	private XMLReader reader;
	static {
		LOGGER = Logger.getRootLogger();
	}

	private DeviceBaseSAXParser() {

		try {
			reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(handler);

		} catch (SAXException e) {
			LOGGER.error("SAX error: " + e.getMessage());
		}
	}

	public static DeviceBaseSAXParser getInstance() {

		if (baseSAXParser == null) {
			baseSAXParser = new DeviceBaseSAXParser();

		}
		if (handler == null) {
			handler = new DeviceHandler();
		}
		return baseSAXParser;
	}

	public static void setHandler(DeviceHandler setHandler) {
		if (setHandler != null) {
			handler = setHandler;
		}

	}

	@Override
	public void createDeviceBase(String fileName) {
		try {
			reader.parse(fileName);
		} catch (SAXException e) {
			LOGGER.error("SAX error: " + e);
		} catch (IOException e) {
			LOGGER.error("IO error: " + e);
		}
		System.out.println("!!!!!!!!!!!!" + handler.getClass());

		deviceBase = handler.getDeviceBase();

	}
}
