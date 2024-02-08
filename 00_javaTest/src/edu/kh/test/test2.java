package edu.kh.test;

import java.util.HashSet;
import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		
	
	HashSet<String> fruitSet = new HashSet<>();
	Scanner sc = new Scanner(System.in);

	while(fruitSet.size()<5)
	{ // 5개의 과일 이름을 입력받음
		String name = sc.next();

		fruitSet.add(name);

	}
	System.out.println(fruitSet);
	}
}
