package com.kh.inheritance.model.dto.Phone;

public class SmartPhone extends Phone{

	private String operatingSystem;
	private int storageCapacity;
	
	
	
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}



	
	
	

	public SmartPhone(String operatingSystem, int storageCapacity, String brand, String model, int year, int price) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}







	public String getOperatingSystem() {
		return operatingSystem;
	}




	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}




	public int getStorageCapacity() {
		return storageCapacity;
	}




	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

@Override
public void printinfo() {
	// TODO Auto-generated method stub
	super.printinfo();
	System.out.println("Operating System" + operatingSystem);
}








@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString() + operatingSystem + "/" + storageCapacity;
	
}
	
	
	
	
	
	
	
	
	
}
