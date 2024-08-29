package edu.kh.variable.ex1;

public class VariableExample4 {
	public static void main(String[] args) {
		
		/* 
		 * 강제 형변환
		 * 
		 * -기존 자료형을 원하는 자료형으로 강제변환시키는것
		 * 
		 * 1) 값의 범위가 큰 자료형을 작은 자료형으로 변환할때사용
		 * 2) 출력되는 데이터의 표기법을 변환시키고싶을때
		 * 
		 * 강제형변환방법
		 * -자료형을 변환시키고싶은 값 또는 변수 앞에(자료형) 을 작성
		 * 
		 */
		
		double temp = 3.14;
		
		int num = (int)temp;
		
		System.out.println("temp : " + temp);
		System.out.println("num : " + num);
			// 실수 -> 정수형 변환시 소수점 버림처리(데이터 손실)
		
		// int -> byte 강제형변환
		
		
		int iNum = 290;
		byte bNum = (byte)iNum;
		System.out.println(bNum); //34
		
		
		// 같은 정수형끼리도 값의 범위차이때문에 데이터손실 발생
		
		//char -> int 강제형변환
		char ch ='A'; // 65
		
		// 강제형변환
		System.out.println( (int)ch ); // 65
		
		// int -> char 강제형변환
		// 44085
		int iNum3 = 44085;
		System.out.println((char)iNum3);
		
		
		//오버플로우현상은 컴이 미리예측못함
		
		// -> 개발자가 미리 예측해야함.
		
		int i6 = 2147483647; // int의 최대값
		int result6 = i6 + 1 ; // 예측을 못함
		System.out.println(result6); // -2147483648
		
		
	}
}
