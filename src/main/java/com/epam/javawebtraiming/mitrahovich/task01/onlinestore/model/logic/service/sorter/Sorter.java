package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sorter;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.service.CantSortException;

public interface Sorter<T> {
	Base<T> sort(DaoBase<T> base, Comparator<T> comp) throws CantSortException;

}
