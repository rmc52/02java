package edu.kh.poly.ex1.model.dto;

public class Car {

	
	private String engine;
	private String fuel;
	private int wheel;
	
	
	

	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}










	public String getEngine() {
		return engine;
	}










	public void setEngine(String engine) {
		this.engine = engine;
	}










	public String getFuel() {
		return fuel;
	}










	public void setFuel(String fuel) {
		this.fuel = fuel;
	}










	public int getWheel() {
		return wheel;
	}










	public void setWheel(int wheel) {
		this.wheel = wheel;
	}










	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return engine + fuel + wheel;
	}
	
	
}



