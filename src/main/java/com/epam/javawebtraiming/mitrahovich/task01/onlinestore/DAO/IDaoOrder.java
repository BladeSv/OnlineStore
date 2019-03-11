package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.order.Order;

public interface IDaoOrder<T> {
	void add(Order order);

	void remote(Order order);

}
