package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetCpuException extends IncorrectDataEntryException {

	private static final long serialVersionUID = 40463393079214156L;

	public WrongSetCpuException() {

	}

	/**
	 * @param str
	 */
	public WrongSetCpuException(String str) {
		super(str);

	}

}
