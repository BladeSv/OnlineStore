package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.comparator;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;

public class SortByPriceDecrease<T extends Device> implements Comparator<T> {

	public SortByPriceDecrease() {

	}

	@Override
	public int compare(T o1, T o2) {
		int result = 0;
		if (o1 != null && o2 != null) {
			result = o2.getPrice().compareTo(o1.getPrice());
		} else if (o1 != null && o2 == null) {
			result = 1;
		} else if (o2 != null && o1 == null) {

			result = -1;
		}
		return result;
	}
}
