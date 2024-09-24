package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService {

	
	private static final String String = null;

	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null; //가입한회원의 정보를저장할변수(회원가입저장), db정보개념
	private Member loginMember = null; // 로그인한회원의 정보를 저장할변수 // 이건 개인의정보
	
	
	// 기능 (생성자, 메서드)
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		
		int menuNum = 0; // 메뉴 선택용 변수
		
		do {
			
			System.out.println("==회원정보관리프로그램====");
			System.out.println("1. 회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원정보조회");
			System.out.println("4.회원정보수정");
			System.out.println("0.프로그램종료");
			
			System.out.println("메뉴입력:");
			menuNum = sc.nextInt();
			sc.nextLine();//개행제거
			
			switch(menuNum) {
			
			case 1 : /*회원가입*/ break;
			case 2 : /*로그인*/ break;
			case 3 : /*조회*/ break;
			case 4 : /*수정*/ break;
			case 0 : System.out.println("종료"); break;
			default : System.out.println("잘못입력");
			
			}
			
			
			
			
			
		}while(menuNum != 0); // menunum이 0이면반복종료
		
		
		
		
		
	}
	
	//crud
	
	//c
	
	public String signUp() {
		
		System.out.println("회원가입");
		
		System.out.println("id");
		String memberId = sc.next();
		System.out.println("pw");
		String memberPw = sc.next();
		System.out.println("pwchck");
		String memberPw2 = sc.next();
		System.out.println("name");
		String memberName = sc.next();
		System.out.println("age");
		int memberAge = sc.nextInt();
		
		// 비번,비번확인이 일치하면 회원가입
		//아니면 빠꾸
		
		if(memberPw.equals((memberPw2))) {
			
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			
			return "회원가입성공";
		}else {
			return "회원가입실패";
		}
		
		
		//crud
		//r
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
