package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;

public class PortableCpuDisplayElectricDevice extends CpuDisplayElectricDevice {

	private int batteryCapacity;

	/**
	 * 
	 */
	public PortableCpuDisplayElectricDevice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
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

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
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

}
