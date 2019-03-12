package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base;

import java.io.Serializable;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyIndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.WrongSetStoreBaseExeption;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation.arraycollection.ArrayList;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.Collection;

/**
 * @author Mitrahovich
 *
 */
public class Base<T> implements Serializable {

	private static final long serialVersionUID = 5925438773205805016L;
	protected Collection<T> base;

	public Base() {
		base = new ArrayList<T>();
	}

	public Base(Collection<T> base) {
		this.base = base;
	}

	public Collection<T> getDeviceBase() {
		return base;
	}

	public void setDeviceBase(Collection<T> base) throws WrongSetStoreBaseExeption {
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

	public boolean set(int index, T t) throws MyIndexOutOfRangeException {

		return base.set(index, t);

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

	public Base<T> copy() throws MyNotCopybleElementException {

		return new Base<>(base.copy());

	}

	public Object[] toArray() {

		return base.toArray();
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
