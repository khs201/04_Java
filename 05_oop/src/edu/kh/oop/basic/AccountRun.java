package edu.kh.oop.basic;

public class AccountRun {

	public static void main(String[] args) {

		// Account 객체 생성
		Account a1 = new Account();
		

		// private이 설정된 값과 안된 값 접근 여부 확인
		// The field Account.balance is not visible

		// a1.name = "홍길동";
		// a1.accountNumber = "1";

		// private을 적용한 변수(필드)는 외부에서 보이지 않음(정보 은닉)
		
		// 간접 접근 기능을 이용해서 값을 세팅
		a1.setName("신형만");
		
		// 간접 접근 기능을 이용해서 객체의 속성을 얻어와 출력
		String name1 = a1.getName();
		System.out.println(name1);
		
		a1.setAccountNumber("1234-56-7890");
		a1.setPassword("7890");
		
		Account a2 = new Account(); // Heap 영역에 객체 생성 후 a2라는 참조 변수에 주소를 저장
		
		a2.setName("짱아");
		a2.setAccountNumber("111-222-333");
		a2.setPassword("1234");
		
		a1.deposit(99999999);
		a2.deposit(50000L);		
		a2.deposit(50000L);		
		a2.deposit(50000L);	

		a1.withdraw("7891", 145914);
		a2.withdraw("1234", 1000000000000L);
		

	}// main

}
