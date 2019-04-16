package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetBatteryCapacityException;

/**
 * @author Mitrahovich
 *
 */
public class PortableCpuDisplayElectricDevice extends CpuDisplayElectricDevice {
	private static final Logger log = Logger.getRootLogger();
	private static final long serialVersionUID = 5889305266388703238L;

	private int batteryCapacity;

	public PortableCpuDisplayElectricDevice() {
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
	 * @param displayDiagonal
	 * @param cpu
	 * @param ram
	 * @param batteryCapacity
	 */
	public PortableCpuDisplayElectricDevice(int id, DeviceType type, String manufacturer, String model, String color,
			BigDecimal price, double power, double displayDiagonal, String cpu, int ram, int batteryCapacity) {
		super(id, type, manufacturer, model, color, price, power, displayDiagonal, cpu, ram);
		this.batteryCapacity = batteryCapacity;
	}

	/**
	 * @param PortableCpuDisplayElectricDevice
	 */
	public PortableCpuDisplayElectricDevice(PortableCpuDisplayElectricDevice device) {
		super(device.getId(), device.getType(), device.getManufacturer(), device.getModel(), device.getColor(),
				device.getPrice(), device.getPower(), device.getDisplayDiagonal(), device.getCpu(), device.getRam());
		this.batteryCapacity = device.getBatteryCapacity();
	}

	/**
	 * @return batteryCapacity
	 */
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	/**
	 * @param batteryCapacity
	 * @throws WrongSetBatteryCapacityException
	 */
	public void setBatteryCapacity(int batteryCapacity) throws WrongSetBatteryCapacityException {
		if (batteryCapacity > 0) {
			this.batteryCapacity = batteryCapacity;
		} else {
			log.warn("WrongSetBatteryCapacityException in" + this.getClass().getName());
			throw new WrongSetBatteryCapacityException(
					"Incorrect enter of " + this.getClass().getSimpleName() + " color");
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
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
		PortableCpuDisplayElectricDevice other = (PortableCpuDisplayElectricDevice) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", battery capacity: " + batteryCapacity + "mAh";
	}

	/**
	 * @return PortableCpuDisplayElectricDevice
	 */
	@Override
	public PortableCpuDisplayElectricDevice copy() {

		return new PortableCpuDisplayElectricDevice(this);
	}

}
