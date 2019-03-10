package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception;

/**
 * @author Mitrahovich
 *
 */
public class OnlineStoreException extends Exception {

	private static final long serialVersionUID = -5981893031084245995L;

	public OnlineStoreException() {
		super();

	}

	/**
	 * @param message
	 */
	public OnlineStoreException(String message) {
		super(message);

	}

	/**
	 * @param message
	 * @param cause
	 */
	public OnlineStoreException(String message, Throwable cause) {
		super(message, cause);

	}

	/**
	 * @param cause
	 */
	public OnlineStoreException(Throwable cause) {
		super(cause);

	}

}
