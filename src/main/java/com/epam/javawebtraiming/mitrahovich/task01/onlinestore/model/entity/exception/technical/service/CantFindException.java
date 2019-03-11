package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.service;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.TechnicalException;

public class CantFindException extends TechnicalException {

	private static final long serialVersionUID = -2074958874499273524L;

	public CantFindException() {

	}

	/**
	 * @param cause
	 */
	public CantFindException(Throwable cause) {
		super(cause);

	}

}
