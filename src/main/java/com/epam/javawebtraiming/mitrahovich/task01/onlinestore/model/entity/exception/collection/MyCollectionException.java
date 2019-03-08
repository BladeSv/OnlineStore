package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.OnlineStoreException;

/**
 * @author Mitrahovich
 *
 */
public class MyCollectionException extends OnlineStoreException {

	private static final long serialVersionUID = -7409860154552542516L;

	public MyCollectionException() {

	}

	/**
	 * @param message
	 */
	public MyCollectionException(String message) {
		super(message);
	}

}
