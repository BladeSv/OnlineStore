package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device;

/**
 * @author Mitrahovich
 *
 */
public class WrongSetColorException extends IncorrectDataEntryException {

	private static final long serialVersionUID = 4320395008122067608L;

	public WrongSetColorException() {
	}

	/**
	 * @param str
	 */
	public WrongSetColorException(String str) {
		super(str);
	}

}
