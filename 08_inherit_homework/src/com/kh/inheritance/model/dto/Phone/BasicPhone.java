package com.kh.inheritance.model.dto.Phone;


public class BasicPhone extends Phone{

	
	private boolean hasPhysicalKeyboard;
	
	public BasicPhone() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public BasicPhone(boolean hasPhysicalKeyboard, String brand, String model, int year, int price) {
		super(brand,model,year,price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	
	
	
	
	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}


public void checkkeybord() {
	
	
}

	
	
	
	
	
	
	
}
