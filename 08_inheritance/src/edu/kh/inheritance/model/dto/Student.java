package edu.kh.inheritance.model.dto;

public class Student extends Person {

	/*private String name;
	private int age;
	private String nationality;*/
	private int grade;
	private int classRoom;
	
	
	
	public Student(){}
	
	
	public Student(int grade, int classRoom) {
//		super(name, age, nationality); 에러뜸
		this.grade = grade;
		this.classRoom = classRoom;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	

	/*public String getName() {
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
	}*/
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	
	
}
