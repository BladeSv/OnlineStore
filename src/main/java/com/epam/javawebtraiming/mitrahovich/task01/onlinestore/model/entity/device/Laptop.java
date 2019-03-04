package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.PortableCpuDisplayElectricDevice;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.IncorrectDataEntryException;

public class Laptop extends PortableCpuDisplayElectricDevice {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8654025546412615402L;
	private int hddCapacity;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param type
	 * @param manufacturer
	 * @param model
	 * @param color
	 * @param price
	 * @param power
	 * @param displayDiagonal
	 * @param cpu
	 * @param ram
	 * @param batteryCapacity
	 * @param hddCapacity
	 */
	public Laptop(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price, double power, double displayDiagonal, String cpu, int ram, int batteryCapacity, int hddCapacity) {
		super(id, type, manufacturer, model, color, price, power, displayDiagonal, cpu, ram, batteryCapacity);
		this.hddCapacity = hddCapacity;
	}

	public int getHddCapacity() {
		return hddCapacity;
	}

	public void setHddCapacity(int hddCapacity) throws IncorrectDataEntryException {
		if (hddCapacity > 0) {
			this.hddCapacity = hddCapacity;
		} else {
			throw new IncorrectDataEntryException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + hddCapacity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (hddCapacity != other.hddCapacity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", HDD capacity: " + hddCapacity + "GB";
	}

}
