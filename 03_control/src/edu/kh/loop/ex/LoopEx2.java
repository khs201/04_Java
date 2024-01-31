package edu.kh.loop.ex;

import java.util.Scanner;

/**
 * 중첩 반복문
 */
public class LoopEx2 {

	/**
	 * <pre>
	 * 다음 모양 출력하기
	 * 
	 * 1234
	 * 1234
	 * 1234
	 * 
	 * </pre>
	 * 
	 */
	public void method1() {

		for (int x = 1; x <= 3; x++) { // 3번 반복

			for (int i = 1; i <= 4; i++) { // 1234 출력
				System.out.print(i);
			} // ㅍㄲ
			System.out.println(); // 줄바꿈
		} // ㅍㄲ
	} // 1ㄲ

	/**
	 * <pre>
	 * 다음 모양 출력하기
	 * 
	 * 4321
	 * 4321
	 * 
	 * </pre>
	 * 
	 */
	public void method2() {

		for (int x = 1; x <= 2; x++) { // 2번 반복

			for (int i = 4; i >= 1; i--) { // 4321 출력
				System.out.print(i);
			} // ㅍㄲ
			System.out.println(); // 줄바꿈
		} // ㅍㄲ
	} // 2ㄲ

	/**
	 * <pre>
	 * 다음 모양 출력 하기
	 * (0,0) (0,1) (0,2)
	 * (1,0) (1,1) (1,2)
	 * (2,0) (2,1) (2,2)
	 * </pre>
	 */
	public void method3() {

		for (int x = 0; x < 3; x++) { // 행(세로) 0,1,2
			for (int i = 0; i < 3; i++) { // 열(가로) 0,1,2
				System.out.printf("(%d,%d) ", x, i);
			} // 안쪽 포문끝
			System.out.println();
		} // 바깥 포문 끝

	} // 3ㄲ

	public void method4() {

		for (int x = 2; x >= 0; x--) { // 행(세로) 0,1,2
			for (int i = 2; i >= 0; i--) { // 열(가로) 0,1,2
				System.out.printf("(%d,%d) ", x, i);
			} // 안쪽 포문끝
			System.out.println();
		} // 바깥 포문 끝
	} // 4ㄲ

	/**
	 * 2단 부터 9단까지 모두 출력 2x1= 2 2x2= 4 2x3= 6 ... 2x9=18 3x1= 3 3x2= 6 3x3= 9 ...
	 * 3x9=27 ... 9x1= 9 9x2=18 9x3=27 ... 9x9=81
	 */
	public void method5() {
		int result = 0;

		for (int x = 2; x < 10; x++) {
			for (int i = 1; i < 10; i++) {
				result = i * x;
				System.out.printf("%d X %d = %2d ", x, i, result);
			}
			System.out.println();
		}

	} // 5ㄲ

	/**
	 * 입력 받은 단 부터 9단까지 구구단 출력하기 단, 입력 값이 2~9사이가 아니면 "잘못 입력" 출력
	 * 
	 * ex) 단 입력 (2~9사이) : 7
	 * 
	 * ===== 7단 ===== 7 x 1 = 7 7 x 2 = 14 ... 7 x 9 = 63
	 * 
	 * ===== 8단 ===== ... ==== 9단 ==== ...
	 * 
	 * 
	 * 
	 */
	public void method6() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.println("시작 단 입력 : ");
		int num = sc.nextInt();

		if (num < 2 || num > 9) {
			System.out.println("2~9 사이 입력");
			return;
		}

		for (int x = num; x < 10; x++) {
			System.out.printf("===== %d단 ===== \n", x);
			for (int i = 1; i < 10; i++) {
				result = i * x;
				System.out.printf("%d X %d = %2d \n", x, i, result);
			}
		}

	} // 6ㄲ

	/**
	 * 출력하기 1 2 3 4 5 6 7 8 9
	 */
	public void method7() {
		int count = 1;
		for (int x = 0; x < 3; x++) { // 3번 반복
			for (int i = 0; i < 3; i++) { // 3번 반복
				System.out.print(count++ + " ");
			} // ㅍㄲ
			System.out.println();

		} // ㅍㄲ
	}

	/**
	 * <pre>
	 * 
			####
			####
			####
			####
	 * </pre>
	 */
	public void method8() {
		for (int x = 0; x < 4; x++) { // 4번 반복
			for (int i = 0; i < 4; i++) { // 4번 반복
				System.out.print("#");
			} // ㅍㄲ
			System.out.println();

		} // ㅍㄲ
	} // 8ㄲ

	/**
	 * # ## ### ####
	 */
	public void method9() {
//		String result = "";
//		for (int x = 0; x < 4; x++) { // 4번 반복
//			result += "#";
//			System.out.print(result);
//			System.out.println();
//		} // ㅍㄲ
		for (int row = 0; row < 4; row++) { // 4행 (0123)

			for (int col = 0; col < row + 1; col++) { // 4열 (0123)
				System.out.print("*");
			}

			System.out.println(); // 줄바꿈
		}
	}// 9ㄲ

	/**
	 * **** 
	 * *** 
	 * **
	 * *
	 * 
	 */
	public void method10() {
		for (int row = 3; row >= 0; row--) { // 4행 (0123)

			for (int col = 0; col < row + 1; col++) { // 4열 (0123)
				System.out.print("*");
			}

			System.out.println(); // 줄바꿈
		}

	}// 10ㄲ

} // ㅋㄲ
