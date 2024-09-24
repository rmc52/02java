package edu.kh.oop.cls.model.vo;

public class User {

	// 
	
	// 속성 (필드)
	// 아이디, 비밀번호, 이름, 나이 ,성별 (추상화 진행)
	// 데이터 직접접근 불가 원칙 -> 
	// 필드는 기본적으로 모두 private(캡슐화 진행)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	
	
	
	
	
	// 기능 (생성자 + 메서드)
	
	// 기본생성자
	public User() {
		//기능
		System.out.println("기본생성자로 User 객체 생성");
		
		//필드 초기화
		userId = "user01";
		userPw = "pass01";
		userName = "길동";
		userAge = 20;
		userGender = '남';
		
		
	}

// 매개변수생성자
	
	public User(String userId, String userPw) {
		System.out.println("매개변수 생성자를 이용하여 User객체 생성");
		System.out.println(userId + " / " + userPw);
		
		// 필드 초기화
		this.userId = userId;
		this.userPw = userPw;
		
		
		
		
		//필드 전부초기화목적 매개변수
		
		
		
	}




	public String getUserId() {
		return userId;
	}






	public void setUserId(String userId) {
		this.userId = userId;
	}






	public String getUserPw() {
		return userPw;
	}






	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}






	public String getUserName() {
		return userName;
	}






	public void setUserName(String userName) {
		this.userName = userName;
	}






	public int getUserAge() {
		return userAge;
	}






	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}






	public char getUserGender() {
		return userGender;
	}






	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	
	
	
}
