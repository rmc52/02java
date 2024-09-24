package edu.kh.oarr.model.vo;

public class Member {

	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
		private String region;

	
	
	
	public Member() {
		// TODO Auto-generated constructor stub
	}




	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}
	
	
	public String getMemberId() {
		return memberId;
		
		// 이 메서드를 호출한쪽으로 memberid에 저장된값을 돌려보낸다
		
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




	public String getRegion() {
		return region;
	}




	public void setRegion(String region) {
		this.region = region;
	}


	
	
}
