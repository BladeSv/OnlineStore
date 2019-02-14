package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.AbstractElectricDisplayCpu;

public class Laptop extends AbstractElectricDisplayCpu{

	private int batteryCapacity;
	private String hddType;
	private int hddCapacity;
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	public Laptop(int id, String type, String manufacturer, String model, String color, double power, double weight,
			double screenDiagonal, String screenResolution, String cpu, int clockFrequency, int ram,
			String operatingSystem, int batteryCapacity, String hddType, int hddCapacity) {
		super(id, type, manufacturer, model, color, power, weight, screenDiagonal, screenResolution, cpu,
				clockFrequency, ram, operatingSystem);
		this.batteryCapacity = batteryCapacity;
		this.hddType = hddType;
		this.hddCapacity = hddCapacity;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public String getHddType() {
		return hddType;
	}
	public void setHddType(String hddType) {
		this.hddType = hddType;
	}
	public int getHddCapacity() {
		return hddCapacity;
	}
	public void setHddCapacity(int hddCapacity) {
		this.hddCapacity = hddCapacity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + batteryCapacity;
		result = prime * result + hddCapacity;
		result = prime * result + ((hddType == null) ? 0 : hddType.hashCode());
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
		if (batteryCapacity != other.batteryCapacity)
			return false;
		if (hddCapacity != other.hddCapacity)
			return false;
		if (hddType == null) {
			if (other.hddType != null)
				return false;
		} else if (!hddType.equals(other.hddType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", hddType=" + hddType + ", hddCapacity=" + hddCapacity
				+ ", getRam()=" + getRam() + ", getCpu()=" + getCpu() + ", getClockFrequency()=" + getClockFrequency()
				+ ", getOperatingSystem()=" + getOperatingSystem() + ", getScreenDiagonal()=" + getScreenDiagonal()
				+ ", getScreenResolution()=" + getScreenResolution() + ", getWeight()=" + getWeight() + ", getPower()="
				+ getPower() + ", getType()=" + getType() + ", getManufacturer()=" + getManufacturer() + ", getModel()="
				+ getModel() + ", getColor()=" + getColor() + ", getId()=" + getId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	
}
