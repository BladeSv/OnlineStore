package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.collection.implementation.linkedlist;

import java.util.Iterator;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.collection.implementation.AbstractCollection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.collection.interfacecollection.Collection;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Copyble;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.IndexOutOfRangeException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.NotCopybleElementException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.NotInCollectionException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.collection.iterator.NotNextElementException;

public class LinkinList<T> extends AbstractCollection<T> implements Collection<T> {

	protected Node head;

	public LinkinList() {

		this.head = new Node(null, this.head, this.head);

	}

	public LinkinList(Node head) {

		this.head = head;

	}

	@Override
	public Iterator<T> iterator() {

		return new IteratorList<T>();
	}

	@Override
	public boolean add(T t) {
		Node temp = new Node<T>(t, head, head.prev);
		temp.next = head;
		temp.prev = head.prev.next;
		head.prev.next = temp;

		head.prev = temp;

		size++;
		return true;
	}

	@Override
	public T get(int index) throws IndexOutOfRangeException {

		Node temp = head;

		if (checkIndexRange(index)) {
			if ((size / 2) > index) {
				for (int i = 0; i <= index; i++) {

					temp = temp.next;
				}

			} else {
				for (int i = size; i >= index; i--) {
					temp = temp.prev;
				}
			}

		}

		return (temp.item != null) ? (T) temp.item : null;

	}

	@Override
	public boolean set(int index, T t) throws IndexOutOfRangeException {

		Node temp = head;

		boolean check = false;
		if (checkIndexRange(index)) {
			if ((size / 2) > index) {
				for (int i = 0; i <= index; i++) {

					temp = temp.next;
				}

			} else {
				for (int i = size; i >= index; i--) {
					temp = temp.prev;
				}
			}
			temp.item = t;
			check = true;

		}
		return check;
	}

	@Override
	public void remove(T t) throws NotInCollectionException {
		boolean check = false;
		Iterator<T> iter = iterator();
		while (iter.hasNext()) {
			if (iter == t) {
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
		head = new Node(null, this.head, this.head);

	}

	@Override
	public Collection<T> copy() throws NotCopybleElementException {
		LinkinList<T> tempList = new LinkinList<T>();
		Iterator<T> iter = iterator();
		T temp = null;
		while (iter.hasNext()) {
			temp = iter.next();
			if (temp != null) {
				if (temp.getClass().isAssignableFrom(Copyble.class)) {
					tempList.add(((Copyble<T>) temp).copy());

				} else {
					throw new NotCopybleElementException();
				}
			} else {
				tempList.add(null);

			}

		}

		return tempList;

	}

	@Override
	public Object[] toArray() {
		Iterator<T> iter = iterator();
		Object[] temp = new Object[size];
		int count = 0;
		while (iter.hasNext()) {
			temp[count] = iter.next();
			count++;
		}

		return temp;
	}

	protected class Node<T> {
		T item;
		Node next;
		Node prev;

		/**
		 * @param item
		 * @param next
		 * @param prev
		 */
		public Node(T item, Node next, Node prev) {

			this.item = item;
			this.next = next;
			this.prev = prev;
		}
	}

	private class IteratorList<T> implements Iterator<T> {

		Node cursorNode = head;
		boolean checkRemove = false;

		@Override
		public boolean hasNext() {

			return cursorNode.next != head;

		}

		@Override
		public T next() {

			if (hasNext()) {
				cursorNode = cursorNode.next;
				checkRemove = true;
				return (cursorNode.item != null) ? ((T) cursorNode.item) : null;
			} else {

				throw new NotNextElementException();
			}

		}

		@Override
		public void remove() {
			if (checkRemove && hasNext()) {
				cursorNode.next.prev = cursorNode.prev;
				cursorNode.prev.next = cursorNode.next;

			}

		}

	}

}
