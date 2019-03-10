package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.daoimplemet;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.DAO.IDaoBase;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyIndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device.WrongSetIdException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.daobase.NotAddElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.daobase.NotFoundElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.daobase.NotRemoveElementBaseException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase.Base;

public class DaoStoreBaseCollection<T extends Device> implements IDaoBase<T> {

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
			} catch (MyNotInCollectionException e) {

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
		} catch (MyNotInCollectionException | MyIndexOutOfRangeException e) {

			throw new NotRemoveElementBaseException(e.getCause());
		}
		return check;
	}

	@Override
	public T getById(int id) throws NotFoundElementException {

		try {
			return base.get(id);
		} catch (MyIndexOutOfRangeException e) {

			throw new NotFoundElementException(e.getCause());
		}
	}

	@Override
	public Base<T> getAll() {

		return base;
	}

}
