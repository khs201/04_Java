package edu.kh.poly.pack3.model.dto;

// 인터페이스는 다중 상속이 가능하다!!! (implements 뒤 여러 인터페이스 작성 가능)

// 각자 구현한 계산기
public class KHSCalculator implements Calculator, Machine {

	@Override
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}

	@Override
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	@Override
	public int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	@Override
	public double div(int a, int b) {
		return b == 0 ? 0.0 : (double) a / b;
	}

	@Override
	public int mod(int a, int b) {
		int result = a % b;
		return result;
	}

	@Override
	public int sum(int... numbers) { // *********보류*************
		/*
		 * 가변인자(...) : 전달 인자의 개수(전달 되는 값의 개수)가 변할 수 있는 매개 변수(전달 인자) -> printf()가 가변인자
		 * 사용의 가장 대표적인 예시 System.out.printf("%d / %d / %d / %d", 1 ,2, 3, 4); 원하는만큼 추가 할
		 * 수 있다
		 */
		int sum = 0;
		for(int i : numbers) {
			sum+=i;
		}
		return sum;
	}

	/**
	 * ( PI * R * R)
	 */
	@Override
	public double areaOfCircle(double r) {
		double result = Calculator.PI * r * r;
		return result;
	}

	/**
	 * 전달 받은 숫자가 계산기 최대, 최소 범위 내 숫자가 맞는지 확인
	 * 
	 * @param num
	 * @return 최대, 최소 범위 내 숫자가 맞으면 true, 아니면 false
	 */
	@Override
	public boolean rangeCheck(int num) {
		if (num >= MIN_NUM && num <= MAX_NUM)
			return true;
		else
			return false;
	}

	/**
	 * a를 x번 곱한 결과 반환
	 * 
	 * @param a
	 * @param x
	 * @return a의 x제곱
	 */
	@Override
	public int pow(int a, int x) {
		int result = (int) Math.pow(a, x);
		return result;
	}

	/**
	 * 전달 받은 정수를 2진수 String으로 변환해서 반환
	 * 
	 */
	@Override
	public String toBinary(int num) {
		String result = Integer.toBinaryString(num);
		return result;
	}

	/**
	 * 전달 받은 정수를 16진수 String으로 변환해서 반환
	 */
	@Override
	public String toHexadecimal(int num) {
		String result = Integer.toHexString(num);
		return result;
	}

	@Override
	public void powerOn() {
		System.out.println("걍 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("걍 꺼짐");
	}

}
