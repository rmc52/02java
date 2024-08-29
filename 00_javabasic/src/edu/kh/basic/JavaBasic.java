package edu.kh.basic;

// 한줄주석 : 컴파일러가 해석하지 않는 부분
/*
 * 범위주석
 * */ 


// class : 자바 코드가 작성되는 영역

public class JavaBasic {
		//main 쓰고 컨트롤스페이스 = 자동완성
	public static void main(String[] args) {
		// main method(메서드) : 자바 어플리케이션(프로그램)을 실행하기위해
		// 반드시 필요한 메서드
		
		// 콘솔창에 출력 메서드(콘솔로그같은거)
		System.out.println("헬로월드");
		System.out.println("ㅇㄴㅁㄹ");
		// syso 치고 컨트스페 = 자동완성 System.out.println(); 
		// 한줄복사 = 컨트 알트 상하방향키
		// 실행 : 컨트롤+f11
	
		System.out.println("--------------");
		
		
		// 숫자 연산
		
		System.out.println("1 + 2"); // 1+2
		System.out.println(1 + 2); // 3
		
		// "" 안에 작성된 코드는 단순 문자열로 인식
		// "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		
		
		System.out.println(50 - 23);
		System.out.println(12 * 13);
		System.out.println(327 / 3);
		System.out.println(12 % 2);
		
		// "" (문자열) + 숫자 함께 작성

		System.out.println("14 * 19 = " + 266 );
		System.out.println("14 * 19 = " + 14 * 19 );
		System.out.println("90 + 70 + 65 = " + 90 + 70 + 65 );// +기를 문자열 이어쓰기로 인식
		System.out.println("90 + 70 + 65 = " + (90 + 70 + 65) );
		// 자바는 사칙연산 우선순위를 그대로따름
		// -> 우선 계산을 원하면 ()괄호 사용
		
		// + 기호의 역할
		// -> 숫자 + 숫자 = 덧셈연산결과
		// -> 문자열 + 숫자 or 문자열 + 문자열 --> 이어쓰기
		
		
		
		
		
	}
	
}
