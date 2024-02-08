package edu.kh.poly.pack3.run;

import edu.kh.poly.pack3.model.dto.Calculator;
import edu.kh.poly.pack3.model.dto.KHSCalculator;
import edu.kh.poly.pack3.model.dto.Machine;

public class CalculatorRun {
	public static void main(String[] args) {
		
		// 인터페이스 장점 : 상속받은 클래스들의 형태가 똑같거나 비슷하기 때문에
		// 코드 유지 보수 시 참조하는 객체만 변경하면 유지 보수가 완료된다.
		

		Calculator cal = new KHSCalculator();

		System.out.println("더하기" + cal.plus(1, 2));
		System.out.println("빼기" + cal.minus(1, 2));
		System.out.println("곱하기" + cal.multi(1, 2));
		System.out.println("나누기" + cal.div(1, 2));
		System.out.println("나누고 나머지" + cal.mod(1, 2));
		System.out.println("원의 둘레 구하기" + cal.areaOfCircle(5));
		System.out.println("정상 범위 숫자인지 확인" + cal.rangeCheck(100000001));
		System.out.println("제곱 구하기" + cal.pow(10, 5));
		System.out.println("정수 이진수로 바꾸기" + cal.toBinary(10));
		System.out.println("정수 십육진수로 바꾸기" + cal.toHexadecimal(10));
		System.out.println("sum" + cal.sum(1, 1, 1, 1));
		((Machine)cal).powerOn(); // 참조 변수의 자료형을 강제 형변환 해야지만 실행 가능
		((Machine)cal).powerOff();
	}

}
