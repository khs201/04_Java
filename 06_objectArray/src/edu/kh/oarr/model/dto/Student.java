package edu.kh.oarr.model.dto;

// DTO : Data Tranfer Object (값 전달용 객체)

/**
 * 
 */
public class Student {

	// 필드
	
	private String studentNumber; // 학번
	private String name; // 이름
	private char gender; // 성별
	private int html;
	private int css;
	private int js;
	private int java;

	// 매개 변수 생성자
	public Student(String studentNumber, String name, char gender) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}
	
	// getter
	
	public String getStudentNumber() {
					return studentNumber;
		}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public int getHtml() {
		return html;
	}
	public int getCss() {
		return css;
	}
	public int getJs() {
		return js;
	}
	public int getJava() {
		return java;
	}
	
	
	
	// setter
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public void setCss(int css) {
		this.css = css;
	}
	public void setJs(int js) {
		this.js = js;
	}
	public void setJava(int java) {
		this.java = java;
	}
	
	// getter / setter 자동 완성
	// alt + [shift] + s -> r (Generated Getters and Setters...)
	// Select All 클릭 -> G
	
	// 객체.toString() : 객체의 필드를 하나의 문자열로 만들어서 반환
	public String toString() {
		
		// 학번 / 성별 / 이름
		// HTML : 100 / CSS : 50 / JS : 70 / JAVA : 100
		return String.format("%s / %c / %s%n"
				+ "HTML : %d / CSS : %d / JS : %d / JAVA : %d", studentNumber, gender, 
				name, html, css, js, java);
	}
	

}// 클래스
