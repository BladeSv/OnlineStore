package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sort;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.WrongSetStoreBaseExeption;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public class SortArray implements ISort {

	public void sortByPrice(StoreBase storeBase) {
		int j;
		Device temp;
		Device[] deviceBase = storeBase.getDeviceBase();

		for (int i = 0; i < deviceBase.length - 1; i++) {
			if (((deviceBase[i] != null) && (deviceBase[i + 1] != null))

					&& (deviceBase[i].getPrice().compareTo(deviceBase[i + 1].getPrice()) > 0)) {
				temp = deviceBase[i + 1];
				deviceBase[i + 1] = storeBase.getDeviceBase()[i];
				j = i;
				while (j > 0 && (deviceBase[j - 1].getPrice().compareTo(temp.getPrice()) > 0)) {
					deviceBase[j] = deviceBase[j - 1];
					j--;
				}
				deviceBase[j] = temp;
			}
		}
		try {
			storeBase.setDeviceBase(deviceBase);
		} catch (WrongSetStoreBaseExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sortByManufacturerName(StoreBase storeBase) {
		Device temp;
		for (int i = 0; i < storeBase.getDeviceBase().length; i++) {
			for (int j = 0; j < storeBase.getDeviceBase().length; j++) {
				if (((storeBase.getDeviceBase()[i] != null) && (storeBase.getDeviceBase()[j] != null)) && (storeBase.getDeviceBase()[i].getManufacturer().compareToIgnoreCase(storeBase.getDeviceBase()[j].getManufacturer()) < 0))

				{
					temp = storeBase.getDeviceBase()[i];
					storeBase.getDeviceBase()[i] = storeBase.getDeviceBase()[j];
					storeBase.getDeviceBase()[j] = temp;

				}

			}
		}

	}

}
