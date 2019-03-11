package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.order;

import java.util.GregorianCalendar;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.client.Client;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.IMyCollection;

public class Order {
	private IMyCollection<Device> device;

	private Client clint;
	private GregorianCalendar date;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param device
	 * @param clint
	 * @param date
	 */
	public Order(IMyCollection<Device> device, Client clint, GregorianCalendar date) {
		super();
		this.device = device;
		this.clint = clint;
		this.date = date;
	}

	public IMyCollection<Device> getDevice() {
		return device;
	}

	public void setDevice(IMyCollection<Device> device) {
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
	public String toString() {
		return "clint: " + clint + ", device: " + device + ", date: " + date;
	}

}
