package edu.kh.poly.pack2.model.dto;

public class Dog extends Animal {

	// The type Dog must implement the inherited abstract method Animal.sleep()
	// 상속받은 추상 클래스의 기능을 구현하지 않으면 오류 발생!!!

	// 추상 클래스를 상속 받은 경우!!
	// -> 부모 클래스에 작성된 추상 메서드를 모두 반드시 오버라이딩 해야한다!
	// 이를 오버라이딩 강제화라고 한다!

	// 필드

	private boolean harness; // 가슴줄

	// 기본 생성자
	public Dog() {
		super();

	}

	// 매개 변수 생성자
	public Dog(String type, boolean harness) {
		super(type);
		this.harness = harness;
	}

	@Override
	public void eat() {
		System.out.println("개밥 냠");
	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨");
	}

	public boolean isHarness() { // boolean은 getter를 is로 표시한다
		return harness;
	}

	public void setHarness(boolean harness) {
		this.harness = harness;
	}

	@Override
	public String toString() {
		return super.toString() + " / 목줄 유무 : " + harness;
	}

}
