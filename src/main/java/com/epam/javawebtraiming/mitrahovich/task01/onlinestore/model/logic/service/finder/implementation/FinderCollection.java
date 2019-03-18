package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.finder.implementation;

import java.util.Comparator;

import org.apache.log4j.Logger;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.logic.service.finder.Finder;

public class FinderCollection<T extends Device> implements Finder<T> {
	private static final Logger log = Logger.getRootLogger();

	@Override
	public T find(DaoBase<T> base, Comparator<T> comp) {

		T temp = null;
		Base<T> tempBase = base.getAll();

		for (T dev : tempBase.getBase()) {
			log.trace("temp device -" + dev);
			if (comp.compare(dev, temp) > 0) {
				temp = dev;
			}
		}

		return temp;
	}

}
