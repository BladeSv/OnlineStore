package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.dao;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.dao.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.dao.NotFoundElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.dao.NotRemoveElementBaseException;

public interface DaoBase<T> {
	boolean add(T device) throws NotAddElementBaseException;

	boolean remove(T device) throws NotRemoveElementBaseException;

	boolean removeById(int id) throws NotRemoveElementBaseException;

	T getById(int id) throws NotFoundElementException;

	Object[] toArray();

	Base<T> getAll();

}
