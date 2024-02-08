package edu.kh.poly.pack3.model.dto;

// Washer : 세탁기

public class Washer implements Machine{

	@Override
	public void powerOn() {
		System.out.println("버튼 눌러 킴");
	}

	@Override
	public void powerOff() {
		System.out.println("버튼 눌러 끔");
	}

}
