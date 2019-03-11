package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;

public class Printer<T> implements IPrinter<T> {

	@Override
	public void print(Base<T> base) {
		System.out.println("Online store products base:");
		System.out.println(base.toString());

	}
}
