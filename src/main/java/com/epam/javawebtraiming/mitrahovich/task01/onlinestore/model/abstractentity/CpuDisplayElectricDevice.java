package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.type.DeviceType;

public class CpuDisplayElectricDevice extends DisplayElectricDevice {

	private String cpu;
	private int clockFrequency;
	private int ram;
	private String operatingSystem;

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
	 * @param weight
	 * @param displayDiagonal
	 * @param displayResolution
	 * @param cpu
	 * @param clockFrequency
	 * @param ram
	 * @param operatingSystem
	 */
	public CpuDisplayElectricDevice(int id, DeviceType type, String manufacturer, String model, String color,
			double price, double power, double weight, double displayDiagonal, String displayResolution, String cpu,
			int clockFrequency, int ram, String operatingSystem) {
		super(id, type, manufacturer, model, color, price, power, weight, displayDiagonal, displayResolution);
		this.cpu = cpu;
		this.clockFrequency = clockFrequency;
		this.ram = ram;
		this.operatingSystem = operatingSystem;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getClockFrequency() {
		return clockFrequency;
	}

	public void setClockFrequency(int clockFrequency) {
		this.clockFrequency = clockFrequency;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + clockFrequency;
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
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
		if (clockFrequency != other.clockFrequency)
			return false;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (ram != other.ram)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "CPU:" + cpu + ", cpu clock frequency:" + clockFrequency + "MHz, RAM:" + ram
				+ "GB, operating system=" + operatingSystem;
	}

}
