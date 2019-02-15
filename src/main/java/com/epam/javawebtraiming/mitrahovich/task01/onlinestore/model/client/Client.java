package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.client;

import java.util.List;

import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity.Device;
import com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.order.Order;

public class Client {
private int id;
private String name;
private Order basket;
private List<Device> bought;

public Client() {
	// TODO Auto-generated constructor stub
}

public Client(int id, String name, Order basket, List<Device> bought) {
	this.id = id;
	this.name = name;
	this.basket = basket;
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

public Order getBasket() {
	return basket;
}

public void setBasket(Order basket) {
	this.basket = basket;
}

public List<Device> getBought() {
	return bought;
}

public void setBought(List<Device> bought) {
	this.bought = bought;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((basket == null) ? 0 : basket.hashCode());
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
	if (basket == null) {
		if (other.basket != null)
			return false;
	} else if (!basket.equals(other.basket))
		return false;
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
	return "Client [id=" + id + ", name=" + name + ", basket=" + basket + ", bought=" + bought + "]";
}




}
