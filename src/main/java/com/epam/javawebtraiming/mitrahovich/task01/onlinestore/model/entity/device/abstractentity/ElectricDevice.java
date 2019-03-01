package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.IncorrectDataEntryException;

public class ElectricDevice extends Device {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4569752754226074162L;
	private double power;

	public ElectricDevice() {
		super();
		// TODO Auto-generated constructor stub

	}

	public ElectricDevice(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price, double power) {
		super(id, type, manufacturer, model, color, price);
		this.power = power;

	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) throws IncorrectDataEntryException {
		if (power > 0) {
			this.power = power;
		} else {
			throw new IncorrectDataEntryException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(power);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		ElectricDevice other = (ElectricDevice) obj;
		if (Double.doubleToLongBits(power) != Double.doubleToLongBits(other.power))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", power:" + String.format("%.2f", power) + " watt";
	}

}
