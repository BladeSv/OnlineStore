package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.mainapp;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.controller.MainController;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.dao.NotAddElementBaseException;

public class MainApp {

	public static void main(String[] args) throws IndexOutOfRangeException, NotAddElementBaseException {
		MainController controller = new MainController();
		controller.run();

	}

}
