package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.factory;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getStatus;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.daoimplemet.DaoStoreBaseCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;

public class DaoStoreBaseFactory {

	private static IDaoBase<Device> storeBase;

	private DaoStoreBaseFactory() {
		super();

	}

	public static IDaoBase newInstance() {

		switch (getStatus()) {
		case "collection":

			storeBase = new DaoStoreBaseCollection(new Base<Device>());

			break;

		default:
			System.out.println("The online store product base didn't creat");

		}
		return storeBase;
	}

}
