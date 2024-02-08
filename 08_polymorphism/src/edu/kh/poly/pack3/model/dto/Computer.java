package edu.kh.poly.pack3.model.dto;

// 클래스, 추상 클래스 상속 키워드 : extends (확장하다)
// 인터페이스 상속 키워드 : implements (구현하다)

public class Computer implements Machine {

	@Override
	public void powerOn() {
		System.out.println("전원 버튼 눌러 킴");
	}

	@Override
	public void powerOff() {
		System.out.println("컴퓨터 시스템 종료함");
	}

}
