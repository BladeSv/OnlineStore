package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.factory;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getStatus;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoStoreBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.daoimplemet.DaoStoreBaseArray;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public class DaoStoreBaseFactory {
	private static IDaoStoreBase storeBase;

	private DaoStoreBaseFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static IDaoStoreBase newInstance() {
		switch (getStatus()) {
		case "Array":

			storeBase = new DaoStoreBaseArray(new StoreBase());

			break;
		default:
			System.out.println("The online store product base didn't creat");

		}
		return storeBase;
	}

}
