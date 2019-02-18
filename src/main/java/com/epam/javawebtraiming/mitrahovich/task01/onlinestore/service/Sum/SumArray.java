package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.service.Sum;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.storebase.StoreBase;

public class SumArray implements ISum {

	public double sumPrice(StoreBase storeBase) {
		double sum = 0;
		int i = 0;
		while (storeBase.getDeviceBase()[i] != null) {
			sum = +storeBase.getDeviceBase()[i].getPrice();

			i++;
		}

		return sum;
	}
}
