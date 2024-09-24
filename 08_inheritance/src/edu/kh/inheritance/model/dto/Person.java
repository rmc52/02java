package edu.kh.inheritance.model.dto;

public class Person {

	
	protected String name;
	private int age;
	private String nationality;
	
	
	
	{
		//초기화블록
	}
	
	
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}










	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	
	public void breath() {
		System.out.println("사람은 숨을쉼");
		
	}
	public void move() {
		System.out.println("사람은 움직임");
		
	}
	
	
	
	@Override
	public String toString() {
		// 
		return name + "/"+age+"/"+nationality;
	}
	
}
