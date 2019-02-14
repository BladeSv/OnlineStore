package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity;

public abstract class AbstractElectric extends AbstractDevice {
private double power;
private double weight;


public AbstractElectric() {
	super();
	// TODO Auto-generated constructor stub
}













public AbstractElectric(int id, String type, String manufacturer, String model, String color, double power,
		double weight) {
	super(id, type, manufacturer, model, color);
	this.power = power;
	this.weight = weight;
}







public double getWeight() {
	return weight;
}


public void setWeight(double weight) {
	this.weight = weight;
}


public double getPower() {
	return power;
}


public void setPower(double power) {
	this.power = power;
}













@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	long temp;
	temp = Double.doubleToLongBits(power);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(weight);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	AbstractElectric other = (AbstractElectric) obj;
	if (Double.doubleToLongBits(power) != Double.doubleToLongBits(other.power))
		return false;
	if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
		return false;
	return true;
}






























}
