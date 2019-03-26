package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.order;

import java.util.GregorianCalendar;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.client.Client;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.util.collection.interfacecollection.Collection;

public class Order {
	private Collection<Device> device;

	private Client clint;
	private GregorianCalendar date;

	public Order() {

	}

	/**
	 * @param device
	 * @param clint
	 * @param date
	 */
	public Order(Collection<Device> device, Client clint, GregorianCalendar date) {
		super();
		this.device = device;
		this.clint = clint;
		this.date = date;
	}

	public Collection<Device> getDevice() {
		return device;
	}

	public void setDevice(Collection<Device> device) {
		this.device = device;
	}

	public Client getClint() {
		return clint;
	}

	public void setClint(Client clint) {
		this.clint = clint;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clint == null) ? 0 : clint.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((device == null) ? 0 : device.hashCode());
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
		if (clint == null) {
			if (other.clint != null)
				return false;
		} else if (!clint.equals(other.clint))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (device == null) {
			if (other.device != null)
				return false;
		} else if (!device.equals(other.device))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "clint: " + clint + ", device: " + device + ", date: " + date;
	}

}
