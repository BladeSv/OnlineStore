package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.service.sort;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.storebase.StoreBase;

public interface ISort {
	void sortByPrice(StoreBase storeBase);

	void sortByManufacturerName(StoreBase storeBase);
}
