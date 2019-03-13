package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.dao.implementation;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.dao.DaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base.Base;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.NotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetIdException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.dao.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.dao.NotFoundElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.dao.NotRemoveElementBaseException;

public class DaoStoreBaseCollection<T extends Device> implements DaoBase<T> {

	private Base<T> base;
	private static int id = 1;

	public DaoStoreBaseCollection(Base<T> base) {
		this.base = base;
	}

	@Override
	public boolean add(T device) throws NotAddElementBaseException {
		boolean check = false;
		try {
			if (device != null) {
				device.setId(id);
				id++;
				check = base.add(device);
			} else {

				throw new NotAddElementBaseException();
			}
		} catch (WrongSetIdException e) {

			throw new NotAddElementBaseException(e.getCause());
		}
		return check;
	}

	@Override
	public boolean remove(T device) throws NotRemoveElementBaseException {
		boolean check = false;
		if (device != null) {
			try {
				base.remove(device);
			} catch (NotInCollectionException e) {

				throw new NotRemoveElementBaseException(e.getCause());
			}

		}

		return check;
	}

	@Override
	public boolean removeById(int id) throws NotRemoveElementBaseException {
		boolean check = false;
		try {
			base.remove(base.get(id));
			check = true;
		} catch (NotInCollectionException | IndexOutOfRangeException e) {

			throw new NotRemoveElementBaseException(e.getCause());
		}
		return check;
	}

	@Override
	public T getById(int id) throws NotFoundElementException {

		try {
			return base.get(id);
		} catch (IndexOutOfRangeException e) {

			throw new NotFoundElementException(e.getCause());
		}
	}

	@Override
	public Base<T> getAll() {

		return base;
	}

	@Override
	public Object[] toArray() {

		return base.toArray();
	}

	@Override
	public String toString() {

		return base.toString();
	}

}
