package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer;

public class ConsolePrinter<T> implements IPrinter<T> {

	@Override
	public void print(Object obj) {

		System.out.println(obj.toString());

	}
}
