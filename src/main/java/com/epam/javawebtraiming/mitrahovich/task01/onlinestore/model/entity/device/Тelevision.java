package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.DisplayElectricDevice;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.IncorrectDataEntryException;

public class Тelevision extends DisplayElectricDevice {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7109647604540374684L;
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
	 * @param displayDiagonal
	 * @param displayType
	 */
	public Тelevision(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price, double power, double displayDiagonal, String displayType) {
		super(id, type, manufacturer, model, color, price, power, displayDiagonal);
		this.displayType = displayType;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) throws IncorrectDataEntryException {
		if (displayType != null) {
			this.displayType = displayType;
		} else {
			throw new IncorrectDataEntryException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
		}

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
