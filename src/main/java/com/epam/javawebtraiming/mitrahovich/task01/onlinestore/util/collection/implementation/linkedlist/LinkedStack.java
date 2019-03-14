package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.implementation.linkedlist;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection.Stack;

public class LinkedStack<T> extends LinkinList<T> implements Stack<T> {

	public LinkedStack() {

	}

	@Override
	public boolean push(T t) {

		return add(t);
	}

	@Override
	public T pop() {

		return (head.prev.item != null) ? (T) (head.prev.item) : null;

	}

	@Override
	public T peek() {
		Node temp = head.prev;
		temp.prev.next = head;
		head.prev = temp.prev;
		return (temp.item != null) ? (T) (temp.item) : null;
	}

}
