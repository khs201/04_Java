package edu.kh.loop.ex;

import java.util.Scanner;

public class LoopEx {

	/**
	 * 1부터 10까지 출력하기
	 */
	public void method1() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	} // 메소드1 끝

	// 필드 (객체의 속성 == 객체의 변수)
	// java.util.Scanner
	Scanner sc = new Scanner(System.in);

	/**
	 * 첫번째 입력 받은 수부터 두번째 입력 받은 수까지 1씩 증가하며 출력하기
	 */
	public void method2() {

		System.out.println("수 입력 (1, 2) : ");
		int input1 = sc.nextInt(); // 첫 번째 입력
		int input2 = sc.nextInt(); // 두 번째 입력

		for (int i = input1; i <= input2; i++) {
			System.out.println(i);
		} // for문 끝

	} // method2 끝

	/**
	 * 10부터 1까지 1씩 감소하며 출력
	 */
	public void method3() {

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

	} // 메소드3 끝

	/**
	 * 두 수를 입력 받아서 반복 출력하는 구문을 작성
	 * 
	 * (첫 번째 입력 A, 두 번째 입력 B)
	 * 
	 * 조건 1 : B가 A보다 큰 경우 -> A ~ B 까지 1씩 증가하며 출력
	 * 
	 * 조건 2 : A가 B보다 큰 경우 -> A ~ B 까지 1씩 감소하며 출력
	 * 
	 * 조건 3 : A와 B가 같다면 -> "같은 수 입력됨"
	 */
	public void method4() {
		System.out.println("입력 (1 2) : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a == b) { // 조건 3
			System.out.println("같은 수 입력됨");
			return; // 현재 메서드 종료 후 호출한 곳으로 돌아감
		}

		if (a < b) { // 조건 1
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		} else { // 조건 2
			for (int i = a; i >= b; i--) {
				System.out.println(i);
			}
		}

	} // 메소드4 끝

	/**
	 * 두 수를 입력 받아 반복 출력하기
	 * (첫 번째 입력 A, 두 번째 입력 B)
	 * - 입력 받은 두 수 중
	 * 	 작은 값이 초기식, 큰 값이 조건식에 사용되게 작성
	 */
	public void method5() {
    System.out.println("입력 (1 2) : "); 
    int a = sc.nextInt(); 
    int b = sc.nextInt(); 

    if (a < b) { 
        for(int i = a ; i <= b ; i++) { 
            System.out.println(i); 
        }
    } else if (a > b) { 
        for(int i = b ; i <= a ; i++) { 
            System.out.println(i); 
        }
    } else { 
        System.out.println("서로 다른 수를 입력해주세요"); 
    }
//		****** [min, max를 사용한 방법]
//    System.out.println("입력 (1 2) : "); 
//    int a = sc.nextInt(); 
//    int b = sc.nextInt(); 
//
//    int min = Math.min(a, b);
//    int max = Math.max(a, b);
//
//    if (a == b) { 
//        System.out.println("서로 다른 수를 입력해주세요"); 
//    } else {
//        for(int i = min ; i <= max ; i++) { 
//            System.out.println(i); 
//        }
//    }
} // 메소드5 끝
	public void method5b() { // Java API 이용한 방법
		System.out.println("입력 (1 2) : "); 
    int a = sc.nextInt(); 
    int b = sc.nextInt(); 
    
    int min = Math.min(a, b); // 두 수 중 작은 값을 반환
    int max = Math.max(a, b); // 두 수 중 큰 값을 반환
    for(int i = min ; i <= max ; i++) {
    	System.out.println(i);
    }
    
	} // 5b 끝
	
	
	/**
	 * 변수 값 교환(swap)
	 */
	public void method5c() { 
		System.out.println("입력 (1 2) : "); 
    int a = sc.nextInt(); 
    int b = sc.nextInt(); 
    
    if (a > b) {
    	int temp = a;
    	a = b;
    	b = temp;
    }
    
    
    for(int i=a ; i<=b ; i++) System.out.println(i);
    
	} // 5c끝
	
	
	
	/**
	 * 1부터 100 사이 7의 배수의 개수 세기
	 */
	public void method6() {
		
		int count = 0;
		for(int i = 1 ; i < 100 ; i++) {
			if(i % 7 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
	
/**
 * if문 없이
 */
public void method6a() {
		
		int count = 0;
		for(int i = 7 ; i <= 100 ; i+=7) count++;
		System.out.println(count);
	} // 6aㄲ

/**
 * 1부터 100 사이 정수 중
 * 3의 배수의 개수
 * 3의 배수를 제외한 수 들의 합 출력
 */
public void method7() {
	int result = 0;
	int count = 0;
  for(int i = 1 ; i <= 100 ; i++) {
    if(i % 3 == 0) {
        count++;
    } else {
        result += i;
    }
}
  System.out.println("3의 배수의 개수 " + count);
  System.out.println("3의 배수를 제외한 나머지 값들의 합 " + result);
} // 7ㄲ

/**
 * 구구단 5단 출력하기
 * 5 x 1 =  5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * ...
 * 5 x 9 = 45
 */
public void method8() {
	int result = 0;
	for(int i = 1 ; i < 10 ; i++ ) {
		result = i * 5;
		System.out.printf("5 X %d = %2d \n", i, result );
	}
	for(int i = 9 ; i > 0 ; i--) {
		result = i * 5;
		System.out.printf("5 X %d = %2d \n", i, result );
	}
	
} // 8ㄲ

} // 클래스ㄲ


