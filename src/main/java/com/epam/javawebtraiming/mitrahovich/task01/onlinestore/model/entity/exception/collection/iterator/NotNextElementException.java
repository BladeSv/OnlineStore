package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.iterator;

/**
 * @author Mitrahovich
 *
 */
public class NotNextElementException extends MyIterarorException {

	private static final long serialVersionUID = -3562322874470707919L;

	public NotNextElementException() {
	}

	/**
	 * @param message
	 */
	public NotNextElementException(String message) {
		super(message);
	}

}
