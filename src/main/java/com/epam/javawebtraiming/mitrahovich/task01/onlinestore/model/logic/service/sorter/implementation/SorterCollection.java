package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sorter.implementation;

import java.util.Comparator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.service.CantSortException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sorter.Sorter;

public class SorterCollection<T extends Device> implements Sorter<T> {

	@Override
	public Base<T> sort(DaoBase<T> base, Comparator<T> comp) throws CantSortException {
		Base<T> tempBase = base.getAll();

		for (int i = 0; i < tempBase.getBase().size(); i++) {
			for (int j = 0; j < tempBase.getBase().size(); j++) {
				try {
					if (((tempBase.getBase().get(i) != null) && (tempBase.getBase().get(j) != null))
							&& (comp.compare(tempBase.getBase().get(i), tempBase.getBase().get(j)) < 0))

					{
						T temp = tempBase.getBase().get(i);

						tempBase.getBase().set(i, tempBase.getBase().get(j));

						tempBase.getBase().set(j, temp);
					}
				} catch (IndexOutOfRangeException e) {
					throw new CantSortException(e.getCause());

				}
			}
		}

		return tempBase;

	}

}
