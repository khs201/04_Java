package edu.kh.oop.basic;


// 클래스 : 객체가 가져야 할 속성(값), 기능(메서드)를
// 				글(코드)로 작성해둔 문서(설계도) == 객체를 정의한 것


/**
 * 국민 객체를 만들기 위한 클래스 작성
 */
public class Nation {
	/* 속성(값) */
	String name;        // 이름
	int age;            // 나이
	char gender;        // 성별
	String juminNumber; // 주민등록번호
	String tel;         // 전화번호
	String address;     // 주소
	
	
	
	/* 기능 */
	public void speakKorean() {
		System.out.println("가나다라 한국어 가능");
	}//speakkorean
	
	public void welfare() {
		System.out.println("우리나라에서 제공하는 복지를 누릴 수 있음");
	}//welfare
	
	// 해야만 하는 것도 적어야 한다
	public void 납세의의무() {
		
		// 만 19세 이상 성인만 세금을 내는 경우
		if(age >= 19) {
			System.out.printf("%s님은 세금 납부 대상자 입니다.\n", name);
			System.out.println("세금..내야지..내돈");
		} else {
			System.out.printf("%s님은 %d세 미성년자로 납부 대상자가 아닙니다.\n", name, age);
		}
		
	}//납세의의무
	
	/**
	 * 자기 소개 기능 
	 */
	public void introduce() {
		System.out.printf("이름은 %s이고, %d세 %c성 입니다\n", name, age, gender);
	}//introduce
	
	
	

} // Nation // Nation으로 캡슐화한 것
