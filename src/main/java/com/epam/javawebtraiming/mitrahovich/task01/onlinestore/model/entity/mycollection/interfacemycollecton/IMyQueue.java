package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton;

public interface IMyQueue<T> extends IMyCollection<T> {
	T peek();

	T pool();

}
