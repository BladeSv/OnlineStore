package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation.arraycollection;

import java.util.Arrays;
import java.util.Iterator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Copyble;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyIndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.MyNotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.collection.iterator.NotNextElementException;
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

			array[size] = t;
			size++;
			check = true;

		} else if (array.length == size) {

			array = Arrays.copyOf(array, getNewArrayLenght());

			array[size] = t;
			size++;
			check = true;

		}
		return check;
	}

	@Override
	public boolean set(int index, T t) throws MyIndexOutOfRangeException {
		boolean check = false;
		if (checkIndexRange(index)) {
			array[index] = t;
			check = true;
		}
		return check;
	}

	@Override
	public boolean remove(T t) throws MyNotInCollectionException {
		boolean check = false;
		T temp;
		Iterator<T> iter = iterator();
		while (iter.hasNext()) {

			temp = iter.next();
			if (temp == t) {
				iter.remove();
				check = true;
			}
		}
		if (!check) {

			throw new MyNotInCollectionException();
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

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws MyIndexOutOfRangeException {
		T temp = null;

		if (checkIndexRange(index)) {
			if (temp != null) {
				temp = (T) array[index];
			}
		}
		return temp;
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

		boolean checkRemove = false;

		@Override
		public boolean hasNext() {

			return size != cursor;
		}

		@Override
		public T next() {
			T temp = null;

			if (size > cursor) {
				if (array[cursor] != null) {
					temp = (T) array[cursor];
				}

			} else {
				throw new NotNextElementException();

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
	public IMyCollection<T> copy() throws MyNotCopybleElementException {

		Object[] tempArray = Arrays.copyOf(array, array.length);
		Object temp;
		for (int i = 0; i < array.length; i++) {
			temp = array[i];
			if (temp != null) {
				if (temp.getClass().isAssignableFrom(Copyble.class)) {
					tempArray[i] = ((Copyble<T>) temp).copy();

				} else {
					throw new MyNotCopybleElementException();
				}
			} else {
				tempArray[i] = temp;
			}

		}

		return new MyArrayQueue<T>(tempArray);

	}

	private int getNewArrayLenght() {
		int lenght = (int) (array.length * EXPANSION_COEFFICIENT);

		lenght = (lenght == array.length) ? ++lenght : lenght;

		return lenght;
	}

	private boolean checkIndexRange(int index) throws MyIndexOutOfRangeException {
		if ((index >= 0) && (index < size)) {
			return true;
		} else {
			throw new MyIndexOutOfRangeException();
		}

	}

	@Override
	public Object[] toArray() {
		if (array != null) {
			return Arrays.copyOf(array, size);
		}
		return null;

	}

}
