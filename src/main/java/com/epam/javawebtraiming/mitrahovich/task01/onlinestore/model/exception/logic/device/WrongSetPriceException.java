package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetPriceException extends IncorrectDataEntryException {

	private static final long serialVersionUID = 6185443848945450607L;

	public WrongSetPriceException() {
	}

	/**
	 * @param str
	 */
	public WrongSetPriceException(String str) {
		super(str);
	}

}
