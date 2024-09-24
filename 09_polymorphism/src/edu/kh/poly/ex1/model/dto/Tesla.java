package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car{

	
	private int batteryCapacity;
	
	
	public Tesla() {
		// TODO Auto-generated constructor stub
	}


	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}


	public int getBatteryCapacity() {
		return batteryCapacity;
	}


	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	
	// super = car
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "/" + batteryCapacity;
	}
	
	
	
	
}
