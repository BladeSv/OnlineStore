package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.factory;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getStatus;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer.IPrinter;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer.Printer;

public class PrinterFactory {
	private static IPrinter<Device> printer;

	private PrinterFactory() {
		super();

	}

	public static IPrinter<Device> newInstance() {
		switch (getStatus()) {
		case "collection":

			printer = new Printer<Device>();

			break;
		default:
			System.out.println("The online store product base didn't creat");

		}
		return printer;
	}
}
