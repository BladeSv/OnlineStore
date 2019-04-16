package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.validator;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getXMLFileName;
import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getXMLSchemaFileName;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

public class ValidatorXML {

	public ValidatorXML() {

	}

	private static final Logger LOGGER;

	private static final String LANGUAGE = XMLConstants.W3C_XML_SCHEMA_NS_URI;
	private static final SchemaFactory factory = SchemaFactory.newInstance(LANGUAGE);

	static {
		LOGGER = Logger.getRootLogger();
	}

	public static void validateScheme() {
		Schema schema = null;
		try {
			schema = factory.newSchema(new File(getXMLSchemaFileName()));
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			saxParserFactory.setSchema(schema);
			SAXParser parser = saxParserFactory.newSAXParser();
			parser.parse(getXMLFileName(), new DeviceBaseXMLErrorHandler());
			LOGGER.info(getXMLFileName() + " is valid");
		} catch (SAXException e) {
			LOGGER.error(getXMLFileName() + " sax error: " + e.getMessage());
		} catch (ParserConfigurationException e) {
			LOGGER.error(getXMLFileName() + " config error: " + e.getMessage());
		} catch (IOException e) {
			LOGGER.error("I/O error: " + e.getMessage());
			;
		}
	}
}
