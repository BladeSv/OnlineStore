package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.IncorrectDataEntryException;

public class WrongSetTypeException extends IncorrectDataEntryException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8433265411566601039L;

	/**
	 * 
	 */
	public WrongSetTypeException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param str
	 */
	public WrongSetTypeException(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}

}
