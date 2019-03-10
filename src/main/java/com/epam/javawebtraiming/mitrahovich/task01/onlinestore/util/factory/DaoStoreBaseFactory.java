package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.factory;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getStatus;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.daoimplemet.DaoStoreBaseCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation.arraycollection.MyArrayQueue;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.Base;

public class DaoStoreBaseFactory {

	private static DaoStoreBaseCollection<Device> storeBase;

	private DaoStoreBaseFactory() {
		super();

	}

	public static IDaoBase newInstance() {
		switch (getStatus()) {
		case "Collertion":

			storeBase = new DaoStoreBaseCollection<Device>(new Base<Device>(new MyArrayQueue<Device>()));

			break;
		// case "Serializable":
		// storeBase = new DaoStoreBaseArray(SerializableStoreBase.inputStoreBase());
		// break;
		default:
			System.out.println("The online store product base didn't creat");

		}
		return storeBase;
	}

}
