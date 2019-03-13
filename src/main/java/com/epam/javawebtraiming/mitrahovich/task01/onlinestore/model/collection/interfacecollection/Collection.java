package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.collection.interfacecollection;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.NotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.NotInCollectionException;

public interface Collection<T> extends Iterable<T> {
	boolean add(T t);

	boolean set(int index, T t) throws IndexOutOfRangeException;

	void remove(T t) throws NotInCollectionException;

	boolean contains(T t);

	boolean isEmpty();

	int size();

	void clear();

	T get(int index) throws IndexOutOfRangeException;

	Collection<T> copy() throws NotCopybleElementException;

	Object[] toArray();

}
