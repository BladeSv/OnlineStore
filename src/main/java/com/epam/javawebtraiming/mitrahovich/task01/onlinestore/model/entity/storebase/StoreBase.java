package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase;

import java.io.Serializable;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.WrongSetStoreBaseExeption;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.IMyCollection;

public class StoreBase<T> extends Base<T> implements Serializable {

	private static final long serialVersionUID = 3685331886334816171L;

	public IMyCollection<T> getDeviceBase() {
		return deviceBase.copy();
	}

	@Override
	public void setDeviceBase(IMyCollection<T> deviceBase) throws WrongSetStoreBaseExeption {
		if (deviceBase != null) {
			super.deviceBase = deviceBase;
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
