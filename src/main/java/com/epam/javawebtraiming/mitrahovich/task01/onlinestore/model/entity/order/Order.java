package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.order;

import java.util.Arrays;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;

public class Order {
	private Device[] order;

	/**
	 * 
	 */
	public Order() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param order
	 */
	public Order(Device[] order) {
		this.order = order;
	}

	public Device[] getOrder() {
		return order;
	}

	public void setOrder(Device[] order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(order);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (!Arrays.equals(order, other.order))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [order=" + Arrays.toString(order) + "]";
	}

}
