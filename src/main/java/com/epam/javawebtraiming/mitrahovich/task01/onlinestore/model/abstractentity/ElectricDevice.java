package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.type.DeviceType;

public class ElectricDevice extends Device {
	private double power;
	private double weight;

	public ElectricDevice() {
		super();
		// TODO Auto-generated constructor stub

	}

	public ElectricDevice(int id, DeviceType type, String manufacturer, String model, String color, double price,
			double power, double weight) {
		super(id, type, manufacturer, model, color, price);
		this.power = power;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(power);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
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
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", power:" + power + " watt, weight:" + weight + " Kg";
	}

}
