package edu.kh.poly.ex2.model.dto;

public abstract class Animal {
	//추상클래스(abstract class)
	// 1. 미완성 메서드(추상)를 보유하고 있는 클래스
	// 2. 객체로 만들수없는 클래스
	// -> 여러 타입들을 관리하기 위한 상위 타입의 목적
	// 객체로 생성하여 사용하기 위한 목적이 아니다.
	
	private String type;
	private String eatType;
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}



	
	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public String getEatType() {
		return eatType;
	}




	public void setEatType(String eatType) {
		this.eatType = eatType;
	}




	public void eat() {
		
	}
	public void breath() {
		
	}
	public void move() {
		
	}
}
