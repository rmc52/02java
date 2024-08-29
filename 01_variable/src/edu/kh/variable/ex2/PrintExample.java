package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {
		
		// System.out.print() : 단순 출력용 메서드(출력후 줄바꿈x)
		// System.out.println() : 한줄출력용메서드(줄바꿈o)
		// 줄바꿈 여부 차이점은 있지만 괄호안의 내용이
		// 그대로 출력된다는것은 똑같음
		
		// syso ctrl+space
		System.out.println("테스트1");
		System.out.println("테스트2"); //줄바꿈하고 마무리
		// 실행 ctrl + f11
		
		
		System.out.print("테스트3");
		System.out.println(); // 내용없으면 단순줄바꿈
		
		System.out.print("테스트4");
		
		
//		System.out.printf() : 출력될 문자열형식을 패턴으로 지정하는 출력구문
		
		System.out.println(); // 위에 print구문 썼으니 줄바꿈해줌
		
		 int iNum1 = 10;
		 int iNum2 = 5;
		 
		 //10 + 5 = 15
		 System.out.println( iNum1 + "+"+iNum2+"="+(iNum1+iNum2));
		
//		 System.out.printf("패턴", 패턴에들어갈값);
		 
		 /*
		  * %d : 정수형, %o : 8진수, %x : 16진수
			%c : 문자, %s : 문자열
			%f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
			%A : 16진수 실수
			%b : 논리형
		  * 
		  */
		 
		 
		 System.out.printf("%d+%d=%d\n", iNum1, iNum2, iNum1+iNum2);
		 // 줄바꿈 : \n
		 
		 
		 // 10+10*5/2=35
//		 System.out.printf( "10+10*5/2=35" );
		 System.out.printf( "%d+%d*%d/2=%d\n", iNum1, iNum1, iNum2, iNum1+iNum1*iNum2/2 );
		 
		 
		 // 패턴연습
		 int iNum3 = 3;
		 
		 System.out.printf("%d\n", iNum3); // 3
		 System.out.printf("%5d\n", iNum3); // 5칸 공간확보후 오른쪽정렬
		 System.out.printf("%-5d\n", iNum3); // 5칸 공간확보후 왼쪽정렬
		 
		 //소수점 자리 제어(반올림처리)
		 System.out.printf("%f\n", 10/4.0); // 2.500000
		 System.out.printf("%.2f\n", 10/4.0);// 소수점 둘째자리까지만 나타내고싶으면
		 System.out.printf("%.0f\n", 10/4.0); // 소수점 아래를 표현하지않겠다
		 
		 // 문자, 문자열, boolean
		 boolean isTrue = false;
		 char ch = '가';
		 String str = "안녕하세요"; //참조형
		 
		 //false / 가 / 안녕하세요
		 System.out.printf("%b/%c/%s\n",isTrue,ch,str);
		 //escape(탈출)문자 : 일반문자가아닌 특수문자표현
		 // \
		 
		 System.out.println("\\");
		 // \o/
		 System.out.println("\\o/");
		 
		 //tab : 한공간씩표현x, 한번에 공간차지
		 System.out.println("a\tb\tc\td");
		 
		 // 유니코드 이스케이프
		 System.out.println("\u0041"); //A
		 //유니코드(16진수)
		 // 65를 16진수로표현
		 // 65나누기 16하면 몫4, 나머지1
		 
		 
	}
	
	
}
