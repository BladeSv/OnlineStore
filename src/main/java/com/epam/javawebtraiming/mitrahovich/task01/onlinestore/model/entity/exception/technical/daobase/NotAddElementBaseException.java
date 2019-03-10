package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.daobase;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.TechnicalException;

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
