package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.iterator;

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
