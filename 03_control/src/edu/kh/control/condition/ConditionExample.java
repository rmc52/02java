package edu.kh.control.condition;

import java.util.Scanner; // (자동 단축키 : ctrl +shift + o )

public class ConditionExample { // 기능 제공용 클래스

	Scanner sc = new Scanner(System.in);
	
	
	public void ex1() {
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다"출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if (input > 0 ) {
			System.out.println("양수입니다");
		}
		if(input<=0) {
			System.out.println("양수가아님");
		}
		
		
		
		
		
		
	}
	public void ex2() {
		
		// if-else
		// 홀짝검사, 입력받은정수값이 홀수이면 "홀수"출력
		// 0이면 "0입니다"
		// 짝수면 " 짝수입니다"출력
		// else if 사용x, 중첩if문 사용하기
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		
		if(input % 2 != 0) {
			System.out.println("홀수입니다");
		} else { //짝수 또는 0입력시 수행
			// 중첩 if
			if(input == 0) {
				System.out.println("0입니다");
			} else {
					System.out.println("짝수입니다");
				}
			}
		}
		
		
		
		
		
		
		
	
	public void ex3() {
		
		// if(조건식) - else if( 조건식 ) - else
		
		// 양수, 음수, 0판별
		
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0 ) {
			System.out.println("양수 입니다");
		} else if(input <0) { //바로위의 if문이 만족되지 않은경우 수행
			System.out.println("음수입니다");
			
		} else {
			System.out.println("0입니다");
		}
		
		
		
		
		
	}
	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 1,2,12 겨울 (-15도 이하 : "한파 경보" / -12도 이하"한파주의보")
		// 3~5 봄
		// 6~8 여름 (35도 이상 : "폭염 경보" / 35도 이상 :" 폭염 주의보")
		// 9~11 가을
		// 1~12 사이가 아닐땐 "해당하는 계절이 없다" 출력
		
		System.out.println("달 입력 : ");
		int month = sc.nextInt();
		
		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		if(month == 1 || month == 2 || month == 12 ) {
			season = "겨울";
			System.out.println("온도 입력 : ");
			int temperature = sc.nextInt();
			if(temperature <= -15) {
			 // 겨울한파경보
			 season += "한파경보";
			 
			 // season = season + "한파경보"; 
			 			// "겨울" + "한파경보"
			 
			} else if(temperature <= -12) {
				season += "한파 주의보"; // "겨울 한파주의보"
			}
		 
		} else if( month >= 3 && month <= 5) {
			season = "봄";
			
			
		} else if(month >= 6 && month <= 8) {
			season = "여름";
			System.out.println("온도 입력 : ");
			int temperature = sc.nextInt();
			if(temperature >= -35) {
			 // 겨울한파경보
			 season += "폭염경보";
			 
			 // season = season + "한파경보"; 
			 			// "겨울" + "한파경보"
			 
			} else if(temperature >= -33) {
				season += "폭염 주의보"; // "겨울 한파주의보"
			}
			
		} else if(month >= 9 && month <= 11) {
			season = "가을";
			
			
		} else {
			season = "해당x";
			
		}
		System.out.println(season);
				
		
		
		
		
		
		
	}
	public void ex5() {
		// 나이를 입력 받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 : "청소년 입니다."
		// 19세 초과 시 : "성인 입니다". 출력
		
		System.out.print("나이 : ");
		int input = sc.nextInt();
		
		if(input > 19 ) {
			System.out.print("성인입니다");
		} else if(13 < input && input <= 19) { 
			System.out.print("청소년");
			
		} else {
			System.out.print("어린이입니다");
		}
		
		
		
		
	}
	public void ex6() {
		// 점수(100점 만점)를 입력 받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100 초과 : "잘못 입력하셨습니다"
		
		System.out.println("점수 입력 : ");
		int input = sc.nextInt();
		
		if(input >= 90 && input <= 100) {
			System.out.println("A");
		} else if(input >= 80 && input < 90) { 
			System.out.println("B");
		} else if(input >= 70 && input < 80) {
			System.out.println("C");
		} else if(input >= 60 && input < 70) { 
		System.out.println("D");
		}else if(input >= 0 && input < 60) {
			System.out.println("F");
		} 
		else { 
			System.out.println("잘못입력");
		}
		
		
	}
	public void ex7() {
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		
		// 인풋1 나이, 인풋2 키 / I1 12 && I2 140.0, 
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result;
		
		if( age < 0 || age > 100) {
			result = "오입력";
			
		} else {
			System.out.print("키입력:");
			double height = sc.nextDouble();
			
			if( age < 12) {
				result = "적정연령x";
			} else if(height < 140.0) {
				result = "적정키x";
			} else {
				 result = "탑승가능";
			}
		}
			
		}
		
		
		
	
	
	
	
	public void ex8() {
				// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"
	
		System.out.print("나이 : ");
		int input1 = sc.nextInt();
		System.out.print("키 : ");
		double double2 = sc.nextDouble();
		
		if(input1 > 100 || input1 <0) {
			System.out.println("나이잘못입력");
				return;
		} 
		if(double2 > 250.0 || double2 <0) {
			System.out.println("키잘못입력");
				return;
		} 
		
		
		if(input1 >= 12 && double2 >= 140 ) { 
		System.out.println("나이 O , 키 O : \"탑승 가능\"");
				
		} else if (input1 >= 12 && double2 < 140){
			System.out.println("나이 O , 키 X : \"나이는 적절하나, 키가 적절치 않음\"");
		} else if (input1 < 12 && double2 >= 140){
			System.out.println("나이 X , 키 O : \"키는 적절하나, 나이는 적절치 않음");
		} else if(input1 < 12 && double2 < 140){
			System.out.println("나이 X , 키 X : \"나이와 키 모두 적절치 않음\"");
		}
	}
	
}
