package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.storebase;

import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.Device;

public class StoreBase {
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
		return deviceBase;
	}

	public void setDeviceBase(Device[] deviceBase) {
		this.deviceBase = deviceBase;
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
		return "StoreBase [deviceBase=" + Arrays.toString(deviceBase) + "]";
	}

}
