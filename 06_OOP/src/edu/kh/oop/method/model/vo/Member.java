package edu.kh.oop.method.model.vo;

public class Member {

	
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	//생성자규칙
	// 반환형x 클래스명과동일명
	
	
	public Member() {	}

	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		
		
		
		// 매개변수로 전달받은값을 필드에대입과정
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	//매개변수생성자(모든필드리셋)
	
	
	
	
	
	
	
	
	
	
}
