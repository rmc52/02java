package com.hw2.model.dto;

public class Tiger extends Animal {

	
	
	
	public Tiger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Tiger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("포효");
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " 가 어흥하며 포효";
	}
	
	
	
	
}
