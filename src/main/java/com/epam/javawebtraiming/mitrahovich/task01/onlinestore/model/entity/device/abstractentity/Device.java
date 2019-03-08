package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.type.DeviceType;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device.WrongSetColorException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device.WrongSetIdException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device.WrongSetManufacturerException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device.WrongSetModelException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device.WrongSetPriceException;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.exception.logical.device.WrongSetTypeException;

/**
 * @author Mitrahovich
 *
 */
public class Device implements Serializable, Copyble<Device> {

	private static final long serialVersionUID = -4862222841587226943L;
	private int id;
	private DeviceType type;
	private String manufacturer;
	private String model;
	private String color;
	private BigDecimal price;

	public Device() {
		super();

	}

	/**
	 * @param id
	 * @param type
	 * @param manufacturer
	 * @param model
	 * @param color
	 * @param price
	 */
	public Device(int id, DeviceType type, String manufacturer, String model, String color, BigDecimal price) {
		this.id = id;
		this.type = type;
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
		this.price = price;
	}

	/**
	 * @param device
	 */
	public Device(Device device) {
		this.id = device.getId();
		this.type = device.getType();
		this.manufacturer = device.getManufacturer();
		this.model = device.getModel();
		this.color = device.getColor();
		this.price = device.getPrice();
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 * @throws WrongSetIdException
	 */
	public void setId(int id) throws WrongSetIdException {
		if (id > 0) {
			this.id = id;
		} else {
			throw new WrongSetIdException("Incorrect enter of " + this.getClass().getSimpleName() + " id");
		}

	}

	/**
	 * @return type
	 */
	public DeviceType getType() {
		return type;
	}

	/**
	 * @param type
	 * @throws WrongSetTypeException
	 */
	public void setType(DeviceType type) throws WrongSetTypeException {
		if (type != null) {
			this.type = type;
		} else {
			throw new WrongSetTypeException("Incorrect enter of " + this.getClass().getSimpleName() + " type");
		}
	}

	/**
	 * @return manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer
	 * @throws WrongSetManufacturerException
	 */
	public void setManufacturer(String manufacturer) throws WrongSetManufacturerException {
		if (manufacturer != null) {
			this.manufacturer = manufacturer;
		} else {
			throw new WrongSetManufacturerException(
					"Incorrect enter of " + this.getClass().getSimpleName() + " manufacturer");
		}

	}

	/**
	 * @return model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 * @throws WrongSetModelException
	 */
	public void setModel(String model) throws WrongSetModelException {
		if (model != null) {
			this.model = model;
		} else {
			throw new WrongSetModelException("Incorrect enter of " + this.getClass().getSimpleName() + " model");
		}

	}

	/**
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 * @throws WrongSetColorException
	 */
	public void setColor(String color) throws WrongSetColorException {
		if (color != null) {
			this.color = color;
		} else {
			throw new WrongSetColorException("Incorrect enter of " + this.getClass().getSimpleName() + " color");
		}

	}

	/**
	 * @return price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price
	 * @throws WrongSetPriceException
	 */
	public void setPrice(BigDecimal price) throws WrongSetPriceException {
		if (price.compareTo(new BigDecimal(0)) >= 0) {
			this.price = price;
		} else {
			throw new WrongSetPriceException("Incorrect enter of " + this.getClass().getSimpleName() + " price");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + id;
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (id != other.id)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "id: " + id + ", device type: " + type.getType() + ", manufacturer: " + manufacturer + ", model: "
				+ model + ", color: " + color + ", price: " + String.format("%.2f", price) + "$";
	}

	/**
	 * @return Device
	 */
	public Device copy() {

		return new Device(this);

	}
}
