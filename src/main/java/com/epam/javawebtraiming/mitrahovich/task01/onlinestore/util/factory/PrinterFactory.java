package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.factory;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getStatus;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer.ConsolePrinter;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer.IPrinter;

public class PrinterFactory {
	private static IPrinter<Device> printer;

	private PrinterFactory() {
		super();

	}

	public static IPrinter<Device> newInstance() {
		switch (getStatus()) {
		case "collection":

			printer = new ConsolePrinter<Device>();

			break;

		}
		return printer;
	}
}
