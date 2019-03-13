package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.collection.interfacecollection;

public interface Stack<T> extends Collection<T> {

	boolean push(T t);

	T pop();

	T peek();
}
