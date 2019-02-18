package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.creator;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getStatus;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer.IPrinter;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer.Printer;

public class PrinterFactory {
	private static IPrinter printer;

	private PrinterFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static IPrinter newInstance() {
		switch (getStatus()) {
		case "Array":

			printer = new Printer();

			break;
		default:
			System.out.println("The online store product base didn't creat");

		}
		return printer;
	}
}
