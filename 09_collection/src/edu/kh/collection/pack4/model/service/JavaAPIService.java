package edu.kh.collection.pack4.model.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {

	// Wrapper Class
	// - wrap : 감싸다, 포장하다
	// - 기본 자료형을 객체로 포장하는 클래스
	// -> 기본 자료형의 객체화
	// --> 왜? 컬렉션처럼 객체만 취급하는 상황에서 기본 자료형도
	// ---> 취급 가능한 형태로 바꾸기 위해서

	// Unboxing <-> Boxing

	// boolean <-> Boolean
	// byte <-> Byte
	// short <-> Short
	// int <-> Integer
	// long <-> Long
	// float <-> Float
	// double <-> Double
	// char <-> Character

	// * Boxing, Unboxing을 자동으로 수행되도록 구현되어 있음
	// -> AutoBoxing, AutoUnboxing

	// + Wrapper Class를 이용해 객체화 되었을 때
	// 추가적인 필드, 기능을 제공함

	/**
	 * Auto Boxing, Auto Unboxing 확인
	 */
	public void method1() {
		int num1 = 100; // int
		// Integer wrap1 = new Integer(num1); // 삭제 예정인 방법 쓰지마!

		Integer wrap1 = num1; // 컴파일러가 Auto Boxing 수행 코드 추가
													// (int) num1 -> (Integer) num1

		int num2 = wrap1.intValue(); // 정수 값 반환(추천X)

		int num3 = wrap1; // 컴파일러가 Auto Unboxing 수행 코드 추가
											// (Integer) wrap1 -> (int) wrap1에 저장된 값

		long num4 = 10000000L;
		Long wrap2 = num4; // Auto Boxing
		long num5 = wrap2; // Auto Unboxing

		List<Integer> list = new ArrayList<Integer>();

		list.add(1000); // (int) 1000 -> (Integer) 1000 / Auto Boxing
		list.add(2000);
		list.add(3000);

		// print 구문 내에서
		// Wrapper 클래스로 만든 객체를 참조할 때
		// .toString() 호출하는 것이 아닌
		// Auto Unboxing을 먼저 진행해서 기본 자료형으로 바뀐 것!
		System.out.println(list.get(0) + list.get(1) + list.get(2)); // 6000
	}

	/**
	 * Wrapper Class가 제공하는 필드, 메소드
	 * 
	 * -> 대부분이 static!!!!
	 * 
	 * --> 클래스명.필드명 / 클래스명.메서드명() 사용
	 */
	public void method2() {

		// 정수형, 실수형 공통
		System.out.println("byte의 용량 : " + Byte.BYTES + "바이트");
		System.out.println("byte의 용량 : " + Byte.SIZE + "비트");
		System.out.println("byte의 최댓값 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최솟값 : " + Byte.MIN_VALUE);

		System.out.println(Double.NaN);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);

		// Boolean은 true, false밖에 없음
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);

		// ---------------------------------------

		// String -> 기본 자료형 반환
		System.out.println("-------------------------------");
		System.out.println("[String -> 기본 자료형 변환]");

		// HTML 연결 시(요청 데이터 처리) 많이 사용
		// -> HTML에 관련된 모든 값은 String
		// 단, char(Character)는 별도로 존재하지 않음

		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3"); // 중요
		long l = Long.parseLong("4"); // 중요
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("0.2"); // 중요
		boolean bool = Boolean.parseBoolean("true");

		System.out.println("변환 확인");

		System.out.println("--------------------");
		System.out.println("[기본 자료형 -> String 변환]");

		// Wrapper Class를 이용하는 방법
		// -> 코드는 길지만 효율이 좋음
		int test1 = 400;
		String change1 = Integer.valueOf(test1).toString();

		double test2 = 4.321;
		String change2 = Double.valueOf(test2).toString();

		// String 이어쓰기를 이용한 방법
		// -> 코드는 짧으나 효율이 좋지 않음(속도 DOWN, 메모리 소모 UP)
		long test3 = 12345678910L;
		String change3 = test3 + ""; // 이어쓰기 되면서 하나의 스트링이 된다 long + String -> String + String

	}

	/**
	 * String의 불변성(immutable, 변하지 않는 성질 == 상수) - 문자열이 수정되면 새로운 String 객체가 생성되는 특징이
	 * 있다
	 */
	public void method3() {

		// System.identityHashCode(str)
		// -> 주소값을 이용해서 만든 해시코드(식별 번호)
		// -> 같은 객체에 저장된 값이 변했다면 주소는 일정해야 된다!
		// -> identityHashCode도 일정 해야된다!!

		String str = "hello";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));

		str = "world";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));

		str += "!!!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));

		// -> System.identityHashCode가 다 다른값이다
		// --> str이 참조하는 객체의 주소가 계속 바뀌고 있다
		// ---> 리터럴은 문자열풀에 계속 저장되어 새로이 생성되기 때문

	}

	/**
	 * String 리터럴("")로 생성된 객체 활용
	 * 
	 * - 동일한 리터럴을 이용해 String 객체를 생성한 경우 추가적으로 객체를
	 * 
	 * 생성하지 않고 기존에 존재하는 String 객체의 주소를 반환(재활용)
	 */
	public void method4() {

		String temp1 = "Hello!!"; // 0x400 생성
		String temp2 = "Hello!!"; // 0x400 주소만 반환 받음 (기존 객체 재활용(얕은 복사))

		System.out.println(System.identityHashCode(temp1));
		System.out.println(System.identityHashCode(temp2));

		// 객체의 필드 값을 비교
		System.out.println("저장된 값 비교 : " + temp1.equals(temp2));

		// 변수에 저장된 값(주소) 비교
		System.out.println("주소 비교 : " + (temp1 == temp2)); // ***** 왜 되는지 확인

	} // 메소드4

	/**
	 * 사용자(개발자)가 관리하는 String 객체 생성
	 * - "" 리터럴로 생성된 String -> JVM 관리(String Pool)
	 * - new 연산자로 생성된 String -> 사용자 관리(Heap)
	 */
	public void method5() {

		String temp1 = "abcd";
		String temp2 = new String("abcd");
		String temp3 = new String("abcd");

		// 셋 다 주소가 다름 == "abcd"를 재활용하지 않았다!
		// -> 값은 같지만 전부 다른 객체
		System.out.println(System.identityHashCode(temp1));
		System.out.println(System.identityHashCode(temp2));
		System.out.println(System.identityHashCode(temp3));

		System.out.println("저장된 값 비교 : " + temp1.equals(temp2));
		System.out.println("주소 비교 : " + (temp1 == temp2));

	}

	/**
	 * StringBuilder / StringBuffer 클래스
	 * 
	 * - String의 불변성 문제를 해결한 클래스 -> 가변성(mutable)	 * 
	 * - 기본 16글자 저장할 크기로 생성 저장되는 문자열의 길이에 따라 크기가 증가/감소
	 * -> 마음대로 문자열 수정, 삭제 가능!
	 * 
	 *  - StringBuilder : Thread Safe 미제공 (비동기, 추천)
	 *  - StringBuffer : Thread Safe 제공 (동기)
	 */
	public void method6() {

		// StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();

		// StringBuilder 객체에 문자열을 쌓아 나가는 방식으로 사용
		// -> 뒤에 추가, 앞에 추가
		// append는 뒤에 추가
		sb.append("오늘 점심은 "); // "오늘 점심은 "
		System.out.println(System.identityHashCode(sb));
		sb.append("무엇을 먹을까요?"); // "오늘 점심은 무엇을 먹을까요?"
		System.out.println(System.identityHashCode(sb));

		sb.insert(0, "2월 14일 "); // 0번 인덱스에 삽입 == 제일 앞에 추가
		System.out.println(System.identityHashCode(sb));

		// identityHashCode 값이 일정함
		// == 참조하는 객체가 변하지 않음
		// == 객체 내에 값만 수정되고 있다 == 가변성

		System.out.println(sb);

		// StringBuilder -> String으로 변환
		String temp = sb.toString(); // 객체에 저장된 필드를 문자열로 반환

		// String[] 문자열.split("구분자")
		// - 문자열을 "구분자"를 기준으로 쪼개어 String[]로 반환
		String[] arr = temp.split(" ");

		for (String str : arr) {
			System.out.println(str);
		}

	}

} // 클래스
