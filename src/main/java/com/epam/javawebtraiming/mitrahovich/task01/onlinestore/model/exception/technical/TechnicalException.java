package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.OnlineStoreException;

public class TechnicalException extends OnlineStoreException {

	private static final long serialVersionUID = 1860884523381767939L;

	public TechnicalException() {

	}

	/**
	 * @param cause
	 */
	public TechnicalException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
