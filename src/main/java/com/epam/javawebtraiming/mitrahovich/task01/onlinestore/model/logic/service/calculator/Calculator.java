package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.calculator;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.DaoBase;

public interface Calculator<T> {
	BigDecimal sumPrice(DaoBase<T> base);
}
