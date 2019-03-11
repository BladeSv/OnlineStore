package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.view.printer;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;

public interface IPrinter<T> {
	void print(Base<T> base);
}
