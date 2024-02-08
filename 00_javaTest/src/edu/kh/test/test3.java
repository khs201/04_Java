package edu.kh.test;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] memberArr = { "홍길동", "김성훈", "윤웅식", "윤성우", "남궁인" };

		System.out.println("검색할 회원 이름을 입력하세요 : ");

		String searchName = sc.next(); // nextInt로 되어 있었음

		boolean result = false;

		for (int i = 0; i < memberArr.length; i++) { // i = 1로 되어있음 // <=로 되어있음
			if (memberArr[i].equals(searchName)) { // 기본 자료형이 아닌 비교인데 equals가 아닌 == 연산자 사용
				result = true;
				break;
			}
		}
		if (!result) {
			System.out.println("회원이 존재하지 않습니다."); // false일때 여야함
		} else {
			System.out.println("회원이 존재합니다");

		}

	}
}
