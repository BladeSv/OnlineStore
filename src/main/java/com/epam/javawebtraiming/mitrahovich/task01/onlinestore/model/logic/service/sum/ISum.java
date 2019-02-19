package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sum;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public interface ISum {
	BigDecimal sumPrice(StoreBase storeBase);
}
