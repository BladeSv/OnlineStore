package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sort;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public class SortArray implements ISort {

	public void sortByPrice(StoreBase storeBase) {
		int j;
		Device temp;

		for (int i = 0; i < storeBase.getDeviceBase().length - 1; i++) {
			if (((storeBase.getDeviceBase()[i] != null) && (storeBase.getDeviceBase()[i + 1] != null))

					&& (storeBase.getDeviceBase()[i].getPrice()
							.compareTo(storeBase.getDeviceBase()[i + 1].getPrice()) > 0)) {
				temp = storeBase.getDeviceBase()[i + 1];
				storeBase.getDeviceBase()[i + 1] = storeBase.getDeviceBase()[i];
				j = i;
				while (j > 0 && (storeBase.getDeviceBase()[j - 1].getPrice().compareTo(temp.getPrice()) > 0)) {
					storeBase.getDeviceBase()[j] = storeBase.getDeviceBase()[j - 1];
					j--;
				}
				storeBase.getDeviceBase()[j] = temp;
			}
		}

	}

	public void sortByManufacturerName(StoreBase storeBase) {
		Device temp;
		for (int i = 0; i < storeBase.getDeviceBase().length; i++) {
			for (int j = 0; j < storeBase.getDeviceBase().length; j++) {
				if (((storeBase.getDeviceBase()[i] != null) && (storeBase.getDeviceBase()[j] != null))
						&& (storeBase.getDeviceBase()[i].getManufacturer()
								.compareToIgnoreCase(storeBase.getDeviceBase()[j].getManufacturer()) < 0))

				{
					temp = storeBase.getDeviceBase()[i];
					storeBase.getDeviceBase()[i] = storeBase.getDeviceBase()[j];
					storeBase.getDeviceBase()[j] = temp;

				}

			}
		}

	}

}
