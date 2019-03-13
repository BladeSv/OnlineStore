package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.service;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.technical.TechnicalException;

public class CantSortException extends TechnicalException {

	private static final long serialVersionUID = 4055918371621790269L;

	public CantSortException() {

	}

	/**
	 * @param cause
	 */
	public CantSortException(Throwable cause) {
		super(cause);

	}

}
