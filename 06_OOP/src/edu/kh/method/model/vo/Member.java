package edu.kh.method.model.vo;

public class Member { // 속성 + 기능
	
	// 필드
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	
	// 생성자
	// 생성자 규칙 : 반환형이 없고 클래스명과 이름이 같아야 한다.
	
	// 기본생성자
	// ctrl + space + enter(제일첫번째)
	public Member() {}
	
	
	// 매개변수 생성자 (필드모두초기화)
	// alt + shift + s -> o
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		// 오버로딩 적용(매개변수 개수 다름)
		
		// 매개변수로 전달받은 값을 필드에 대입과정
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}


	
	
	// 메서드
	// getter / setter
	// alt + shift + s -> r
	public String getMemberId() {
		return memberId;
	}


	public String setMemberId(String memberId) {
		return this.memberId = memberId;
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
		
	

	
	
	

	

}
