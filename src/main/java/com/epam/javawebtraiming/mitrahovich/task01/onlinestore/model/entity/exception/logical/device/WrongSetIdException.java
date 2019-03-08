package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetIdException extends IncorrectDataEntryException {

	private static final long serialVersionUID = -8959606806880230178L;

	public WrongSetIdException() {
	}

	/**
	 * @param str
	 */
	public WrongSetIdException(String str) {
		super(str);
	}

}
