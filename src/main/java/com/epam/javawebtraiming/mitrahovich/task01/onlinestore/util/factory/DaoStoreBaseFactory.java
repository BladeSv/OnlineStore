package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.factory;

import static com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.PropertiesManager.getStatus;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.implementation.DaoStoreBaseCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.basedecatator.BaseSerialization;

public class DaoStoreBaseFactory {

	private static DaoBase<Device> storeBase;

	private DaoStoreBaseFactory() {
		super();

	}

	public static DaoBase newInstance() {

		switch (getStatus()) {
		case "collection":

			storeBase = new DaoStoreBaseCollection(new Base<Device>());

			break;

		case "serialization":

			storeBase = new DaoStoreBaseCollection(new BaseSerialization(new Base<Device>()));

			break;
		}
		return storeBase;
	}

}
