package com.hw2.model.dto;

public abstract class Animal {

	
	protected String name;
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	
	abstract void sound();

	
	
	
}
