package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection;

/**
 * @author Mitrahovich
 *
 */
public class MyNotCopybleElementException extends MyCollectionException {

	public MyNotCopybleElementException() {

	}

	/**
	 * @param message
	 */
	public MyNotCopybleElementException(String message) {
		super(message);
	}

}
