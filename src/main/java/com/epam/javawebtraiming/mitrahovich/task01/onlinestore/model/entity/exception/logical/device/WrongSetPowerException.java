package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetPowerException extends IncorrectDataEntryException {

	private static final long serialVersionUID = 7540207120120994994L;

	public WrongSetPowerException() {

	}

	/**
	 * @param str
	 */
	public WrongSetPowerException(String str) {
		super(str);

	}

}
