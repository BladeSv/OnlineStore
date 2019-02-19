package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.find;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public class FindArray implements IFind {

	@Override
	public Device findMaxPrice(StoreBase storeBase) {
		Device temp = null;
		BigDecimal max = null;
		if (storeBase != null) {
			if (storeBase.getDeviceBase()[0] != null) {
				temp = storeBase.getDeviceBase()[0];
				max = storeBase.getDeviceBase()[0].getPrice();
			}
			for (int i = 0; i < storeBase.getDeviceBase().length; i++) {
				if (storeBase.getDeviceBase()[i] != null) {
					if (storeBase.getDeviceBase()[i].getPrice().compareTo(max) > 0) {
						max = storeBase.getDeviceBase()[i].getPrice();
						temp = storeBase.getDeviceBase()[i];
					}

				}

			}
		}
		return temp;
	}

	@Override
	public Device findMinPrice(StoreBase storeBase) {
		Device temp = null;
		BigDecimal min = null;
		if (storeBase != null) {
			if (storeBase.getDeviceBase()[0] != null) {
				temp = storeBase.getDeviceBase()[0];
				min = storeBase.getDeviceBase()[0].getPrice();
			}
			for (int i = 0; i < storeBase.getDeviceBase().length; i++) {
				if (storeBase.getDeviceBase()[i] != null) {
					if (storeBase.getDeviceBase()[i].getPrice().compareTo(min) < 0) {
						min = storeBase.getDeviceBase()[i].getPrice();
						temp = storeBase.getDeviceBase()[i];
					}

				}

			}
		}
		return temp;

	}
}
