package edu.kh.variable.ex2;

import java.util.Scanner; // java.util 패키지에서 scanner class(설계도)수입

//import : 다른 패키지에 존재하는 클래스를 얻어오는 구문

public class ScannerExample {
public static void main(String[] args) {
	
	// scanner : 프로그램실행중 키보드 입력을받을수있게하는 역할
	
	// scanner생성
	// -> 프로그램안에 스캐너라는 기계를 만드는것
	
	Scanner sc = new Scanner(System.in);
	//오류 원인 -> 만들고 싶은데 설계도(class)가 없어서 못만들고있음
	
	// -> import구문 작성시 오류해결
	
	
	System.out.print("정수1입력:");
	
	int input1 = sc.nextInt(); //정수를 입력받는것
	//  입력받은 정수를 input1 변수에 대입
	//  nextInt() : 다음 입력된 정수를 읽어옴
	
	
	System.out.print("정수2입력:");
	
	int input2 = sc.nextInt();
	
	System.out.printf("%d +%d= %d\n", input1, input2, input1+input2);
}
}
