package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sorter.implementation;

import java.util.Comparator;

import org.apache.log4j.Logger;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.service.CantSortException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.sorter.Sorter;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;

public class SorterCollection<T extends Device> implements Sorter<T> {

	private static final Logger log = Logger.getRootLogger();

	@Override
	public Base<T> sort(DaoBase<T> base, Comparator<T> comp) throws CantSortException {
		Base<T> tempBase = base.getAll();
		log.trace("in sort base -" + tempBase);
		for (int i = 0; i < tempBase.getBase().size(); i++) {
			for (int j = 0; j < tempBase.getBase().size(); j++) {

				try {

					if (comp.compare(tempBase.get(i), tempBase.get(j)) < 0)

					{
						T temp = tempBase.get(i);

						tempBase.set(i, tempBase.get(j));

						tempBase.set(j, temp);
					}
				} catch (IndexOutOfRangeException e) {
					throw new CantSortException(e.getCause());

				}
			}
		}
		log.trace("return sort base -" + tempBase);
		return tempBase;

	}

}
