package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation.arraycollection;

import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.Stack;

public class ArrayStack<T> extends ArrayList<T> implements Stack<T> {

	public ArrayStack() {

	}

	/**
	 * @param capacity
	 */
	public ArrayStack(int capacity) {
		super(capacity);

	}

	/**
	 * @param array
	 */

	@Override
	public boolean push(T t) {

		return add(t);
	}

	@Override
	public T pop() {
		T temp = ((super.size > 0) && (array[size] != null)) ? ((T) array[0]) : null;
		size--;
		array = Arrays.copyOf(array, size);
		return temp;

	}

	@Override
	public T peek() {

		return ((size > 0) && (super.array[size] != null)) ? ((T) array[0]) : null;

	}

}
