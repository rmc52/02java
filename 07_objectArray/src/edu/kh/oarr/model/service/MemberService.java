package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	private Scanner sc = new Scanner(System.in);

	private Member[] memberArr = new Member[5]; // 객체배열선언

	// 현재로그인한 회원의 정보를 저장할 참조변수 선언

	private Member loginMember = null;

	public MemberService() { // 기본생성자

		// memberArr 배열 0,1,2 인덱스 초기화

		memberArr[0] = new Member("user01", "pass01", "홍길동", 30, "서울");
		memberArr[1] = new Member("user02", "pass02", "길동", 30, "경기;");
		memberArr[2] = new Member("user03", "pass03", "동", 30, "강원");

	}

	// 메뉴 출력용 메서드
	public void displayMenu() {

		int menuNum = 0; /// 메뉴 선택용 변수

		do {

			System.out.println("===회원정보관리프로그램 v2===");
			System.out.println("1.회원가입");
			System.out.println("21.회원가입");
			System.out.println("31.회원가입");
			System.out.println("41.회원가입");

			System.out.print("메뉴입력");
			menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {

			case 1:
				System.out.println(signUp());
				break;
			case 2:
				System.out.println(login());
				break;
			case 3:
				/* 조회 */ break;
			case 4:
				/* 수정 */ break;
			case 5:
				searchRegion(); break;
			case 0:
				System.out.println("프로그램종료...");
				break;
			default:
				System.out.println("오입력");

			}

		} while (menuNum != 0);

	}

	// memberArr의 비어있는 인덱스번호를 반환하는 메서드
	// 단, 비어있는 인덱스가 없다면 -1반환

	public int emptyIndex() {

		// memberArr 배열을 0인덱스부터 인덱스끝까지 접근해서
		// 참조하는 값이 null인경우의 인덱스를 반환

		for (int i = 0; i < memberArr.length; i++) {

			if (memberArr[i] == null) {
				return i;
				// 현재 메서드를 종료하고 호출한곳으로 i값을 가지고돌아감
			}

		}
		// for문을 수행했지만 리턴이되지않은경우 해당위치코드수행
		// -> 배열에 빈칸이없다는소리
		return -1;
	}

	// 회원가입 메서드

	public String signUp() {

		System.out.println("\n======회원가입=====");

		// 새로가입할회원 정보저장예정. 빈공간 인덱스 번호 얻어오기

		int index = emptyIndex(); // memberArr배열에서 비어있는인덱스 반환받음
									// 없다면 -1반환

		if (index == -1) {
			// 칸x. 가입불가
			return "회원가입 불가능";
		}

		// 가입가능
		System.out.println("아이디 : ");
		String memberId = sc.next();
		System.out.println(" 비번 : ");
		String memberPw = sc.next();
		System.out.println(" 확인: ");
		String memberPw2 = sc.next();
		System.out.println(" 이름: ");
		String memberName = sc.next();
		System.out.println(" 나이 : ");
		int memberAge = sc.nextInt();
		System.out.println(" 지역 : ");
		String region = sc.next();

		// 비번확인으로 가입여부결정

		if (memberPw.equals(memberPw2)) {
			// 일치함

			// 새로운 member객체 생성후 인덱스 비는곳에 할당

			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);

			return "회원가입성공";

		} else {

			return "회원가입실패";
		}

	}

	// 로그인 메서드

	public String login() {
		System.out.println("아이디 : ");
		String memberId = sc.next();
		System.out.println(" 비번 : ");
		String memberPw = sc.next();

		// null 확인
		for (int i = 0; i < memberArr.length; i++) {

			if (memberArr[i] != null) { // 회원정보가 있을경우

				// memberArr[i] 회원정보 아이디 , 비번과 입력된 아디비번(memberId,pw)값을 비교
				if (memberArr[i].getMemberId().equals(memberId) && memberArr[i].getMemberPw().equals(memberPw)) {

					// 회원정보 참조 loginMember에 현재접근중인 member[ㅑ]주소를 얕복
					loginMember = memberArr[i];
					break; // 아디, 비번이 중복될수 없으므로 효율을위해 for문종료

				}

			}

			// 현재 메서드를 종료하고 호출한곳으로 i값을 가지고돌아감
		}

		if (loginMember == null) {

			return "일치x";
		} else {
			return loginMember.getMemberName() + "님환영합니다";

		}

	}

	// 회원검색메서드

	public void searchRegion() {

		System.out.println("회원검색(지역)");

		System.out.println("입력");
		String inputRegion = sc.next();

		// 검색결과 신호용 변수
		boolean flag = true;

		// 1) memberArr 배열의 모든 요소 순차 접근

		for (int i = 0; i < memberArr.length; i++) {

			// 2) 멤버i 요소가 null인경우 반복종료 = null 이후는 전부 null
			if (memberArr[i] == null) {
				break;

			}

			// 3)memberarr i 요소에 저장된지역이
			// 입력받은 지역과 같을경우
			// 멤버arr i 요소에 저장된 객체의
			// 회원의 아이디, 이름을 출력

			if (memberArr[i].getRegion().equals(inputRegion)) {

				System.out.printf("아이디 : %s, 이름: %s\n", 
						memberArr[i].getMemberId(), memberArr[i].getMemberName());
				flag = false; // 찾았다는신호;
			}

		}
if (flag) {
	System.out.println("일치하는결과x");
	
}
	}

	
	
	// 조회 메서드
	public String selectMember() {
//		1) 로그인여부확인
//		2) 로그인되어있는경우 현재로그인한회원의 정보를 출력할 문자열을 만들어 반환. 비번제외

		System.out.println("\n*****회원 정보 조회*****");
		
		if( loginMember == null ) {
			return "로그인 후 이용해주세요";
			// return; : 현재 메서드를 종료하고 함수를 호출한 쪽으로 되돌아가는 것
			// return 값; : 현재 메서드를 종료하고, 함수를 호출한 쪽으로 값을 가지고 되돌아가는것
		}

		String str = "이름 : " + loginMember.getMemberName();
		str += "\n아이디 : " + loginMember.getMemberId();
		str += "\n나이 : " + loginMember.getMemberAge() + "세";

		return str;

		
	}
	
	//정보 수정 메서드
	
	public int updateMember() {
		

System.out.println("\n****회원 정보 수정****");
		
		
		if(loginMember == null) {
			return -1;
		}
		
		
		System.out.print("수정할 이름 입력 : ");
		String inputName = sc.next();
		
		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		
		
		// 2-2) 비밀번호를 입력받아서 로그인한 회원의 비밀번호와 일치하는지 확인
		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.next();
		
		if( inputPw.equals(loginMember.getMemberPw()) ) {
			// -> 비밀번호가 일치하는 경우, 로그인한 회원의 이름과 나이 정보를 
			//    입력받은 값으로 변경 후 1 반환
			loginMember.setMemberName(inputName);
			loginMember.setMemberAge(inputAge);
			
			return 1;
			
		} else {
			// -> 비밀번호가 다를 경우 0 반환
			return 0;
			
		}
		
		
		
		
	}
	
	
	
	
	
	
}
