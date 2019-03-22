package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetCpuException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.exception.logic.device.WrongSetRamException;

/**
 * @author Mitrahovich
 *
 */
public class CpuDisplayElectricDevice extends DisplayElectricDevice {
	private static final Logger log = Logger.getRootLogger();
	private static final long serialVersionUID = 8820825523769343218L;
	private String cpu;
	private int ram;

	public CpuDisplayElectricDevice() {

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
	 */
	public CpuDisplayElectricDevice(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price, double power, double displayDiagonal, String cpu, int ram) {
		super(id, type, manufacturer, model, color, price, power, displayDiagonal);
		this.cpu = cpu;
		this.ram = ram;
	}

	/**
	 * @param CpuDisplayElectricDevice
	 */
	public CpuDisplayElectricDevice(CpuDisplayElectricDevice device) {
		super(device.getId(), device.getType(), device.getManufacturer(), device.getModel(), device.getColor(), device.getPrice(), device.getPower(), device.getDisplayDiagonal());
		this.cpu = device.getCpu();
		this.ram = device.getRam();

	}

	/**
	 * @return ram
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * @param ram
	 * @throws WrongSetRamException
	 */
	public void setRam(int ram) throws WrongSetRamException {
		if (ram > 0) {
			this.ram = ram;
		} else {
			log.warn("WrongSetRamException in" + this.getClass().getName());
			throw new WrongSetRamException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
		}

	}

	/**
	 * @return cpu
	 */
	public String getCpu() {

		return cpu;
	}

	/**
	 * @param cpu
	 * @throws WrongSetCpuException
	 */
	public void setCpu(String cpu) throws WrongSetCpuException {
		if (cpu != null && cpu != "") {
			this.cpu = cpu;
		} else {
			log.warn("WrongSetCpuException in" + this.getClass().getName());
			throw new WrongSetCpuException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ram;
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
		CpuDisplayElectricDevice other = (CpuDisplayElectricDevice) obj;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (ram != other.ram)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", CPU: " + cpu + ", RAM: " + ram + "GB";
	}

	/**
	 * @return DisplayElectricDevice
	 */
	@Override
	public DisplayElectricDevice copy() {

		return new DisplayElectricDevice(this);
	}

}
