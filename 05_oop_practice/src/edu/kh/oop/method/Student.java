package edu.kh.oop.method;

public class Student {

	// 필드

	public static final String SCHOOLNAME = "KH대학교";
	public static final int MAX_VALUE = 100;
	public static final int MIN_VALUE = 0;

	private String name;
	private String number;
	private char gender;
	private int java;
	private int html;

	// 생성자

	public Student() {
	}; // 기본 생성자

	public Student(String name, String number, char gender) {
		this.name = name;
		this.number = number;
		this.gender = gender;
	}// 매개변수 생성자

	// 메서드

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public void setHtml(int html) {
		this.html = html;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getJava() {
		return java;
	}
	
	public int getHtml() {
		return html;
	}
	
	
	
	
	
	

}//Student 클래스
