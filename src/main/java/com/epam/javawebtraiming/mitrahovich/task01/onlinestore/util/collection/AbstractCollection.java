package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection;

import java.util.Iterator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection.Collection;

public abstract class AbstractCollection<T> implements Collection<T> {

	protected int size = 0;

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
	public int size() {

		return size;
	}

	@Override
	public boolean isEmpty() {

		return size() == 0;

	}

	protected boolean checkIndexRange(int index) throws IndexOutOfRangeException {
		if ((index >= 0) && (index < size)) {
			return true;
		} else {
			throw new IndexOutOfRangeException();
		}

	}

}
