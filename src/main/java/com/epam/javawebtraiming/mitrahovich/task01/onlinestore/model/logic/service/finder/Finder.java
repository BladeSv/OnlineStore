package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.finder;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.DaoBase;

public interface Finder<T> {
	T find(DaoBase<T> base, Comparator<T> comp);

}
