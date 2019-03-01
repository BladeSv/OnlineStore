package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.IncorrectDataEntryException;

public class DisplayElectricDevice extends ElectricDevice {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6510838978083857245L;
	private double displayDiagonal;

	public DisplayElectricDevice() {
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
	 */
	public DisplayElectricDevice(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price, double power, double displayDiagonal) {
		super(id, type, manufacturer, model, color, price, power);
		this.displayDiagonal = displayDiagonal;
	}

	public double getScreenDiagonal() {
		return displayDiagonal;
	}

	public void setScreenDiagonal(double screenDiagonal) throws IncorrectDataEntryException {
		if (displayDiagonal > 0) {
			this.displayDiagonal = screenDiagonal;
		} else {
			throw new IncorrectDataEntryException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(displayDiagonal);
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
		DisplayElectricDevice other = (DisplayElectricDevice) obj;
		if (Double.doubleToLongBits(displayDiagonal) != Double.doubleToLongBits(other.displayDiagonal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", display diagonal: " + displayDiagonal;
	}

}
