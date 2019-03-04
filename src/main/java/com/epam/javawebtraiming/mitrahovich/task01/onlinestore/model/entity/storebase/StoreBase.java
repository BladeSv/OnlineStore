package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase;

import java.io.Serializable;
import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.WrongSetStoreBaseExeption;

// реализавать свои данные
// 
public class StoreBase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3685331886334816171L;
	private Device[] deviceBase;

	/**
	 * 
	 */
	public StoreBase() {
		this.deviceBase = new Device[10];

	}

	/**
	 * @param deviceBase
	 */
	public StoreBase(Device[] deviceBase) {
		this.deviceBase = deviceBase;
	}

	public Device[] getDeviceBase() {
		return Arrays.copyOf(deviceBase, deviceBase.length);
	}

	public void setDeviceBase(Device[] deviceBase) throws WrongSetStoreBaseExeption {
		if (deviceBase != null) {
			this.deviceBase = deviceBase;
		} else {
			throw new WrongSetStoreBaseExeption();
		}
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
		StoreBase other = (StoreBase) obj;
		if (!Arrays.equals(deviceBase, other.deviceBase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < deviceBase.length; i++) {
			if (deviceBase[i] != null) {
				sb.append(deviceBase[i]);
				sb.append("\n");
			}

		}
		return sb + "";
	}

}
