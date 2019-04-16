package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.DOM.DeviceBaseDOMParser;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.SAX.DeviceBaseSAXParser;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.xml.stax.DeviceBaseStAXParser;

public class XMLParserFactory {
	private static XMLParserFactory factory;
	private static XMLParser parser;

	public static XMLParser getXMLParser(XMLParserType type) {
		parser = null;
		if (factory == null) {
			factory = new XMLParserFactory();
		}

		switch (type) {
		case DOM:
			parser = DeviceBaseDOMParser.getInstance();
			break;
		case StAX:
			parser = DeviceBaseStAXParser.getInstance();
			break;
		case SAX:
			parser = DeviceBaseSAXParser.getInstance();
			break;
		}
		System.out.println(parser.getClass());
		return parser;

	}

	private XMLParserFactory() {

	}

	public enum XMLParserType {
		SAX, StAX, DOM;

	}
}
