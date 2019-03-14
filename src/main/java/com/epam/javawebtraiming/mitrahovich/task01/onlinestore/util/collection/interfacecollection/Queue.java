package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection;

public interface Queue<T> extends Collection<T> {

	boolean offer(T t);

	T peek();

	T pool();

}
