package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.DisplayElectricDevice;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.type.DeviceType;

public class Тelevision extends DisplayElectricDevice {
	private String displayType;

	public Тelevision() {
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
	 * @param displayType
	 */
	public Тelevision(int id, DeviceType type, String manufacturer, String model, String color, double price,
			double power, double weight, double displayDiagonal, String displayResolution, String displayType) {
		super(id, type, manufacturer, model, color, price, power, weight, displayDiagonal, displayResolution);
		this.displayType = displayType;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((displayType == null) ? 0 : displayType.hashCode());
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
		Тelevision other = (Тelevision) obj;
		if (displayType == null) {
			if (other.displayType != null)
				return false;
		} else if (!displayType.equals(other.displayType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", display type: " + displayType;
	}

}
