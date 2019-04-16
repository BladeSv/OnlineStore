package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util;

import java.util.ResourceBundle;

public class PropertiesManager {

	public static final ResourceBundle rb;

	static {
		rb = ResourceBundle.getBundle("config");
	}

	public static String getStatus() {

		return rb.getString("status");
	}

	public static String getInputTextFileName() {

		return rb.getString("input_text");
	}

	public static String getOutputTextFileName() {

		return rb.getString("output_text");
	}

	public static String getFileName() {

		return rb.getString("file_name");
	}

	public static String getXMLFileName() {

		return rb.getString("input_xml");
	}

	public static String getXMLSchemaFileName() {

		return rb.getString("input_xml_schema");
	}
}
