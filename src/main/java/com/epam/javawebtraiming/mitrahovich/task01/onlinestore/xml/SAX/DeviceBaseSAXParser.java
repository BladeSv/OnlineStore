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
	private DeviceHandler handler = new DeviceHandler();
	private XMLReader reader;
	static {
		LOGGER = Logger.getRootLogger();
	}

	private DeviceBaseSAXParser() {
		handler = new DeviceHandler();
		try {
			reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(handler);

		} catch (SAXException e) {

			LOGGER.error("SAX error: " + e.getStackTrace());
		}
	}

	public static DeviceBaseSAXParser getInstance() {

		if (baseSAXParser == null) {
			baseSAXParser = new DeviceBaseSAXParser();

		}

		return baseSAXParser;
	}

	public void setHandler(DeviceHandler setHandler) {
		if (setHandler != null) {
			handler = setHandler;
		}

	}

	@Override
	public void createDeviceBase(String fileName) {
		try {
			reader.parse(fileName);
		} catch (SAXException e) {
			LOGGER.error("SAX error: " + e.getStackTrace());
		} catch (IOException e) {
			LOGGER.error("IO error: " + e.getStackTrace());
		}

		deviceBase = handler.getDeviceBase();

	}
}
