package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetRamException extends IncorrectDataEntryException {

	private static final long serialVersionUID = 9168740142513761594L;

	public WrongSetRamException() {

	}

	/**
	 * @param str
	 */
	public WrongSetRamException(String str) {
		super(str);
	}

}
