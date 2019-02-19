package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sum;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public class SumArray implements ISum {

	public BigDecimal sumPrice(StoreBase storeBase) {
		BigDecimal sum = new BigDecimal("0");
		int i = 0;
		while (storeBase.getDeviceBase()[i] != null) {
			sum.add(storeBase.getDeviceBase()[i].getPrice());

			i++;
		}

		return sum;
	}
}
