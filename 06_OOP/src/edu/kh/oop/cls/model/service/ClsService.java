package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
//import edu.kh.oop.cls.model.vo.TestVO;
import edu.kh.oop.cls.model.vo.User;

// ClsService와 Student는 패키지가 다름
public class ClsService /* extends Student */ {
			//	부모로 Student 클래스를 상속받음
			// Student(부모) -> ClsService(자식)
	
	public void ex1() {
		// 클래스 접근제한자 확인하기
		Student std = new Student();
		// public class인 Student는 import 가능(어디서든 접근가능)
		
		//TestVO test = new TestVO();
		// (default) class인 TestVO는 import 불가능(다른패키지라 불가)
	
	
		// 필드 접근제한자 확인하기
		System.out.println( std.v1 );
		// -> 전체에서 직접 접근 가능한 public인 v1만 에러발생 X
		
		//System.out.println( std.v2 );
		//System.out.println( std.v3 );
		//System.out.println( std.v4 );
		
		
		// 상속 관계에서 직접 접근 가능범위 테스트
//		System.out.println( v1 ); // public - 프로그램 전체에서 접근가능
		
//		System.out.println( v2 ); 
		// Student 클래스를 상속받았으므로 Student의 protected 변수인
		// v2는 직접 접근 가능
		//System.out.println( v3 ); // (default) 다른패키지 X
		//System.out.println( v4 ); // 해당클래스가 아닌 다른클래스 X
		
		
	
	
	
	
	}

	public void ex2() {
		// static 필드 확인 예제
		
		// 학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		// 학생 객체에 name 세팅
		std1.setName("길동");
		std2.setName("금희");
		
		Student.schoolName = "kh정보교육원";
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		//노란줄 경고 : 제대로 작성을 안해서
		// 스태틱필드는 '클래스명.변수명'으로 사용
		
		System.out.println(Student.schoolName);
		
	}
	
	
	
	public void ex3() {
		// 생성자 확인 테스트
		
		// User 기본 생성자를 이용해서 객체 생성 u1
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		User u2 = new User();
		
		u2.setUserId("ggg");
		
		
		User u3 = new User("test3", "password333");//매개변수생성자
		
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		
		
		
	}
	
	
	
	
	
}
