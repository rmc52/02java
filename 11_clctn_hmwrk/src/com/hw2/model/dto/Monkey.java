package com.hw2.model.dto;

public class Monkey extends Animal {

	
	public Monkey() {
		// TODO Auto-generated constructor stub
	}
	
	public Monkey(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("우끼");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " 가 우끼끼";
	}
	
}
