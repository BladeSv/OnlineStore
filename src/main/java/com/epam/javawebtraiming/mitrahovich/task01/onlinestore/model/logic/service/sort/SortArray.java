package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sort;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyIndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.service.CantSortException;

public class SortArray<T extends Device> implements ISort<T> {

	@Override
	public Base<T> sort(IDaoBase<T> base, Comparator<T> comp) throws CantSortException {
		Base<T> tempBase = base.getAll();
		T temp = null;
		for (int i = 0; i < tempBase.getDeviceBase().size(); i++) {
			for (int j = 0; j < tempBase.getDeviceBase().size(); j++) {
				try {
					if (((tempBase.getDeviceBase().get(i) != null) && (tempBase.getDeviceBase().get(j) != null))
							&& (comp.compare(tempBase.getDeviceBase().get(i), tempBase.getDeviceBase().get(j)) < 0))

					{
						temp = tempBase.getDeviceBase().get(i);

						tempBase.getDeviceBase().set(i, tempBase.getDeviceBase().get(j));

						tempBase.getDeviceBase().set(j, temp);
					}
				} catch (MyIndexOutOfRangeException e) {
					throw new CantSortException(e.getCause());

				}
			}
		}

		return tempBase;

	}

}
