package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.controller;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.exception.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.comparator.SortByPriceIncrease;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.service.CantSortException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.calculator.Calculator;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.calculator.implemenatation.CalculatorCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.finder.Finder;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.finder.implementation.FinderCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sorter.Sorter;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sorter.implementation.SorterCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.CreatedEntityAdd;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.factory.DaoStoreBaseFactory;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.factory.PrinterFactory;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer.IPrinter;

public class MainController {

	public void run() throws NotAddElementBaseException {

		DaoBase<Device> daoStoreBase = DaoStoreBaseFactory.newInstance();
		IPrinter<Device> printer = PrinterFactory.newInstance();
		Sorter<Device> sort = new SorterCollection();
		Calculator<Device> sum = new CalculatorCollection();
		Finder<Device> find = new FinderCollection();
		Comparator<Device> comp = new SortByPriceIncrease<>();

		CreatedEntityAdd.add(daoStoreBase);

		printer.print(daoStoreBase);

		printer.print(String.format("%.2f", sum.sumPrice(daoStoreBase)));

		try {
			printer.print(sort.sort(daoStoreBase, comp));
		} catch (CantSortException e) {

			e.printStackTrace();
		}

		printer.print("min: " + find.find(daoStoreBase, comp));

	}

}
