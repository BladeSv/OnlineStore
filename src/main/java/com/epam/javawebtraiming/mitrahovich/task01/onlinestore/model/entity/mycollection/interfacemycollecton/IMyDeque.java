package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton;

public interface IMyDeque<T> extends IMyQueue<T> {
	boolean addFist(T t);

	T poolLast();

	T peekLast();
}
