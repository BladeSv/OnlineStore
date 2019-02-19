package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public class Printer implements IPrinter {

	@Override
	public void print(StoreBase storeBase) {
		System.out.println("Online store products base:");
		System.out.println(storeBase.toString());

	}
}
