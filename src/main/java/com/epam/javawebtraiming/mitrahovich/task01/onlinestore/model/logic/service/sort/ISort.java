package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sort;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;

public interface ISort {
	void sortByPrice(IDaoBase<T> base, Comparator<T> comp);

	void sortByManufacturerName(IDaoBase base);
}
