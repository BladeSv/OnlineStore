package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.base;

import java.io.Serializable;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.base.WrongSetBaseExeption;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.implementation.array.ArrayList;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection.Collection;

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

	public Collection<T> getBase() {
		return base;
	}

	public void setBase(Collection<T> base) throws WrongSetBaseExeption {
		if (base != null) {
			this.base = base;
		} else {
			throw new WrongSetBaseExeption();
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

	public boolean set(int index, T t) throws IndexOutOfRangeException {

		return base.set(index, t);

	}

	public boolean remove(T t) throws NotInCollectionException {

		if (t != null) {
			base.remove(t);
			return true;
		} else {
			return false;
		}

	}

	public T get(int index) throws IndexOutOfRangeException {

		return base.get(index);

	}

	public Base<T> copy() throws NotCopybleElementException {

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
