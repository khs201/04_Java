package edu.kh.array.practice;

import java.util.Scanner;

/**
 * 
 */
public class ArrayPractice {

	// 필드
	Scanner sc = new Scanner(System.in);

	/**
	 * 실습문제 1번
	 * 
	 */
	public void practice1() {
		// 길이가 9인 배열을 선언 및 할당하고,
		int[] arr = new int[9];
		int sum = 0;

		// 1부터 9까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

			if (i % 2 == 0) {
				sum += i;
			} else {
				sum += 0;
			}

		} // for
		System.out.println();
		System.out.print("합계 : " + sum);

	}// practice1

	/**
	 * 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 홀수
	 * 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	 */
	public void practice2() {

		// 길이가 9인 배열을 선언 및 할당하고
		int[] arr = new int[9];
		int sum = 0;

		// 9부터 1까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		for (int i = 8; i >= 0; i--) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			
			//홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
			if (i % 2 != 0) {
				sum += i + 1;
			} else {
				sum += 0;
			}
		}

		System.out.println();
		System.out.print("홀 수 번째 합계 : " + sum);

	} // practice2
	
	/**
	 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
     1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	 */
	public void practice3() {
		System.out.println("정수 입력 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		// System.out.println("확인");
		for(int i = 0 ; i>arr.length ; i++ ) {
			arr[i] = i;
			System.out.println(arr[1]);
		}
		
		
	}

}
