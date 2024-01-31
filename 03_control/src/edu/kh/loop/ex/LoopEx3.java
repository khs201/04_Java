package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx3 {

	// 필드
	Scanner sc = new Scanner(System.in);

	/**
	 * 문자열 한 글자씩 출력하기
	 */
	public void method1() {
		// String str = "Hellow World";

		// 문자열.charAt(인덱스) : 인덱스번째 문자 하나를 얻어와 반환

		// 문자열.length() : 문자열의 길이

		String str = "Hello World!!!";

		int length = str.length(); // 미리 문자열의 길이를 카운트 하고 저장
																// str.length() for문 속에서 반복할 필요가 없어짐
																// 이로 인해 코드 효율 증가
																// 초기식, 증감식은 여러개 선언 가능

		for (int i = 0 /* , length = str.length() 이것도 가능 */ ; i < length; i++) {
			System.out.println(str.charAt(i));
		} // for

	}// method1

	// while(조건식) : 끝이 확실하지 않은 반복문
	/**
	 * -1이 입력될 때 까지 정수를 계속 입력 받아 입력 받은 수의 합계를 구하기
	 */
	public void method2() {

		int sum = 0; // 합계 누적용 변수
		int input = 0; // 입력 값을 저장할 변수

		while (input != -1) { // 입력 값이 -1이 아니면 반복, -1이면 멈춤

			System.out.println("정수 입력 : ");
			input = sc.nextInt();

			if (input != -1)
				sum += input;

		} // while
		System.out.println("합계 : " + sum);

	}// method2

	/**
	 * 0이 입력될 때 까지 정수를 계속 입력 받고 0 입력 시 누적된 합계 출력 do ~ while 문 - 조건식이 뒤에 작성된 while문 -
	 * 최소 1회 이상의 반복을 보장
	 */
	public void method3() {

		int input = 0;
		int sum = 0;

		do { // 입력한 값이 0이 아닐 때 반복
			System.out.println("정수 입력 : ");
			input = sc.nextInt();
			sum += input;

		} while (input != 0);

		System.out.println("합계 : " + sum);
	}// method3

	public void method4() {
		int sum = 0;
		int input = 0;
		
		while(true) { // 무한 반복
			System.out.println("정수 입력 : ");
			input = sc.nextInt();
			
			if(input == 0) break; // 반복 종료하는 분기문(break)
			
			
			sum += input;
			
		}//while
		
		
		System.out.println("합계 : " + sum); // unreachable code : 도달할 수 없는 코드, dead code
	}// method4

}
