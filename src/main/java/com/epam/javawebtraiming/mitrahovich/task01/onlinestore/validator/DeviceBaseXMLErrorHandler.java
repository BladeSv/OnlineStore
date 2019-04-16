package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.validator;

import org.apache.log4j.Logger;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class DeviceBaseXMLErrorHandler extends DefaultHandler {

	private static final Logger LOGGER;

	static {
		LOGGER = Logger.getRootLogger();
	}

	public DeviceBaseXMLErrorHandler() {
	}

	public void warning(SAXParseException e) {
		LOGGER.warn(getLineAdress(e) + e.getMessage());
	}

	public void error(SAXParseException e) {
		LOGGER.error(getLineAdress(e) + e.getMessage());
	}

	public void fatalError(SAXParseException e) {
		LOGGER.fatal(getLineAdress(e) + e.getMessage());
	}

	private String getLineAdress(SAXParseException e) {
		return e.getLineNumber() + " : " + e.getColumnNumber();
	}
}
