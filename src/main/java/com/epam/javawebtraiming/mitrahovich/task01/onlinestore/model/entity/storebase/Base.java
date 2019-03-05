package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.storebase;

import java.io.Serializable;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.WrongSetStoreBaseExeption;

public abstract class Base<T> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5925438773205805016L;
	private T deviceBase;

	public Base() {
		// TODO Auto-generated constructor stub
	}

	public Base(T deviceBase) {
		this.deviceBase = deviceBase;
	}

	public abstract T getDeviceBase();

	public abstract void setDeviceBase(T deviceBase) throws WrongSetStoreBaseExeption;
}
