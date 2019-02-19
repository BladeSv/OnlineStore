package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.find;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public interface IFind {
	Device findMaxPrice(StoreBase storeBase);

	Device findMinPrice(StoreBase storeBase);
}
