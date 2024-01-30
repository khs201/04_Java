package edu.kh.condition.ex;

import java.util.Scanner;

/**
 * 조건문 기능용 클래스
 */
public class ConditionEx {
	
	// 필드 (== 객체의 속성 == 객체가 가지고 있는 값/변수)
	Scanner sc = new Scanner(System.in);
	
	
	/**
	 * 나이를 입력 받아
	 * 19세 이상은 성인, 미만은 성인이 아닙니다
	 */
	public void method1() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if(age >= 19) {
			System.out.println("성인");
		}else {
			System.out.println("성인이 아닙니다");
		}
	}
	
	/**
	 * 나이를 입력 받아
	 * 13세 이하면 "어린이"
	 * 13세 초과 18세 이하 "청소년"
	 * 18세 초과 "성인"
	 */
	public void method2() {
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		String result;
		
		if(age <= 13 ) result = "어린이";
		else if(age <= 18) 	result = "청소년";
		else result = "성인";
		
		System.out.println(result);
	}
	
	/**
	 * 달(월)을 입력 받아 해당 계절 출력하기 
	 * <ul>
	 *  <li>봄 : 3,4,5</li>
	 *  <li>여름 : 6,7,8</li>
	 *  <li>가을 : 9,10,11</li>
	 *  <li>겨울 : 12,1,2</li>
	 *  <li>그 외 : 잘 못 입력</li>
	 *  </ul>
	 */
	public void method3() {
		/* A 방법
		 * System.out.print("달(월) 입력 : "); int month = sc.nextInt();
		 * 
		 * String result; if(month >= 3 && month <= 5) result = "봄"; else if(month >= 6
		 * && month <= 8) result = "여름"; else if(month >= 9 && month <= 11) result =
		 * "가을"; else if(month == 12 || month == 1 || month == 2) result = "겨울"; else
		 * result = "잘못 입력";
		 * 
		 * System.out.println(result);
		 */
		
		
		/* 		B방법
	  System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		if(month < 1 || month > 12)  result = "잘못 입력";
		else if(month >= 3 && month <= 5) 	result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else result = "겨울";
		
		System.out.println(result); */
		
		/* 		C 방법
		 * System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		if(month < 1 || month > 12) {
			System.out.println("잘못 입력");
			return; // 메서드를 종료하고 호출한 곳으로 돌아감
		}
		
		String result;
		if(month >= 3 && month <= 5) 	result = "봄";
		else if(month >= 6 && month <= 8) 	result = "여름";
		else if(month >= 9 && month <= 11) 	result = "가을";
		else result = "겨울";
		
		System.out.println(result); */
		
		/* 		switch문 요약 방법
		 * System.out.print("달(월) 입력 : ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
//			case 3: case 4: case 5: result="봄"; break;
			case 3, 4, 5: result="봄"; break; */
		
		
		System.out.println("월 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
	  case 3, 4, 5:	 
	    System.out.println("봄");
      break;
		case 6:
		case 7:
		case 8:
	    System.out.println("여름");
      break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘 못 입력");
			break;
		}
		
	} // method3 끝
	
	
	
	
	
	/** P/F 판별하기
	 * <pre>
	 * 중간고사, 기말고사, 과제 점수를 입력 받아
	 * 총점 60점 이상일 경우 PASS, 아니면 FAIL
	 * 
	 * - 중간고사(40%), 기말고사(50%), 과제(10%)
	 * - 각각 100점 만점
	 * 
	 *  + PASS인 경우를 변경
	 *  90점 이상 : A
	 *  80점 이상 : B
	 *  70점 이상 : C
	 *  60점 이상 : D
	 * </pre>
	 */
	public void method4() {
		Scanner sc = new Scanner(System.in);
		String result = null; // 변수에는 뭐라도 선언해놓는게 좋다! String에는 null 또는 ""; 
		// 변수에 값이 안 들어가 있다면 에러 발생
		// 해결법1. 뭐라도 초기화 해놓는다
		// 해결법2. 무슨 경우에도 빈값으로 남게되는 경우의 수를 없앤다
		// 숫자는 0 
		// String은 null / ""
		// boolean은 false
		// 이외의 객체는 null
		System.out.print("중간고사 점수를 입력하세요 : ");
		int mid = sc.nextInt();
		System.out.print("기말고사 점수를 입력하세요 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수를 입력하세요 : ");
		int hw = sc.nextInt();
		double sum = (mid * 0.4) + (fin * 0.5) + (hw * 0.1);
		// result = "총점 : " + sum;
		// System.out.println(result);
		if (sum < 1 || sum > 100 ) {
			System.out.println("잘못 입력함");
			return;
		}else if (sum >= 90) {
			result = "총점 : " + sum + " A";
		//	System.out.println(result);
		} else if(sum >= 80) {
			result = "총점 : " + sum + " B";
		//	System.out.println(result);
		} else if(sum >= 70) {
			result = "총점 : " + sum + " C";
		//	System.out.println(result);
		} else if(sum >= 60) {
			result = "총점 : " + sum + " D";
		//	System.out.println(result);
		} else {
			result = "총점 : " + sum + " FAIL";
		//	System.out.println(result);
		}
		System.out.println(result);
		
		
		// switch문 매개변수로는 정수, 문자열, 문자만 가능
		/* 스위치문으로 할 시 참고
		 * switch( (int)(sum / 10) ) {
			case 9 : result = "A"; break;
			case 8 : result = "B"; break;
			case 7 : result = "C"; break;
			case 6 : result = "D"; break;
			}
		 */
	} //method4 끝
	
	
	
	
	
	/**<pre>
	 *  국어, 영어, 수학, 사탐, 과탐 점수를 입력 받아
	 *  40점 미만 과목이 있으면 FAIL
	 *  평균이 60점 미만인 경우도 FAIL
	 *  
	 *  모든 과목 40점 이상, 평균 60점 이상인 경우 PASS
	 *  
	 *  [출력 예시]
	 *  
	 * 1) 40점 미만 과목이 존재하는 경우
	 * FAIL [40점 미만 과목 : 국어 영어]
	 * 
	 * 2) 평균 60점 미만인 경우
	 * FAIL [점수 : 50.4 (평균 미달)]
	 * 
	 * 3) PASS인 경우
	 * PASS [점수 : 83.4 / 100]
	 * </pre>
	 */
	public void method5() { // 국어, 영어, 수학, 사탐, 과탐
		Scanner sc = new Scanner(System.in);
		String result = "";
		String pfResult = "";
		boolean pf = true;
		double average = 0.0;
		double sum = 0;
		
		
		
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		if (kor < 40) {
			result += " 국어";
			pf = false;
		}
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		if (eng < 40) {
			result += " 영어";
			pf = false;
		}
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		if (math < 40) {
			result += " 수학";
			pf = false;
		}
		System.out.print("사탐 점수 입력 : ");
		int satam = sc.nextInt();
		if (satam < 40) {
			result += " 사탐";
			pf = false;
		}
		System.out.print("과탐 점수 입력 : ");
		int gwatam = sc.nextInt();
		if (gwatam < 40) {
			result += " 과탐";
			pf = false;
		}
		
		sum = kor + eng + math + satam + gwatam;
		// System.out.println(sum);
		average = sum / 5.0;

		// System.out.println("평균은 : " + average);
		
		
		if (average >= 60 && pf == true) {
			pfResult = "PASS";
			System.out.printf("PASS [점수 : %.1f / 100]", average);
		} else if (average < 60) {
			pfResult = "FAIL";
			// result = "평균 미달!";
			// FAIL [점수 : 50.4 (평균 미달)]
			System.out.printf("FAIL [점수 : %.1f (평균 미달)]", average);
		} else if(pf == false) {
			pfResult = "FAIL";
			result += " 점수 미달!";
			System.out.println(pfResult + result);
		} 
		
		
		
		
		
		/* 선생님 방법
		 * System.out.print("점수 입력(국어 영어 수학 사회 과학) : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int soc = sc.nextInt();
		int sci = sc.nextInt();
		
		boolean flag = false;
		String result = "";
		
		if(kor < 40) { result += "국어 "; flag = true; }
		if(eng < 40) { result += "영어 "; flag = true; }
		if(mat < 40) { result += "수학 "; flag = true; }
		if(soc < 40) { result += "사회 "; flag = true; }
		if(sci < 40) { result += "과학 "; flag = true; }
		
		if(flag) {
			System.out.printf("FAIL [40점 미만 과목 : %s] \n", result);
			return;
		}
		
		int sum = kor + mat + eng + soc + sci;
		double avg = sum / 5.0;
		
		if(avg < 60.0) {
			System.out.printf("FAIL [점수 : %.1f (평균 미달)] \n", avg);
			return;
		}
		
		System.out.printf("PASS [점수 : %.1f / 100] \n", avg); */
		
		
		
		
		
					
		
		
	} // 메소드 끝
	
	
	
}
