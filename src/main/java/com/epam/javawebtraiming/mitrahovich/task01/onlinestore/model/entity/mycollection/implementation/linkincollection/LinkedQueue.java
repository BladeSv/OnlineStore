package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.implementation.linkincollection;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.Queue;

public class LinkedQueue<T> extends LinkinList<T> implements Queue<T> {

	public LinkedQueue() {

	}

	@Override
	public boolean offer(T t) {

		return add(t);
	}

	@Override
	public T peek() {

		return (head.next.item != null) ? (T) (head.next.item) : null;
	}

	@Override
	public T pool() {
		Node temp = head.next;
		temp.next.prev = head;
		head.next = temp.next;
		size--;
		return (temp.item != null) ? (T) (temp.item) : null;

	}

}
