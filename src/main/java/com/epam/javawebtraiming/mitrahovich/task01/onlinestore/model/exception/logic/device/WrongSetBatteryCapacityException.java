package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetBatteryCapacityException extends IncorrectDataEntryException {

	private static final long serialVersionUID = -699227306284075329L;

	public WrongSetBatteryCapacityException() {

	}

	/**
	 * @param str
	 */
	public WrongSetBatteryCapacityException(String str) {
		super(str);
	}

}
