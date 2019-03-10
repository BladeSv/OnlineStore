package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.technical.daobase;

public class NotFoundElementException extends NotRemoveElementBaseException {

	private static final long serialVersionUID = 7977888277965779104L;

	public NotFoundElementException() {

	}

	/**
	 * @param cause
	 */
	public NotFoundElementException(Throwable cause) {
		super(cause);

	}

}
