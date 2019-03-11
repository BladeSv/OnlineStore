package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.find;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;

public class FindArray<T extends Device> implements IFind<T> {

	@Override
	public T find(IDaoBase<T> base, Comparator<T> comp) {

		T temp = null;
		Base<T> tempBase = base.getAll();

		for (T dev : tempBase.getDeviceBase()) {
			if (comp.compare(dev, temp) > 0) {
				temp = dev;
			}
		}

		return temp;
	}

}
