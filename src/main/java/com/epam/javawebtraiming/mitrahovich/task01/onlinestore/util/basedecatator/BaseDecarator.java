package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.basedecatator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.base.WrongSetBaseExeption;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection.Collection;

public abstract class BaseDecarator<T> extends Base<T> {
	protected Base base;

	public BaseDecarator(Base base) {
		this.base = base;

	}

	public BaseDecarator(Collection<T> base) {
		super(base);

	}

	@Override
	public abstract boolean add(T t);

	@Override
	public abstract boolean set(int index, T t) throws IndexOutOfRangeException;

	@Override
	public abstract boolean remove(T t) throws NotInCollectionException;

	@Override
	public abstract T get(int index) throws IndexOutOfRangeException;

	@Override
	public abstract Collection<T> getBase();

	@Override
	public abstract void setBase(Collection<T> base) throws WrongSetBaseExeption;

	@Override
	public abstract Object[] toArray();

	@Override
	public abstract String toString();

}
