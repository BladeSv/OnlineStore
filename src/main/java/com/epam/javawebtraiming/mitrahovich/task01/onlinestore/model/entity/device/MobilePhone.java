package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.PortableCpuDisplayElectricDevice;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.IncorrectDataEntryException;

public class MobilePhone extends PortableCpuDisplayElectricDevice {

	private String mobileConnection;

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
	 * @param displayDiagonal
	 * @param cpu
	 * @param ram
	 * @param batteryCapacity
	 * @param mobileConnection
	 */
	public MobilePhone(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price,
			double power, double displayDiagonal, String cpu, int ram, int batteryCapacity, String mobileConnection) {
		super(id, type, manufacturer, model, color, price, power, displayDiagonal, cpu, ram, batteryCapacity);
		this.mobileConnection = mobileConnection;
	}

	public String getMobileConnection() {
		return mobileConnection;
	}

	public void setMobileConnection(String mobileConnection) throws IncorrectDataEntryException {
		if (mobileConnection != null) {
			this.mobileConnection = mobileConnection;
		} else {
			throw new IncorrectDataEntryException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mobileConnection == null) ? 0 : mobileConnection.hashCode());
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
		if (mobileConnection == null) {
			if (other.mobileConnection != null)
				return false;
		} else if (!mobileConnection.equals(other.mobileConnection))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", mobile connection type:" + mobileConnection;

	}

}
