package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.collectionimplemet;

import java.util.Arrays;
import java.util.List;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.DAO;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.Device;

public class StoreCollection implements DAO {

	private Device[] deviceBase;

	public StoreCollection() {
		super();
		this.deviceBase = new Device[10];
	}

	public StoreCollection(Device[] deviceBase) {
		super();
		this.deviceBase = deviceBase;
	}

	@Override
	public void add(Device device) {

		if (device != null) {
			int index = Arrays.binarySearch(deviceBase, null);

			if (index != -1) {
				deviceBase[index] = device;
			} else {

				Arrays.copyOf(deviceBase, (deviceBase.length * 2));
				index = Arrays.binarySearch(deviceBase, null);
				deviceBase[index] = device;

			}

		}

	}

	@Override
	public void removeById(int id) {
		for (int i = 0; i < deviceBase.length; i++) {
			if (deviceBase[i].getId() == id) {
				deviceBase[i] = null;
			}

		}
	}

	@Override
	public Device getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Device> getAll() {
		// TODO Auto-generated method stub
		return null;
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
		StoreCollection other = (StoreCollection) obj;
		if (!Arrays.equals(deviceBase, other.deviceBase))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StoreCollection [deviceBase=" + Arrays.toString(deviceBase) + "]";
	}

}
