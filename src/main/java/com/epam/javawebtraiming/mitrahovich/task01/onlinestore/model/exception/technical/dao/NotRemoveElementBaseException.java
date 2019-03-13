package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.dao;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.TechnicalException;

public class NotRemoveElementBaseException extends TechnicalException {

	private static final long serialVersionUID = 3327684605233942883L;

	public NotRemoveElementBaseException() {

	}

	/**
	 * @param cause
	 */
	public NotRemoveElementBaseException(Throwable cause) {
		super(cause);

	}

}
