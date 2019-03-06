package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation.arraycollection;

import java.util.Arrays;
import java.util.Iterator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation.AbstractCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.IMyCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.IMyQueue;

public class MyArrayQueue<T> extends AbstractCollection<T> implements IMyQueue<T> {

	private Object[] array;
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private static final Object[] DEFAULT_ARRAY = new Object[] {};
	private static final double EXPANSION_COEFFICIENT = 1.3;

	public MyArrayQueue() {
		array = new Object[DEFAULT_CAPACITY];

	}

	public MyArrayQueue(int capacity) {
		if (capacity > 0) {
			array = new Object[capacity];
		} else {
			array = DEFAULT_ARRAY;
		}
	}

	public MyArrayQueue(Object[] array) {
		if (array != null) {
			this.array = array;
		} else {
			this.array = new Object[DEFAULT_CAPACITY];
		}

	}

	@Override
	public boolean add(T t) {
		boolean check = false;

		if (array.length > size) {
			size++;
			array[size] = t;
			check = true;

		} else if (array.length == size) {
			array = Arrays.copyOf(array, ((int) (array.length * EXPANSION_COEFFICIENT)));
			size++;
			array[size] = t;
			check = true;

		}
		return check;
	}

	@Override
	public boolean remove(T t) {
		boolean check = false;
		T temp;
		Iterator<T> iter = iterator();
		while (iter.hasNext()) {

			temp = iter.next();
			if ((temp.equals(t)) || (temp == t)) {
				iter.remove();
				check = true;
			}
		}

		return check;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean clear() {
		array = DEFAULT_ARRAY;
		return true;
	}

	@Override
	public T get(int index) {

		return ((index > 0) && (index < size) && (array[index] != null)) ? ((T) array[index]) : null;
	}

	@Override
	public Iterator<T> iterator() {

		return new Iter();
	}

	@Override
	public T peek() {

		return ((size > 0) && (array[0] != null)) ? ((T) array[0]) : null;
	}

	@Override
	public T pool() {
		T temp = ((size > 0) && (array[0] != null)) ? ((T) array[0]) : null;
		array = Arrays.copyOfRange(array, 1, size);
		size--;
		return temp;
	}

	private class Iter implements Iterator<T> {
		int cursor = 0;
		int lenght = size;
		boolean checkRemove = false;

		@Override
		public boolean hasNext() {

			return lenght != cursor;
		}

		@Override
		public T next() {
			T temp = null;

			if (lenght > cursor) {
				if (array[cursor] != null) {
					temp = (T) array[cursor];
				}

			}
			cursor++;
			checkRemove = true;
			return temp;
		}

		@Override
		public void remove() {
			if ((cursor > 0) && (checkRemove)) {
				if (hasNext()) {
					for (int i = cursor; i < size; i++) {
						array[cursor - 1] = array[cursor];

					}
					size--;
					checkRemove = false;

				} else {

					array[cursor] = null;
					size--;
					checkRemove = false;

				}

			}

		}
	}

	@Override
	public IMyCollection<T> copy() {

		return new MyArrayQueue<T>(Arrays.copyOf(array, array.length));

	}

}
