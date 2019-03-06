package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton;

import java.util.Queue;

public interface IMyDeque<T> extends Queue<T> {
	boolean addFist(T t);

	T poolLast();

	T peekLast();
}
