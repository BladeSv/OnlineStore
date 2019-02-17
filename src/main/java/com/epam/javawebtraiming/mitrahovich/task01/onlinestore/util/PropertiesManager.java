package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util;

import java.util.ResourceBundle;
public class PropertiesManager {
	
public static final ResourceBundle rb;

static {
	rb=ResourceBundle.getBundle("config");
}

public static String getStatus() {
	
	
	return rb.getString("status");
}



}
