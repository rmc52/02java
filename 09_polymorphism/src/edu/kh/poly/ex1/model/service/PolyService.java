package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {

	public void ex1() {

		// 다형성 확인 예제

		// car객체생ㅅㅇ

		Car car = new Car();

		Tesla tesla = new Tesla();

		Car car2 = new Tesla(); // tesla객체가 car로형변환(up캐스팅)
//		부모타입ㅇ로 아예  변경되어서 tesla의 고유필드,메서드 사용불가

		Car car3 = new Spark();

	}

	// 전달받은 car 또는 자식객체(테슬라,스파크)의 엔진,연료,바퀴갯수를 출력메서드
	public void printCar(Car temp) {

//		Car temp = c
		// 업캐스팅모양과 동일
		// == temp라는 매개변수에는 Tesla, Spark, Car의 주소가 넘어와도 된다(업캐스팅)
		System.out.println("엔진 : " + temp.getEngine());
		System.out.println("연료 : " + temp.getFuel());
		System.out.println("바퀴 : " + temp.getWheel());
		System.out.println();

	}

	// 매개변수로 전달받은 정수값에 따라 car, tesla,spark객체를만들어 반환하는메서드
	public Car createCar(int aa) {

		Car result = null;

		switch (aa) {

		case 1:
			result = new Car();
		case 2:
			result = new Tesla();
		case 3:
			result = new Spark();

		}
		return result;

	}

	public void ex2() {

		// 다형성을 이용한 매개변수사용법

		Tesla t = new Tesla("전기모터", "전기", 4, 1000000);

		Spark s = new Spark("경차엔진", "휘발유", 4, 0.5);

		Car c = new Car("경유엔진", "경유", 12);

		printCar(t);
		printCar(s);
		printCar(c);

		Car[] arr = { createCar(1), createCar(2), createCar(3) };

		
//		instanceof 연산자 : 객체의 자료형을 검사하는 연산자
		
		System.out.println(arr[1] instanceof Tesla ); // true(자기본인맞음)
		System.out.println(arr[1] instanceof Spark ); // false
		System.out.println(arr[1] instanceof Car ); // true
		
		
		
		
		
	}

	
	public void ex3() {
		
		
		//다운캐스팅
		
		// 이미 업캐스팅이 된상태에서만 진행가능
		
		// 강제형변환해서 자식전용 메소드도 사용가능케함
		
		
		System.out.println();
		
		// 주의 
		// . 연산자가 (tesla)형변환 연산자보다 우선순위 높음
		
		
	}
	
}
