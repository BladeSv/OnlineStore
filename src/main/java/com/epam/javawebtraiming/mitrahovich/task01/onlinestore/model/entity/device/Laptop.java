package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.PortableCpuDisplayElectricDevice;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetHddCapacityException;

/**
 * @author Mitrahovich
 *
 */
public class Laptop extends PortableCpuDisplayElectricDevice {

	private static final long serialVersionUID = 8654025546412615402L;
	private int hddCapacity;

	public Laptop() {

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
	public Laptop(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price,
			double power, double displayDiagonal, String cpu, int ram, int batteryCapacity, int hddCapacity) {
		super(id, type, manufacturer, model, color, price, power, displayDiagonal, cpu, ram, batteryCapacity);
		this.hddCapacity = hddCapacity;
	}

	/**
	 * @param Laptop
	 */
	public Laptop(Laptop device) {
		super(device.getId(), device.getType(), device.getManufacturer(), device.getModel(), device.getColor(),
				device.getPrice(), device.getPower(), device.getScreenDiagonal(), device.getCpu(), device.getRam(),
				device.getBatteryCapacity());
		this.hddCapacity = device.getHddCapacity();
	}

	/**
	 * @return hddCapacity
	 */
	public int getHddCapacity() {
		return hddCapacity;
	}

	/**
	 * @param hddCapacity
	 * @throws WrongSetHddCapacityException
	 */
	public void setHddCapacity(int hddCapacity) throws WrongSetHddCapacityException {
		if (hddCapacity > 0) {
			this.hddCapacity = hddCapacity;
		} else {
			throw new WrongSetHddCapacityException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
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

	/**
	 * @return Laptop
	 */
	@Override
	public Laptop copy() {

		return new Laptop(this);
	}

}
