package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.controller;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoStoreBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.find.FindArray;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.find.IFind;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sort.ISort;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sort.SortArray;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sum.ISum;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sum.SumArray;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.AddEntitiesInBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.factory.DaoStoreBaseFactory;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.factory.PrinterFactory;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer.IPrinter;

public class MainController {

	public void run() {

		IDaoStoreBase daoStoreBase = DaoStoreBaseFactory.newInstance();
		IPrinter printet = PrinterFactory.newInstance();
		ISort sort = new SortArray();
		ISum sum = new SumArray();
		IFind find = new FindArray();

		AddEntitiesInBase.add(daoStoreBase);

		printet.print(daoStoreBase.getAll());
		System.out.printf("%.2f", sum.sumPrice(daoStoreBase.getAll()));
		System.out.println();
		System.out.println();

		sort.sortByPrice(daoStoreBase.getAll());
		printet.print(daoStoreBase.getAll());
		sort.sortByManufacturerName(daoStoreBase.getAll());
		printet.print(daoStoreBase.getAll());

		System.out.println("max: " + find.findMaxPrice(daoStoreBase.getAll()));
		System.out.println("min: " + find.findMinPrice(daoStoreBase.getAll()));
	}

}
