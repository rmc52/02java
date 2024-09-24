package edu.kh.inheritance.model.dto;



public class Employee extends Person{

	private String company;

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}


	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
	//person으로부터 상속받은 메서드중
	// move 메서드를 employee에 맞게 재정의(==오버라이딩)
	
	//@Override : 해당메서드가 재정의되었음을 컴파일러에게 통보 -> 컴파일러에게 문법체크하게 알림
	
	@Override 
	public void move() {
		System.out.println("오버라이딩된 move()");
		System.out.println("일하고퇴근");
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
}
