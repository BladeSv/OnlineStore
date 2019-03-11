package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.daobase.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.daobase.NotFoundElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.daobase.NotRemoveElementBaseException;

public interface IDaoBase<T> {
	boolean add(T device) throws NotAddElementBaseException;

	boolean remove(T device) throws NotRemoveElementBaseException;

	boolean removeById(int id) throws NotRemoveElementBaseException;

	T getById(int id) throws NotFoundElementException;

	Object[] toArray();

	Base<T> getAll();
}
