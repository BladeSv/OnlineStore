package com.epam.javawebtraiming.mitrahovich.task01.onlinestore.model.abstractentity;

public class DisplayElectricDevice extends ElectricDevice {
 
	private double displayDiagonal;
	private String displayResolution;
	
	
	
	
	
	


	public DisplayElectricDevice() {
		// TODO Auto-generated constructor stub
	}




	
	public DisplayElectricDevice(int id, String type, String manufacturer, String model, String color, double power,
			double weight, double displayDiagonal, String displayResolution) {
		super(id, type, manufacturer, model, color, power, weight);
		this.displayDiagonal = displayDiagonal;
		this.displayResolution = displayResolution;
	}





	public double getScreenDiagonal() {
		return displayDiagonal;
	}
	public void setScreenDiagonal(double screenDiagonal) {
		this.displayDiagonal = screenDiagonal;
	}
	public String getScreenResolution() {
		return displayResolution;
	}
	public void setScreenResolution(String screenResolution) {
		this.displayResolution = screenResolution;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(displayDiagonal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((displayResolution == null) ? 0 : displayResolution.hashCode());
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
		DisplayElectricDevice other = (DisplayElectricDevice) obj;
		if (Double.doubleToLongBits(displayDiagonal) != Double.doubleToLongBits(other.displayDiagonal))
			return false;
		if (displayResolution == null) {
			if (other.displayResolution != null)
				return false;
		} else if (!displayResolution.equals(other.displayResolution))
			return false;
		return true;
	}
	
	
}
