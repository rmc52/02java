package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice { // 기능 제공용 클래스
	// 메서드
	 public void practice1() {
		 
		 /*
모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 '입력 받고'
1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		  * 
		  * 스캐너필요, n빵, 남은사탕 별도출력
		  */
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("인원수");
			
			int input1 = sc.nextInt();
		 
			System.out.print("사탕개수");
			
			int input2 = sc.nextInt();
			
	
		 
	System.out.printf("인원수 %d, 사탕개수%d, 1인당사탕개수%d, 남은사탕%d", input1, input2, input2/input1, input2 % input1);
		 
		 
		 
	 }
	 
	 
	 public void practice2() {
 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("이름");
		String input1 = sc.next();
		 
			System.out.print("학년");
		int input2 = sc.nextInt();
	
		System.out.print("반");
		int input3 = sc.nextInt();
		
		System.out.print("번호");
		int input4 = sc.nextInt();
		
		System.out.print("성별");
		String input5 = sc.next();
		
		System.out.print("성적");
		double input6 = sc.nextDouble();
	
		 
	System.out.printf("%d학년, %d반, %d번, %s, %s의 성적은, %.2f이다.",
				input2, input3, input4, input1, input5, input6);
		 
		 
		 
		 
	 }
	 public void practice3() {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("국어");
			int input1 = sc.nextInt();
		 
			System.out.print("영어");
			int input2 = sc.nextInt();
			
			System.out.print("수학");
			int input3 = sc.nextInt();
			
			
			
			
		 
	System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 합계 : %d, 평균 : %.1f", 
			input1, input2, input3, input1 + input2 + input3, (input1 + input2 + input3)/3.0);
		 // 평균 나눌때 3으로 나누니 에러뜸.. 형변환이 원인?
		 
	 }
}
