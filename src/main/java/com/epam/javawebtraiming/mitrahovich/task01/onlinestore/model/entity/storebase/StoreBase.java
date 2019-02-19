package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase;

import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;

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
