package edu.kh.oop.method;

import java.util.Scanner;

public class StudentService {

	// 필드

	private Scanner sc = new Scanner(System.in);

	public void displayMenu() {

		int input = 0;

		Student std1 = null;
		Student std2 = null;

		do {		
			System.out.println("""
				===== 학생 관리 프로그램 =====
				1. 학생 등록
				2. 학생 정보 확인
				3. 학생 이름 수정
				4. Java 공부하기
				5. HTML 공부하기
				6. Java 역량 비교하기
				7. HTML 역량 비교하기
				0. 프로그램 종료
									""");
			System.out.print("메뉴를 입력해주세요 >>");
			input = sc.nextInt();
			
			switch (input) {
			case 1:	System.out.print("학생을 등록할 변수 선택(1:std1 / 2:std2) : ");
			int select = sc.nextInt();
			if (select == 1)				std1 = createStudent();
			else				            std2 = createStudent(); break;
			case 2:	
				System.out.print("정보를 조회할 학생 선택 (1:std1 / 2:std2) : ");
				int select = sc.nextInt();
				if (select == 1)				std1 = createStudent();
				else				            std2 = createStudent(); break;
				break;
			case 3:	break;
			case 4:	break;
			case 5:	break;
			case 6:	break;
			case 7:	break;
			case 0:	break;

			default:
			}

		} while (input != 0);

	}//display menu
	
	public Student createStudent() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학번 : ");
		String number = sc.next();
		
		System.out.print("성별(남/여) : ");
		char gender = sc.next().charAt(0);
		
		return new Student(name, number, gender);
	}
	

}
