package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetScreenDiagonalException;

/**
 * @author Mitrahovich
 *
 */
public class DisplayElectricDevice extends ElectricDevice {

	private static final long serialVersionUID = 6510838978083857245L;
	private double displayDiagonal;

	public DisplayElectricDevice() {

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
	public DisplayElectricDevice(int id, DeviceType type, String manufacturer, String model, String color,
			BigDecimal price, double power, double displayDiagonal) {
		super(id, type, manufacturer, model, color, price, power);
		this.displayDiagonal = displayDiagonal;
	}

	/**
	 * @param DisplayElectricDevice
	 */
	public DisplayElectricDevice(DisplayElectricDevice device) {
		super(device.getId(), device.getType(), device.getManufacturer(), device.getModel(), device.getColor(),
				device.getPrice(), device.getPower());
		this.displayDiagonal = device.getScreenDiagonal();
	}

	/**
	 * @return displayDiagonal
	 */
	public double getScreenDiagonal() {
		return displayDiagonal;
	}

	/**
	 * @param displayDiagonal
	 * @throws WrongSetScreenDiagonalException
	 */
	public void setScreenDiagonal(double displayDiagonal) throws WrongSetScreenDiagonalException {
		if (displayDiagonal > 0) {
			this.displayDiagonal = displayDiagonal;
		} else {
			throw new WrongSetScreenDiagonalException(
					"Incorrect enter of " + this.getClass().getSimpleName() + " color");
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

	/**
	 * @return DisplayElectricDevice
	 */
	@Override
	public DisplayElectricDevice copy() {

		return new DisplayElectricDevice(this);
	}

}
