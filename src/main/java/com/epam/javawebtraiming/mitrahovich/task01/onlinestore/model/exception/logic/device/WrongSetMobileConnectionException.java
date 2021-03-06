package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetMobileConnectionException extends IncorrectDataEntryException {

	private static final long serialVersionUID = -8257597324786848129L;

	public WrongSetMobileConnectionException() {
	}

	/**
	 * @param str
	 */
	public WrongSetMobileConnectionException(String str) {
		super(str);
	}

}
