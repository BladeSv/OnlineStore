package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.PortableCpuDisplayElectricDevice;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetMobileConnectionException;

/**
 * @author Mitrahovich
 *
 */
public class MobilePhone extends PortableCpuDisplayElectricDevice {
	private static final Logger log = Logger.getRootLogger();
	private static final long serialVersionUID = 5408307092477179856L;
	private String mobileConnection;

	public MobilePhone() {

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
	public MobilePhone(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price, double power, double displayDiagonal, String cpu, int ram, int batteryCapacity, String mobileConnection) {
		super(id, type, manufacturer, model, color, price, power, displayDiagonal, cpu, ram, batteryCapacity);
		this.mobileConnection = mobileConnection;
	}

	/**
	 * @param MobilePhone
	 */
	public MobilePhone(MobilePhone device) {
		super(device.getId(), device.getType(), device.getManufacturer(), device.getModel(), device.getColor(), device.getPrice(), device.getPower(), device.getDisplayDiagonal(), device.getCpu(), device.getRam(), device.getBatteryCapacity());
		this.mobileConnection = device.getMobileConnection();
	}

	/**
	 * @return mobileConnection
	 */
	public String getMobileConnection() {
		return mobileConnection;
	}

	/**
	 * @param mobileConnection
	 * @throws WrongSetMobileConnectionException
	 */
	public void setMobileConnection(String mobileConnection) throws WrongSetMobileConnectionException {
		if (mobileConnection != null && mobileConnection != "") {
			this.mobileConnection = mobileConnection;
		} else {
			log.warn("WrongSetMobileConnectionException in" + this.getClass().getName());
			throw new WrongSetMobileConnectionException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
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

	/**
	 * @return MobilePhone
	 */
	@Override
	public MobilePhone copy() {

		return new MobilePhone(this);
	}
}
