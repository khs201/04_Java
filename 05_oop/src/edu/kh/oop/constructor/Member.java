package edu.kh.oop.constructor;

/* 오버로딩(Over Loading : 과적)
 * - 한 클래스 내에 동일한 이름의 메서드를 여러 개 작성하는 기법
 * 
 * - 같은 이름의 메서드가 수행하는 기능은 기본적으로 같으나
 * 	 전달받은 매개변수에 따라서 조금씩 동작이 달라야 하는 경우
 * 	 상황 별로 정의
 * 
 *  - 오버로딩의 조건
 *  1) 메서드 이름은 똑같아야 한다
 *  2) 매개변수는 개수, 타입, 순서가 하나라도 달라야 한다
 *  
 *  */

public class Member {
	// 필드 ( == 멤버 변수)
	// - 클래스 변수 : static이 붙은 변수
	// -> static 메모리에 할당될 때 클래스명.변수명으로 할당되기 때문에

	// - 인스턴스 변수 : static이 없는 변수
	// -> 인스턴스(객체)가 생성될 때 heap 메모리에 할당되기 때문에

	private String memberId; // 아이디
	private String memberPw; // 비번
	private String memberName; // 이름
	private int memberAge; // 나이

	// 생성자 : 객체 생성 시 필드 초기화 + 특정 기능 수행하는
	// 일종의 메서드

	// 작성 규칙
	// 1) 반환형 없음
	// 2) 생성자 이름은 클래스명과 동일

	/**
	 * 기본 생성자 - 매개 변수가 없는 형태 - 생성자가 하나도 작성되지 않은 경우 컴파일러가 자동으로 추가
	 */
	public Member() {

		System.out.println("[기본] 생성자로 Member 객체 생성됨");

		memberId = "아이디를 입력해 주세요";
		memberPw = "비번을 입력해 주세요";
		memberName = "이름을 입력해 주세요";
	}

	/* 매개 변수 생성자 */
	// - 객체 생성 시 매개 변수로 전달된 값을
	// 생성된 객체의 필드에 초기화하는 용도의 생성자
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		System.out.println("[매개 변수] 생성자로 객체 생성됨");

		// this. == 생성되고 있는 객체
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	// 오버로딩을 이용해서 생성자 만들기
	public Member(String memberId) { // 매개변수 개수가 다름
		this.memberId = memberId;
	}

	public Member(String memberId, String memberPw) { // 매개변수 개수가 다름
		this.memberId = memberId;
		this.memberPw = memberPw;
	}

	public Member(int memberAge) {// 매개 변수 타입이 다름
		this.memberAge = memberAge;
	}

	public Member(String memberId, int memberAge) { // 매개 변수 타입이 다름
		this.memberId = memberId;
		this.memberAge = memberAge;
	}

	// 매개 변수 순서가 다름
	public Member(int memberAge, String memberId) { // 매개변수 순서가 다름
		this.memberId = memberId;
		this.memberAge = memberAge;
	}

	// -> Member(int, String) 생성자 중복
	// -> 오버로딩은 변수명이 아닌 자료형이 개수, 순서, 타입 중 하나라도 달라야 성립
//	public Member(int memberAge, String memberPw) {
//		
//	}

	/* this() 생성자 */
	// -> 코드 중복 감소(길이 감소)
	public Member(int memberAge, String memberId, String memberPw) {
		this(memberAge, memberId); // 현재 클래스에 있는 다른 생성자를 호출
		
		this.memberPw = memberPw;
		
	}

	// 기능(메서드)

	// setter : 전달받은 매개 변수를 현재 객체의 필드에 대입
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}// setid

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	// getter : 현재 객체의 필드를 외부에서 얻어갈 수 있게 반환
	public String getMemberId() {
		return memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	/**
	 * 현재 객체의 필드값을 한번에 출력
	 */
	public void inform() {
		System.out.println("\n--------------");
		System.out.println("member Id : " + memberId);
		System.out.println("member Pw : " + memberPw);
		System.out.println("member Name : " + memberName);
		System.out.println("member Age : " + memberAge);
		System.out.println("--------------\n");
	}

} // Member
