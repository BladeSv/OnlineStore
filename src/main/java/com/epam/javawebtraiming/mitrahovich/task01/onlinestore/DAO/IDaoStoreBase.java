package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public interface IDaoStoreBase {
	boolean add(Device device);

	boolean removeById(int id);

	Device getById(int id);

	StoreBase getAll();

}
