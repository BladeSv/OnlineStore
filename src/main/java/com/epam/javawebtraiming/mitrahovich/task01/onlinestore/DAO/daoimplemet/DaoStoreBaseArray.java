package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.daoimplemet;

import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoStoreBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.StoreBase;

public class DaoStoreBaseArray implements IDaoStoreBase {

	private StoreBase storeBase;
	private static int id = 1;

	public DaoStoreBaseArray(StoreBase storeBase) {
		super();
		this.storeBase = storeBase;

	}

	@Override
	public void add(Device device) {

		if (device != null) {
			int i = 0;
			device.setId(id);
			while (i < storeBase.getDeviceBase().length) {
				if (storeBase.getDeviceBase()[i] == null) {

					storeBase.getDeviceBase()[i] = device;
					id++;
					return;
				}
				i++;

			}
			if (i == storeBase.getDeviceBase().length) {

				Device[] temp = Arrays.copyOf(storeBase.getDeviceBase(), (i * 2));
				temp[i] = device;
				device.setId(id);
				storeBase.setDeviceBase(temp);
				id++;
			}

		}

	}

	@Override
	public void removeById(int id) {
		if (id > 0) {
			for (int i = 0; i < storeBase.getDeviceBase().length; i++) {
				if (storeBase.getDeviceBase()[i].getId() == id) {
					storeBase.getDeviceBase()[i] = null;
				}
			}
		}
	}

	@Override
	public Device getById(int id) {
		if (id > 0) {
			for (int i = 0; i < storeBase.getDeviceBase().length; i++) {
				if (storeBase.getDeviceBase()[i].getId() == id) {
					return storeBase.getDeviceBase()[i];
				}
			}
		}
		return null;
	}

	@Override
	public StoreBase getAll() {
		return storeBase;

	}

}
