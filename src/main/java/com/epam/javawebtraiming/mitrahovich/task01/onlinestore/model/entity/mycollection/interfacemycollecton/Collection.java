package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyIndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotInCollectionException;

public interface Collection<T> extends Iterable<T> {
	boolean add(T t);

	boolean set(int index, T t) throws MyIndexOutOfRangeException;

	void remove(T t) throws MyNotInCollectionException;

	boolean contains(T t);

	boolean isEmpty();

	int size();

	void clear();

	T get(int index) throws MyIndexOutOfRangeException;

	Collection<T> copy() throws MyNotCopybleElementException;

	Object[] toArray();

}
