package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetModelException extends IncorrectDataEntryException {

	private static final long serialVersionUID = 682366087342884749L;

	public WrongSetModelException() {
	}

	/**
	 * @param str
	 */
	public WrongSetModelException(String str) {
		super(str);
	}

}
