package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton;

public interface IMyCollection<T> extends Iterable<T> {
	boolean add(T t);

	boolean remove(T t);

	boolean contains(T t);

	boolean isEmpty();

	int size();

	boolean clear();

	T get(int index);

	IMyCollection<T> copy();

}
