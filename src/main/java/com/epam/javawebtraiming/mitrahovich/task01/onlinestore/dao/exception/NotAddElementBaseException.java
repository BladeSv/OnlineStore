package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.dao.exception;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.TechnicalException;

public class NotAddElementBaseException extends TechnicalException {

	private static final long serialVersionUID = 837472018014699144L;

	public NotAddElementBaseException() {

	}

	/**
	 * @param cause
	 */
	public NotAddElementBaseException(Throwable cause) {
		super(cause);

	}

}
