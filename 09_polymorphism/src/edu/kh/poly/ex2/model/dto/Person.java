package edu.kh.poly.ex2.model.dto;

public class Person extends Animal {

	private String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	
	




	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}







	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
	
	
	
}
