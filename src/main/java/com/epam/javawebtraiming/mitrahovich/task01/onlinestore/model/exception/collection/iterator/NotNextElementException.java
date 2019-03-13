package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.iterator;

/**
 * @author Mitrahovich
 *
 */
public class NotNextElementException extends MyIterarorException {

	public NotNextElementException() {
	}

	/**
	 * @param message
	 */
	public NotNextElementException(String message) {
		super(message);
	}

}
