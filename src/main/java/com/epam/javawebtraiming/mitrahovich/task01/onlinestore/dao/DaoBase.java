package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.exception.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.exception.NotFoundElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.exception.NotRemoveElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;

public interface DaoBase<T> {
	boolean add(T device) throws NotAddElementBaseException;

	boolean remove(T device) throws NotRemoveElementBaseException;

	boolean removeById(int id) throws NotRemoveElementBaseException;

	T getById(int id) throws NotFoundElementException;

	Object[] toArray();

	Base<T> getAll();

}
