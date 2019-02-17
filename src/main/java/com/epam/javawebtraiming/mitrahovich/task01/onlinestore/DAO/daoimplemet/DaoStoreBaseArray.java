package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.daoimplemet;

import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoStoreBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.storebase.StoreBase;

public class DaoStoreBaseArray implements IDaoStoreBase {

	private Device[] deviceBase;

	public DaoStoreBaseArray() {
		super();
		this.deviceBase = new Device[10];
	}

	public DaoStoreBaseArray(StoreBase storeBase) {
		super();
		this.deviceBase = storeBase.getDeviceBase();
	}

	@Override
	public void add(Device device) {

		if (device != null) {
			device.toString();
//			int index = Arrays.binarySearch(deviceBase, null);
//
//			if (index != -1) {
//				deviceBase[index] = device;
//			} else {
//
//				Arrays.copyOf(deviceBase, (deviceBase.length * 2));
//				index = Arrays.binarySearch(deviceBase, null);
//				deviceBase[index] = device;
//
//			}

		}

	}

	@Override
	public void removeById(int id) {
		if (id > 0) {
			for (int i = 0; i < deviceBase.length; i++) {
				if (deviceBase[i].getId() == id) {
					deviceBase[i] = null;
				}
			}
		}
	}

	@Override
	public Device getById(int id) {
		if (id > 0) {
			for (int i = 0; i < deviceBase.length; i++) {
				if (deviceBase[i].getId() == id) {
					return deviceBase[i];
				}
			}
		}
		return null;
	}

	@Override
	public Device[] getAll() {
		return deviceBase;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(deviceBase);
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
		if (!Arrays.equals(deviceBase, other.deviceBase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StoreCollection [deviceBase=" + Arrays.toString(deviceBase) + "]";
	}

}
