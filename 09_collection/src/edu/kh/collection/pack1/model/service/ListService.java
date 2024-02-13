package edu.kh.collection.pack1.model.service;

import java.util.List;
import java.util.Scanner;
import edu.kh.collection.pack1.model.dto.Book;
import java.util.ArrayList;

// 컬렉션 프레임워크(틀을 맞춰놓다) : Java에서 자료 구조를 만들어서 모아둔 것
// (java.util에 있음)

// 특징
// 1) 크기 제한 없음 (부족하면 자동으로 증가)
// 2) 추가, 수정, 삭제, 검색 등 다양한 기능이 구현되어 있음
// 3) 객체만 저장 가능 ( 기본 자료형은 안되지만 Wrapper 클래스를 이용하면 된다!)

public class ListService {

	// List : 자료를 순차적으로 나열한 자료 구조(배열 비슷)
	// - 인덱스가 존재함
	// -> 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능

	/**
	 * List 사용해보기
	 */
	public void method1() {

		// List 객체 생성
		// - List (인터페이스) -> 객체 생성 불가 -> 다형성 이용
		// - ArrayList (클래스) (List의 후손)
		List list = new ArrayList(3); // 10칸 짜리 생성(기본값)

		// 반환형 메서드명(매개변수) 구조
		// -> 1. boolean add(E e) : 마지막 요소로 추가
		// E(Element) : 요소를 뜻하는 상징적인 글자 (자료형 X)
		// == Object, String, Student 등 자료형 가리지 않고 들어갈 수 있다

		list.add("아무거나");
		list.add(new Object());
		list.add(123123); // -> int가 Integer(Wrapper Class)로 변환
											// -> 컴파일러가 자동으로 변환한거임
		list.add(3.123123); // 여기서부터 크기가 3을 넘지만 오류 발생X
		list.add(false); // 크기가 자동으로 늘어났기 때문에

		System.out.println(list);

		// 2. E get(int index) : List에서 index 번째 요소 반환 받기
		// 3. int size() : List에 저장된 요소(객체)의 개수를 반환

		System.out.println("저장된 개수 : " + list.size());

		// 0번부터 List에 저장된 개수 미만까지 1씩 증가하며 반복
		// (0 ~ 마지막 인덱스)
		for (int i = 0; i < list.size(); i++) { // list를 순차 접근해서 안에 내용을 출력하는 코드
			System.out.printf("%d 번째 인덱스 : ", i);
			System.out.println(list.get(i));

			// list의 i번째 요소가 String인 경우
			if (list.get(i) instanceof String) {
				System.out.println("String 자료형이다\n");
				continue;
			}

			// List의 i번째 요소가 int인 경우(Integer로 써야함)
			// Incompatible conditional operand types Object and int 오류 발생
			if (list.get(i) instanceof Integer) {
				System.out.println("Integer 자료형이다\n");
			}

			if (list.get(i) instanceof Double) {
				// list.get(i) ==> Object 반환
				Double d = (Double) list.get(i); // Double 다운 캐스팅
				System.out.println("Double의 바이트 수 : " + d.BYTES + "\n");
			}
		} // 포문

		// Object 타입은 아무거나 다 참조할 수 있다!!!
//		Object[] test = new Object[5]; // 다형성 (업캐스팅)
//		test[0] = "아무거나";
//		test[1] = false;
//		test[2] = 123;
//		test[3] = "아무거나";

	} // method1

	/**
	 * 컬렉션 List + 제네릭(타입 제한)
	 */
	public void method2() {

		// 컬렉션의 장점 중 "여러 타입 저장 가능"이
		// 코드 길이를 늘리는 주범!!!
		// -> 타입을 하나로 제한(제네릭) -> 코드 길이 감소

		// String 타입으로 제한된 ArrayList 객체 생성
		List<String> strList = new ArrayList<String>(3);

		// 제네릭의 타입 제한 확인
		strList.add("고기");
		strList.add("야채");
		strList.add("쌈장");
		strList.add("젓갈");
		strList.add("김치");
		// strList.add(123); // String이 아니라서 에러

		for (int i = 0; i < strList.size(); i++) { // 컬렉션은 length가 아니라 size!!!!!

			String foodName = strList.get(i);
			System.out.println(foodName);

		} // 포문

		// 3. void add(int index, E e) : index 번째에 중간 삽입
		strList.add(1, "찜닭");

		// 4. String toString() : List에 저장된 모든 요소 문자열로 반환
		// System.out.println(strList.toString()); 아래와 같다
		System.out.println(strList);

		// 5. E Set(int index, E e) : index 번째 요소를 e로 수정
		// -> 수정 전 요소가 반환됨
		String before = strList.set(2, "야췌");
		System.out.println("수정 전 : " + before);
		System.out.println("수정 후 : " + strList.get(2));

		// 6. int indexOf(E e) :
		// -> List 내부에 e와 같은 요소가
		// -> 있으면 해당 요소의 인덱스 반환 / 없으면 -1 반환
		System.out.println(strList.indexOf("젓갈"));
		System.out.println(strList.indexOf("피자"));

		// 7. boolean contains(E e)
		// List 내부에 e와 같은 요소가
		// 있으면 true 반환 / 없으면 false 반환
		System.out.println(strList.contains("젓갈"));
		System.out.println(strList.contains("피자"));

		// 8. E remove(int index)
		// index 번째 요소를 제거(추출!)
		// -> 제거된 요소가 반환됨!
		System.out.println("없애기 전 : " + strList);
		String target = strList.remove(0); // 0번 인덱스 요소 제거
		System.out.println(strList);
		System.out.println(target);

	} // 메서드2

	/**
	 * Book으로 제한된 List 객체를 생성한 후 - 추가, 조회, 수정, 제거 구현
	 */
	public void bookManage() {
		
		/* ArrayList : 배열 형태의 리스트
		 * 장점 : 검색이 빠르다
		 * 단점 : 중간 삽입, 제거가 느림
		 * 
		 * LinkedList : 연결된 형태의 리스트(기차) 
		 * 장점 : 중간 삽입, 제거가 빠름
		 * 단점 : 검색이 느림
		 *  */ 

		
		
		List<Book> bookList = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);

		int input = 0; // 메뉴 번호 입력

		do {

			System.out.println("----도서 관리 프로그램----");
			System.out.println("1. 추가");
			System.out.println("2. 전체 조회");
			System.out.println("3. 인덱스로 조회");
			System.out.println("4. 수정");
			System.out.println("5. 제거");
			System.out.println("0. 종료");

			System.out.print("메뉴 번호 입력 : ");

			input = sc.nextInt();
			sc.nextLine(); // 스캐너 버퍼에 남아있는 개행 문자 제거

			switch (input) {
			case 1:

				System.out.println("제목 입력 : ");
				String title = sc.nextLine();

				System.out.println("글쓴이 입력 : ");
				String writer = sc.nextLine();

				System.out.println("가격 입력 : ");
				int price = sc.nextInt();

				if (bookList.add(new Book(title, writer, price))) {
					System.out.println("추가 성공");
				}

				break;
			case 2:
				System.out.println("\n--전체 조회--\n");

				// 향상된 for문
				for (Book b : bookList)
					System.out.println(b);

				break;
			case 3:
				System.out.println("\n인덱스로 조회\n");

				int index = sc.nextInt();
				if (index >= 0 && index < bookList.size())
					System.out.println(bookList.get(index));
				else
					System.out.println("범위 내의 인덱스로 입력해라");

				break;
			case 4: // index를 정상적으로 입력했다고 가정
				System.out.println("책 수정할꺼임");
				System.out.println("인덱스 입력해라 :");
				index = sc.nextInt();
				sc.nextLine(); // 버퍼 개행문자 제거

				System.out.println("수정할 책 제목 입력해라 : ");
				title = sc.nextLine();

				System.out.println("수정할 책 글쓴이 : ");
				writer = sc.nextLine();

				System.out.println("바꿀 가격 : ");
				price = sc.nextInt();

				Book after = new Book(title, writer, price); // 새 책
				Book before = bookList.set(index, after); // 책 바꾸고 이전 책 추출
				System.out.println("전 : " + before);
				System.out.println("후 : " + after);

				break;
			case 5:
				System.out.println("책 제거");
				System.out.println("제거할 인덱스 번호 :");
				index = sc.nextInt();

				Book target = bookList.remove(index);
				System.out.println("제거된 책 : " + target);
				break;
			case 0:
				System.out.println("\n[시스템 종료]\n");
				break;
			default:
				System.out.println("\n[잘못 입력]\n");
			}

		} while (input != 0);

	}

}// 클래스
