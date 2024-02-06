package edu.kh.oop.method;

import java.util.Scanner;

public class test1 {
	static void method() {
		System.out.println("No parameters");
	}

	static void method(int a) {
		System.out.println("One parameter: " + a);
	}

	static void method(int a, int b) {
		System.out.println("Two parameters: " + a + ", " + b);
	}

	public static void main(String[] args) {
		method();
		method(3);
		method(3, 4);

	}

}
