package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetManufacturerException extends IncorrectDataEntryException {

	private static final long serialVersionUID = 1776672125070569957L;

	public WrongSetManufacturerException() {
	}

	/**
	 * @param str
	 */
	public WrongSetManufacturerException(String str) {
		super(str);
	}

}
