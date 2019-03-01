package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity;

import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.IncorrectDataEntryException;

public class CpuDisplayElectricDevice extends DisplayElectricDevice {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8820825523769343218L;
	private String cpu;
	private int ram;

	public CpuDisplayElectricDevice() {
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
	 */
	public CpuDisplayElectricDevice(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price, double power, double displayDiagonal, String cpu, int ram) {
		super(id, type, manufacturer, model, color, price, power, displayDiagonal);
		this.cpu = cpu;
		this.ram = ram;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) throws IncorrectDataEntryException {
		if (ram > 0) {
			this.ram = ram;
		} else {
			throw new IncorrectDataEntryException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
		}

	}

	public String getCpu() {

		return cpu;
	}

	public void setCpu(String cpu) throws IncorrectDataEntryException {
		if (cpu != null) {
			this.cpu = cpu;
		} else {
			throw new IncorrectDataEntryException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
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

}
