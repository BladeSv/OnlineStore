package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase;

import java.io.Serializable;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyIndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.WrongSetStoreBaseExeption;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation.arraycollection.MyArrayQueue;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.IMyCollection;

/**
 * @author Mitrahovich
 *
 */
public class Base<T> implements Serializable {

	private static final long serialVersionUID = 5925438773205805016L;
	protected IMyCollection<T> base;

	public Base() {
		base = new MyArrayQueue<>();
	}

	public Base(IMyCollection<T> base) {
		this.base = base;
	}

	public IMyCollection<T> getDeviceBase() throws MyNotCopybleElementException {
		return base.copy();
	}

	public void setDeviceBase(IMyCollection<T> base) throws WrongSetStoreBaseExeption {
		if (base != null) {
			this.base = base;
		} else {
			throw new WrongSetStoreBaseExeption();
		}

	}

	public boolean add(T t) {
		if (t != null) {
			base.add(t);
			return true;
		} else {
			return false;
		}
	}

	public boolean remove(T t) throws MyNotInCollectionException {

		if (t != null) {
			base.remove(t);
			return true;
		} else {
			return false;
		}

	}

	public T get(int index) throws MyIndexOutOfRangeException {

		return base.get(index);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (T t : base) {
			if (t != null) {
				sb.append(t);
				sb.append("\n");
			}

		}

		return sb + "";
	}
}
