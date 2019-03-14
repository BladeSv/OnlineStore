package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotInCollectionException;

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
