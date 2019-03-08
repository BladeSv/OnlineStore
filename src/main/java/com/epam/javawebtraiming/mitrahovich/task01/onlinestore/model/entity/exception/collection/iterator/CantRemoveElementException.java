package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.iterator;

/**
 * @author Mitrahovich
 *
 */
public class CantRemoveElementException extends MyIterarorException {

	private static final long serialVersionUID = -8974621842716577049L;

	public CantRemoveElementException() {

	}

	/**
	 * @param message
	 */
	public CantRemoveElementException(String message) {
		super(message);

	}

}
