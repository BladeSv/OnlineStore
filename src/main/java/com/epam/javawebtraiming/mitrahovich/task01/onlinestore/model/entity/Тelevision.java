package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.DisplayElectricDevice;

public class Тelevision extends DisplayElectricDevice{
	private String displayType;

	
	
	public Тelevision() {
		// TODO Auto-generated constructor stub
	}



	public Тelevision(int id, String type, String manufacturer, String model, String color, double power, double weight,
			double displayDiagonal, String displayResolution, String displayType) {
		super(id, type, manufacturer, model, color, power, weight, displayDiagonal, displayResolution);
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
		return "Тelevision [displayType=" + displayType + ", getScreenDiagonal()=" + getScreenDiagonal()
				+ ", getScreenResolution()=" + getScreenResolution() + ", getWeight()=" + getWeight() + ", getPower()="
				+ getPower() + ", getType()=" + getType() + ", getManufacturer()=" + getManufacturer() + ", getModel()="
				+ getModel() + ", getColor()=" + getColor() + ", getId()=" + getId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}
	
	
	
}
