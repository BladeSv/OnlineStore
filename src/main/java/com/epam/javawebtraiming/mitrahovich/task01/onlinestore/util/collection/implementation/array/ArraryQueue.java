package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.implementation.array;

import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection.Queue;

public class ArraryQueue<T> extends ArrayList<T> implements Queue<T> {

	public ArraryQueue() {

	}

	/**
	 * @param capacity
	 */
	public ArraryQueue(int capacity) {
		super(capacity);
	}

	/**
	 * @param array
	 */

	@Override
	public boolean offer(T t) {

		return super.add(t);

	}

	@Override
	public T peek() {

		return ((size > 0) && (super.array[0] != null)) ? ((T) array[0]) : null;
	}

	@Override
	public T pool() {
		T temp = ((super.size > 0) && (array[0] != null)) ? ((T) array[0]) : null;
		array = Arrays.copyOfRange(array, 1, size);
		size--;
		return temp;
	}

}
