package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.CpuDisplayElectricDevice;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.type.DeviceType;

public class MobilePhone extends CpuDisplayElectricDevice {

	private int batteryCapacity;
	private String mobileCconnection;

	public MobilePhone() {
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
	 * @param weight
	 * @param displayDiagonal
	 * @param displayResolution
	 * @param cpu
	 * @param clockFrequency
	 * @param ram
	 * @param operatingSystem
	 * @param batteryCapacity
	 * @param mobileCconnection
	 */
	public MobilePhone(int id, DeviceType type, String manufacturer, String model, String color, double price, double power,
			double weight, double displayDiagonal, String displayResolution, String cpu, int clockFrequency, int ram,
			String operatingSystem, int batteryCapacity, String mobileCconnection) {
		super(id, type, manufacturer, model, color, price, power, weight, displayDiagonal, displayResolution, cpu,
				clockFrequency, ram, operatingSystem);
		this.batteryCapacity = batteryCapacity;
		this.mobileCconnection = mobileCconnection;
	}





	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getMobileCconnection() {
		return mobileCconnection;
	}

	public void setMobileCconnection(String mobileCconnection) {
		this.mobileCconnection = mobileCconnection;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
		result = prime * result + ((mobileCconnection == null) ? 0 : mobileCconnection.hashCode());
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
		MobilePhone other = (MobilePhone) obj;
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (mobileCconnection == null) {
			if (other.mobileCconnection != null)
				return false;
		} else if (!mobileCconnection.equals(other.mobileCconnection))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MobilePhone [batteryCapacity=" + batteryCapacity + ", mobileCconnection=" + mobileCconnection
				+ ", getRam()=" + getRam() + ", getCpu()=" + getCpu() + ", getClockFrequency()=" + getClockFrequency()
				+ ", getOperatingSystem()=" + getOperatingSystem() + ", getScreenDiagonal()=" + getScreenDiagonal()
				+ ", getScreenResolution()=" + getScreenResolution() + ", getWeight()=" + getWeight() + ", getPower()="
				+ getPower() + ", getType()=" + getType() + ", getManufacturer()=" + getManufacturer() + ", getModel()="
				+ getModel() + ", getColor()=" + getColor() + ", getId()=" + getId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}

}
