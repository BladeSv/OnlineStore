package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.client;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.device.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.entity.mycollection.interfacemycollecton.Collection;

public class Client {
	private int id;
	private String name;

	private Collection<Device> bought;

	public Client() {

	}

	/**
	 * @param id
	 * @param name
	 * @param bought
	 */
	public Client(int id, String name, Collection<Device> bought) {
		super();
		this.id = id;
		this.name = name;
		this.bought = bought;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Device> getBought() {
		return bought;
	}

	public void setBought(Collection<Device> bought) {
		this.bought = bought;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bought == null) ? 0 : bought.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Client other = (Client) obj;
		if (bought == null) {
			if (other.bought != null)
				return false;
		} else if (!bought.equals(other.bought))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name=" + name + ", bought=" + bought;
	}

}
