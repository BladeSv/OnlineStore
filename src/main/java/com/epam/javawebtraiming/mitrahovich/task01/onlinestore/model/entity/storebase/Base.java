package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase;

import java.io.Serializable;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.WrongSetStoreBaseExeption;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.IMyCollection;

public abstract class Base<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5925438773205805016L;
	protected IMyCollection<T> deviceBase;

	public Base() {
		// TODO Auto-generated constructor stub
	}

	public Base(IMyCollection<T> deviceBase) {
		this.deviceBase = deviceBase;
	}

	public abstract IMyCollection<T> getDeviceBase();

	public abstract void setDeviceBase(IMyCollection<T> deviceBase) throws WrongSetStoreBaseExeption;
}
