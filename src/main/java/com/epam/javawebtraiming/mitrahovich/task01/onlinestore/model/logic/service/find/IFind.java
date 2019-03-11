package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.find;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;

public interface IFind<T> {
	T find(IDaoBase<T> base, Comparator<T> comp);

}
