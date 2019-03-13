package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.OnlineStoreException;

/**
 * @author Mitrahovich
 *
 */
public class IncorrectDataEntryException extends OnlineStoreException {

	private static final long serialVersionUID = 5399521088878335978L;

	public IncorrectDataEntryException() {

	}

	/**
	 * @param str
	 */
	public IncorrectDataEntryException(String str) {
		super(str);

	}

}
