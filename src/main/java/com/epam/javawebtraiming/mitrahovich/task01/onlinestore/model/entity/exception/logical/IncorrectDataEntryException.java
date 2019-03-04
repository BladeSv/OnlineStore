package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.OnlineStoreException;

public class IncorrectDataEntryException extends OnlineStoreException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5399521088878335978L;

	public IncorrectDataEntryException() {

	}

	public IncorrectDataEntryException(String str) {
		super(str);

	}

}
