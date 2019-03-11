package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.controller;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.comparator.SortByPriceIncrease;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.daobase.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.service.CantSortException;
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

	public void run() throws NotAddElementBaseException {

		IDaoBase<Device> daoStoreBase = DaoStoreBaseFactory.newInstance();
		IPrinter<Device> printet = PrinterFactory.newInstance();
		ISort<Device> sort = new SortArray();
		ISum<Device> sum = new SumArray();
		IFind<Device> find = new FindArray();
		Comparator<Device> comp = new SortByPriceIncrease<>();
		AddEntitiesInBase.add(daoStoreBase);

		printet.print(daoStoreBase.getAll());
		System.out.printf("%.2f", sum.sumPrice(daoStoreBase));
		System.out.println();
		System.out.println();

		printet.print(daoStoreBase.getAll());
		System.out.println(daoStoreBase.toArray());
		try {
			printet.print(sort.sort(daoStoreBase, comp));
		} catch (CantSortException e) {

			e.printStackTrace();
		}

		System.out.println("min: " + find.find(daoStoreBase, comp));
		// SerializableStoreBase.outputStoreBase(daoStoreBase.getAll());
		// StoreBase sb = SerializableStoreBase.inputStoreBase();
		// System.out.println(sb);

	}

}
