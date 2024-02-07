package edu.kh.poly.pack2.model.service;

import edu.kh.poly.pack2.model.dto.Animal;
import edu.kh.poly.pack2.model.dto.Dog;
import edu.kh.poly.pack2.model.dto.Snake;

public class AbstractService {

	/**
	 * 추상 클래스는 진짜 객체를 못만들까???? ㅇㅇ 못만듬
	 */
	public void method1() {
		// Animal a = new Animal();
		// Cannot instantiate the type Animal : Animal 타입을 객체화 할 수 없다!
		// 추상 클래스 Animal을 이용해서 객체 생성 불가!!!

	}

	/**
	 * 추상 클래스를 상속 받은 클래스를 이용해 객체 생성 + 다형성(업캐스팅, 동적 바인딩) + 객체 배열
	 */
	public void method2() {

		// 추상 클래스는 객체 생성은 안되지만!!!
		// 부모 타입의 참조 변수 역할은 할 수 있다!!!
		// 추상 클래스를 이용한 단독 객체 생성은 불가능!!!
		// 하지만 추상 클래스를 상속받은 자식 객체 생성은 가능!
		// -> 이 때, 자식 객체 내부에 존재하는
		// 부모 객체 부분도 같이 생성된다!!!
		// --> 부모의 미완성(추상) 메서드는 어떻게 되는가?
		// 자식이 오버라이딩한 메서드로 자동 동적 바인딩된다!
		// (강제로 오버라이딩 시켰기 때문에 오버라이딩되지 않은 부분은 없다! 따라서 컴파일 오류X)

		Animal a1 = new Dog("포유류", false);
		Animal a2 = new Snake("파충류", false);
		Animal a3 = new Dog("포유류", true);
		Animal a4 = new Snake("파충류", true);

		// 부모 타입(Animal) 객체 배열 생성
		// 배열 생성은 가능한 이유 : 자식 객체들이 부모 타입의 속성을 가지고 올 수 있기 때문
		// Animal[] arr = new Animal[4];

		Animal[] arr = { a1, a2, a3, a4 }; // 배열 생성과 동시에 초기화 (얕은 복사)

		// 향상된 for문 + 동적 바인딩 + print 관련 구문의 특징
		for (Animal a : arr) {
			System.out.println("=========");
			
			// 아래 구문들 모두 동적 바인딩 수행
			
			// Object.toString() 목적 : 객체를 문자열로 표현 
			// 												 == 객체의 필드를 모두 모아 하나의 문자열화
			
			// print() 관련된 구문에 참조 변수를 작성하면
			// 자동으로 toString() 메서드를 호출하도록 되어있다.
			// toString 오버라이드만 잘 해놓으면 참조변수만 써도 
			// 알아서 toString이 뜨기 때문에 편의성 증가
			System.out.println(a);
			
			a.eat();
			a.sleep();
		}

	}

} // 클래스
