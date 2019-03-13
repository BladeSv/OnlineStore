package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection;

/**
 * @author Mitrahovich
 *
 */
public class NotCopybleElementException extends CollectionException {

	public NotCopybleElementException() {

	}

	/**
	 * @param message
	 */
	public NotCopybleElementException(String message) {
		super(message);
	}

}
