package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase;

import java.io.Serializable;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.WrongSetStoreBaseExeption;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation.arraycollection.MyArrayQueue;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.IMyCollection;

/**
 * @author Mitrahovich
 *
 */
public class Base<T> implements Serializable {

	private static final long serialVersionUID = 5925438773205805016L;
	protected IMyCollection<T> deviceBase;

	public Base() {
		deviceBase = new MyArrayQueue<>();
	}

	public Base(IMyCollection<T> deviceBase) {
		this.deviceBase = deviceBase;
	}

	public IMyCollection<T> getDeviceBase() throws MyNotCopybleElementException {
		return deviceBase.copy();
	}

	public void setDeviceBase(IMyCollection<T> deviceBase) throws WrongSetStoreBaseExeption {
		if (deviceBase != null) {
			this.deviceBase = deviceBase;
		} else {
			throw new WrongSetStoreBaseExeption();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (T t : deviceBase) {
			if (t != null) {
				sb.append(t);
				sb.append("\n");
			}

		}

		return sb + "";
	}
}
