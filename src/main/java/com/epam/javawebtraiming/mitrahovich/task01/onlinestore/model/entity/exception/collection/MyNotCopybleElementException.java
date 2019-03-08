package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection;

/**
 * @author Mitrahovich
 *
 */
public class MyNotCopybleElementException extends MyCollectionException {

	private static final long serialVersionUID = -7079889077804553411L;

	public MyNotCopybleElementException() {

	}

	/**
	 * @param message
	 */
	public MyNotCopybleElementException(String message) {
		super(message);
	}

}
