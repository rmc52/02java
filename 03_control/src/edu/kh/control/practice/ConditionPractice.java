package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("숫자를1개입력하세요 : ");
		int input = sc.nextInt();
		
		// String result; 결과 저장용변수
		
		
		
		if( input % 2 == 0 && input >= 0) {
			System.out.println("짝수");
		} else if( input % 2 == 1 && input >= 0 ) {
			System.out.println("홀수");
		} else {
			System.out.println("양수만 입력");
		}
					
	}
	
	public void practice2() {
		/*
		국어, 영어, 수학 세 과목의 점수를 키보드로 '입력 받고' 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		*/
		System.out.print("국 : ");
		int input1 = sc.nextInt();
		System.out.print("영 : ");
		int input2 = sc.nextInt();
		System.out.print("수 : ");
		int input3 = sc.nextInt();
		
		int total = input1 + input2 + input3;
		double num = total / 3.0;
		
		if ( input1 > 100 || input1 < 0 || input2 > 100 || input2 < 0 || input3 > 100 || input3 < 0 ) {
			System.out.print("오류");
			return;
		}
		
		
		
		if (input1 >= 40 && input2 >= 40 && input3 >= 40 && num >= 60 ) {
			System.out.printf("국어:%d 영어:%d 수학:%d 합계:%d 평균:%.1f 축하합니다.합격입니다.", 
					input1, input2, input3, total, num);					
		} else {
			System.out.print("불합격입니다");
		};
		
		
		
		
		
		
	}
	
	public void practice3() {
		/*
		 * 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.
		 * (2월 윤달은 생각하지 않습니다.)
			잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. 
			(switch문 사용)
		 * 
		 * 
		 */
		
		System.out.print("월 : ");
		int season = sc.nextInt();
		
		String date;
		
		
		switch( season ) {
		// case 1: case 3: case 5: case 7: ...
		case 1,3,5,7,8,10,12 :
		date = "31"; System.out.print(season +"월은 31까지"); 

		break;

		case 2,4,6,9,11:
		date = "30"; System.out.print(date); 
		break;

		

		default:
			System.out.print(season + "는 잘못된값"); 
		}
		
		
	}
	public void practice4() {}
	public void practice5() {} // 원본참고
	
}
