package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sort;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public interface ISort {
	void sortByPrice(StoreBase storeBase);

	void sortByManufacturerName(StoreBase storeBase);
}