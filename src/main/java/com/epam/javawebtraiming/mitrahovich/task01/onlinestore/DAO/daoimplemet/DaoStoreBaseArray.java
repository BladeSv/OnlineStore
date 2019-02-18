package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.daoimplemet;

import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoStoreBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.storebase.StoreBase;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((storeBase == null) ? 0 : storeBase.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DaoStoreBaseArray other = (DaoStoreBaseArray) obj;
		if (storeBase == null) {
			if (other.storeBase != null)
				return false;
		} else if (!storeBase.equals(other.storeBase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DaoStoreBaseArray [storeBase=" + storeBase + "]";
	}

}
