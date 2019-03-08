package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device.WrongSetPowerException;

/**
 * @author Mitrahovich
 *
 */
public class ElectricDevice extends Device {

	private static final long serialVersionUID = -4569752754226074162L;

	private double power;

	public ElectricDevice() {
		super();

	}

	/**
	 * @param id
	 * @param type
	 * @param manufacturer
	 * @param model
	 * @param color
	 * @param price
	 * @param power
	 */
	public ElectricDevice(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price,
			double power) {
		super(id, type, manufacturer, model, color, price);
		this.power = power;

	}

	/**
	 * @param ElectricDevice
	 */
	public ElectricDevice(ElectricDevice device) {
		super(device.getId(), device.getType(), device.getManufacturer(), device.getModel(), device.getColor(),
				device.getPrice());
		this.power = device.getPower();

	}

	/**
	 * @return power
	 */
	public double getPower() {
		return power;
	}

	/**
	 * @param power
	 * @throws WrongSePowerException
	 */
	public void setPower(double power) throws WrongSetPowerException {
		if (power > 0) {
			this.power = power;
		} else {
			throw new WrongSetPowerException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
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

	/**
	 * @return ElectricDevice
	 */
	@Override
	public ElectricDevice copy() {

		return new ElectricDevice(this);
	}

}
