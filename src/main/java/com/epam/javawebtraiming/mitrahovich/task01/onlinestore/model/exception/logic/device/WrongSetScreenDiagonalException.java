package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetScreenDiagonalException extends IncorrectDataEntryException {

	private static final long serialVersionUID = -6481568243079301716L;

	public WrongSetScreenDiagonalException() {

	}

	/**
	 * @param str
	 */
	public WrongSetScreenDiagonalException(String str) {
		super(str);

	}

}
