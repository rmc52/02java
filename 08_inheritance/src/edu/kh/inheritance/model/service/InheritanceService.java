package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {

	public void ex1() {
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("dd");
		
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		
		
		
		Student std = new Student();
		std.setGrade(3);
		std.setClassRoom(5);
		
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("dd");
		
		
		System.out.println(std.getGrade());
		
		
		
		
		
		
		Employee emp = new Employee();
		
		// Employee만의 고유 메서드
		
		emp.setName(null);
		
		p.breath();
		
		p.move();
		
		std.breath();
		
	}
	
		public void ex2() {
			
			// super생성자이용
//			Student std = new Student("김철수",1,"한국",1,3); 에러
			
		}
	
		public void ex23() {
			
			
			Student std = new Student();
			Employee emp = new Employee();
			
			std.move();
			emp.move();
			
		}
		
		public void ex4() {
			
			
			
		}
		
}
