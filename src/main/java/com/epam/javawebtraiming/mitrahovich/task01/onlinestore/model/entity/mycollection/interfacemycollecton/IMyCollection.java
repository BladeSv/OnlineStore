package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyIndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotInCollectionException;

public interface IMyCollection<T> extends Iterable<T> {
	boolean add(T t);

	boolean remove(T t) throws MyNotInCollectionException;

	boolean contains(T t);

	boolean isEmpty();

	int size();

	boolean clear();

	T get(int index) throws MyIndexOutOfRangeException;

	IMyCollection<T> copy() throws MyNotCopybleElementException;

}
