package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sum;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;

public interface ISum<T> {
	BigDecimal sumPrice(IDaoBase<T> base);
}
