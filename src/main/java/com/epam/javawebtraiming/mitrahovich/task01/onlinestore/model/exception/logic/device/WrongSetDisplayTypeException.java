package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetDisplayTypeException extends IncorrectDataEntryException {

	private static final long serialVersionUID = 7516568055336511556L;

	public WrongSetDisplayTypeException() {
	}

	/**
	 * @param str
	 */
	public WrongSetDisplayTypeException(String str) {
		super(str);

	}

}
