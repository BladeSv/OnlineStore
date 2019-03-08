package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection;

/**
 * @author Mitrahovich
 *
 */
public class MyIndexOutOfRangeException extends MyCollectionException {

	private static final long serialVersionUID = -3173652942856838990L;

	public MyIndexOutOfRangeException() {

	}

	/**
	 * @param message
	 */
	public MyIndexOutOfRangeException(String message) {
		super(message);
	}

}
