package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.mainapp;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.controller.MainController;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.exception.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;

public class MainApp {

	public static void main(String[] args) throws IndexOutOfRangeException, NotAddElementBaseException {
		MainController controller = new MainController();
		controller.run();

	}

}
