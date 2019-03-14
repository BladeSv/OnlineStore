package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.implementation.array;

import java.util.Arrays;
import java.util.Iterator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Copyable;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.AbstractCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.NotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.exception.iterator.NotNextElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection.Collection;

public class ArrayList<T> extends AbstractCollection<T> implements Collection<T> {

	protected Object[] array;

	private static final int DEFAULT_CAPACITY = 10;
	private static final Object[] DEFAULT_ARRAY = new Object[] {};
	private static final double EXPANSION_COEFFICIENT = 1.3;

	public ArrayList() {
		array = new Object[DEFAULT_CAPACITY];

	}

	public ArrayList(int capacity) {
		if (capacity > 0) {
			array = new Object[capacity];
		} else {

			array = DEFAULT_ARRAY;
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
	public boolean set(int index, T t) throws IndexOutOfRangeException {
		boolean check = false;
		if (checkIndexRange(index)) {
			array[index] = t;
			check = true;
		}
		return check;
	}

	@Override
	public void remove(T t) throws NotInCollectionException {
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

			throw new NotInCollectionException();
		}

	}

	@Override
	public void clear() {
		array = DEFAULT_ARRAY;

	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfRangeException {
		T temp = null;

		if (checkIndexRange(index)) {
			if (array[index] != null) {
				temp = (T) array[index];
			}
		}
		return temp;
	}

	@Override
	public Iterator<T> iterator() {

		return new Iter();
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
	public Collection<T> copy() throws NotCopybleElementException {
		ArrayList<T> tempArray = new ArrayList<T>(array.length);

		for (int i = 0; i < array.length; i++) {
			Object temp = array[i];
			if (temp != null) {
				if (temp.getClass().isAssignableFrom(Copyable.class)) {
					tempArray.add(((Copyable<T>) temp).copy());

				} else {
					throw new NotCopybleElementException();
				}
			} else {
				tempArray.add(null);
			}

		}

		return tempArray;

	}

	private int getNewArrayLenght() {
		int lenght = (int) (array.length * EXPANSION_COEFFICIENT);

		lenght = (lenght == array.length) ? ++lenght : lenght;

		return lenght;
	}

	@Override
	public Object[] toArray() {
		if (array != null) {
			return Arrays.copyOf(array, size);
		}
		return null;

	}

}
