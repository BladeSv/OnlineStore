package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton;

public interface Stack<T> extends Collection<T> {

	boolean push(T t);

	T pop();

	T peek();
}
