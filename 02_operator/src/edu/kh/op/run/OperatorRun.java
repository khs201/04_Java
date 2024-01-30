package edu.kh.op.run;

import edu.kh.op.ex.OperatorEx;// OperatorEx 클래스 가져오기

/**
 * 실행용 클래스
 */
public class OperatorRun {

	// 메인 메서드
	public static void main(String[] args) {
		
		OperatorEx ex = new OperatorEx(); // 가져온 클래스를 이용해 객체 생성

//		ex.test();
//		ex.method1(); // 3의 배수 확인
//		ex.method2(); // input1이 input2의 배수인지 확인
		  //ex.method3(); // input이 짝수인지 홀수인지 확인
		  ex.method4(); // input이 짝수인지 홀수인지 확인
	}
	
}