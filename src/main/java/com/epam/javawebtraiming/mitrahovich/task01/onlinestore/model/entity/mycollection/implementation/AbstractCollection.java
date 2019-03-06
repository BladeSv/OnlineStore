package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation;

import java.util.Iterator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.IMyCollection;

public abstract class AbstractCollection<T> implements IMyCollection<T> {

	@Override
	public boolean contains(T t) {
		Iterator<T> iter = iterator();
		while (iter.hasNext()) {
			if (iter.next() == t) {

				return true;
			}

		}
		return false;
	}

	@Override
	public boolean isEmpty() {

		return size() == 0;

	}

}
