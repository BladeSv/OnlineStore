package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sort;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.service.CantSortException;

public interface ISort<T> {
	Base<T> sort(IDaoBase<T> base, Comparator<T> comp) throws CantSortException;

}
