package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetHddCapacityException extends IncorrectDataEntryException {

	private static final long serialVersionUID = -1664921919801128300L;

	public WrongSetHddCapacityException() {
	}

	/**
	 * @param str
	 */
	public WrongSetHddCapacityException(String str) {
		super(str);
	}

}
