package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteService {

	// 스트림(Stream) : 데이터가 이동하는 통로
	//                기본적으로 한 방향으로 흐름

	// Byte 기반 스트림
	// - 1byte 단위로 데이터를 입/출력하는 스트림
	// - 최상위 인터페이스 : InputStream, OutputStream

	// - 문자열, 이미지, 영상, 오디오, pdf 등
	// 모든 것을 입/출력 할 수 있음
	// (단, 통로가 좁다보니 속도가 조금 느림)

	// ===========================================
	// IO 관련 코드는 IOException이 발생될 가능성이 높다!
	// -> 거의 모든 메서드가 throws IOException이 써져있다
	// IOException 예외 처리 구문을 작성하는 것이 필수!
	// ===========================================
	/**
	 * 바이트 기반 파일 출력
	 */
	public void fileByteOutput() {

		// FileOutputStream 참조 변수 선언
		FileOutputStream fos = null; // try, finally 구문에서 사용 예정이라 빼놨다  

		try {

			// new FileOutputStream("경로") : 
			// -> 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			// -> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
			// * (단, 폴더는 생성되지 않음)
			// -> 기존 파일이 존재하면 내용을 덮어쓰기 한다!

			// new FileOutputStream("경로", true)
			// -> 기존 파일이 존재하면 내용을 이어쓰기함

			fos = new FileOutputStream("/io_test/20240215/바이트기반_테스트.txt");

			// String 불변성 문제를 해결한 객체(가변성을 띈다)
			StringBuilder sb = new StringBuilder();
			sb.append("아무말!\n");
			sb.append("막하기!\n");
			sb.append("더하기!");

			// SringBuilder -> String 변환
			String content = sb.toString();

			// 출력 방법 1 : 한 글자씩 파일로 출력
			// -> 2byte 범주의 문자(영어, 숫자, 기본 특수 문자 제외)
			// 		1byte 기반 스트림 통과 시 데이터 손실이 발생해서
			// 		글자가 깨지는 문제가 발생!
			//			for (int i = 0, len = content.length(); i < len; i++) {
			//
			//				char ch = content.charAt(i); // i번째 글자 반환
			//				fos.write(ch); // 출력 스트림이 연결된 파일에 ch 쓰기 
			//
			//			}

			// System.nanoTime() : 1970.01.01 09:00:00 부터 현재 시간까지의
			// 차이를 ns(nano second 단위)로 반환
			// 1ms(밀리) == 1/1000초
			// 1us(마이크로) == 1/1000ms
			// 1ns(나노) == 1/1000us

			long startTime = System.nanoTime();

			// 출력 방법 2 : String을 byte[] 변환 후 출력
			fos.write(content.getBytes());

			long endTime = System.nanoTime();

			System.out.println("[수행 시간] " + (endTime - startTime) + " ns");

			fos.flush(); // 스트림 안에 남아있는 데이터를 모두 밀어냄

			System.out.println("출력 완료");

		} catch (IOException e) {
			e.printStackTrace(); // 예외가 발생한 메서드까지 추적해 출력
		} finally { // try 예외 발생 여부 관계없이, 무조건 수행하는 구문

			// 사용 완료한 스트림을 제거(닫기, 메모리 반환)하는 코드 작성
			try {
				if (fos != null) { // 스트림이 정상 생성된 경우
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	/**
	 * 버퍼를 이용한 파일 출력
	 * - BufferedOutputStream 보조 스트림 이용
	 * 
	 */
	public void bufferedFileByteOutput() {

		// 버퍼(Buffer)란?
		// - 데이터를 모아두는 박스, 장바구니 같은 메모리 공간
		// * 버퍼링
		// - 인터넷 속도 낮음 + 스트리밍 코드가 효율이 안좋음
		// 	-> 동영상 재생 중에 미리 앞에 재생될 부분을 다운 받아놔서
		// 		 영상을 끊김없이 볼 수 있게 함
		// 		 -> 다운 받아서 저장 해놓은 공간 == 버퍼

		// BufferedOutputStream / BufferedInputStream
		// - FileOutputStream은 1바이트씩 데이터를 입출력
		// 
		// - BufferedOutputStream은 버퍼에 입출력할 내용을 모아서 한 번에 입출력! 
		// -> 스트림을 이용하는 횟수가 적어짐
		// --> 성능, 시간, 효율 UP

		FileOutputStream fos = null; // try, finally에서 사용 예정
		BufferedOutputStream bos = null; // 보조스트림 선언

		try {

			fos = new FileOutputStream("/io_test/20240215/바이트기반_테스트_Buffered.txt");

			// 기반 스트림 fos를 이용해
			// 보조 스트림 bos를 생성
			bos = new BufferedOutputStream(fos);

			StringBuilder sb = new StringBuilder();
			sb.append("가나다라마바사\n");
			sb.append("와 자바 너무 재밌다\n");
			sb.append("선생님 저 공부 열심히 할께요!!!");

			String content = sb.toString();

			long startTime = System.nanoTime();
			bos.write(content.getBytes());
			long endTime = System.nanoTime();

			System.out.println("[수행 시간] " + (endTime - startTime) + " ns");

			bos.flush(); // 스트림에 남아있는 데이터 밀어내기(쏟아내기) 왜? 다 쓰면 버려야 해서

			System.out.println("출력 완료");

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (bos != null)
					// 보조 스트림 close() 시
					// 보조 스트림 생성에 사용된 기반 스트림도 같이 close()됨
					bos.close(); // 사용 완료된 스트림 메모리 반환(닫기, 제거)

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}//buffer 메소드

	/**
	 * 바이트 기반 파일 입력
	 */
	public void fileByteInput() {

		// 파일 입력용 바이트 기반 스트림
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("C:\\io_test\\20240215\\노래가사.txt");

			// 방법 1. 파일 내부 내용을 1byte씩 끊어서 가져오기
			// -> 2byte 범주의 글자들이 깨지는 문제가 발생

			// 자바에서 byte는 정수형
			// -> 다루기 힘들기 때문에 정수 기본형인 int로 변환해서 사용

			StringBuilder sb = new StringBuilder();
			int value = 0; // 읽어온 바이트값을 저장할 변수 선언

			while (true) { // 무한 반복

				value = fis.read(); // 1byte씩 읽어오기
				// 단, 더 이상 읽어올 값이 없으면 -1 반환

				if (value == -1) // 더 읽어올 값이 없으면 break
					break;

				// 읽어온 값을 StringBuilder 객체에 추가
				sb.append((char) value); // char로 강제 형변환해서 글자 형태로 추가 

			}

			System.out.println(sb.toString());
			// InputStream은 flush() 없음

		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			try {

				if (fis != null)
					fis.close(); // 사용 완료된 String 메모리 반환(제거, 닫기)
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	} // filebyteinput

	/**
	 * 바이트 기반 파일 입력 2
	 */
	public void fileByteInput2() {

		// 파일 입력용 바이트 기반 스트림
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("C:\\io_test\\20240215\\노래가사.txt");

			// 방법 2. 파일에 저장된 모든 byte 값을 다 읽어와 
			// byte[] 형태로 반환 받기
			// -> 이 후 byte[] 배열을 이용해서 String 객체 생성
			// -> String 생성 시 배열 요소 2개씩 묶어 한 글자로 해석해
			// 		깨지는 글자 없이 문자열로 변환

			byte[] bytes = fis.readAllBytes();

			String content = new String(bytes);
			System.out.println(content);

		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			try {

				if (fis != null)
					fis.close(); // 사용 완료된 String 메모리 반환(제거, 닫기)
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	/**
	 * BufferedInputStream 보조 스트림을 이용한 성능 향상
	 */
	public void bufferedFileByteInput() {

		// 스트림 참조 변수 선언
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {

			fis = new FileInputStream("C:\\io_test\\20240215\\노래가사.txt");

			// 보조 스트림 생성(기반 스트림이 있어야 한다)
			bis = new BufferedInputStream(fis);// 매개 변수로 기반 스트림이 항상 들어가야 한다

			// 파일 내용을 byte[] 배열로 반환 받아 String으로 변경
			String content = new String(bis.readAllBytes());

			System.out.println(content);

		} catch (Exception e) { // Exception은 IOException의 부모(다형성)

			e.printStackTrace();

		} finally {
			try {
				if (bis != null) // 보조 스트림만 close()해도 기반 스트림도 같이 close()됨
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/** 파일 복사
	 * 파일 경로를 입력 받아
	 * 지정된 파일과 같은 경로에 복사된
	 * 파일 출력하기
	 * 
	 * [실행화면]
	 * 파일 경로 입력 : /io_test/20240215/노래가사.txt
	 * 복사 완료 : /io_test/20240215/노래가사_copy.txt
	 *  
	 * 1) 입력된 경로에 파일이 있는지 검사 : File.exists()
	 * 
	 * 2) 있으면 파일 내용을 모두 읽어오기 : fileInputStream
	 * 		-> 성능 향상을 위해 bufferedInputStream까지 사용
	 * 
	 * 3) 읽어온 내용을 같은 위치에 "파일명_copy" 이름으로 출력
	 * 		-> FileOutputStream + BufferedOutputStream
	 * 
	 * + Scanner 대신 BufferedReader를 이용
	 *  
	 */
	public void fileCopy() {

		// 스트림 참조 변수 선언

		BufferedReader br = null; // 문자열 입력용 스트림

		FileInputStream fis = null; // 파일 입력
		BufferedInputStream bis = null; // 입력 보조

		FileOutputStream fos = null; // 파일 출력
		BufferedOutputStream bos = null; // 출력 보조

		try {

			// 키보드 입력을 받기 위한 스트림 객체 생성
			br = new BufferedReader(new InputStreamReader(System.in));

			// 경로 입력 받기
			System.out.print("파일 경로 입력 : ");
			String target = br.readLine(); // 입력된 한 줄 읽어오기

			// 해당 경로에 파일이 존재하는지 확인
			File dir = new File(target);
			if (!dir.exists()) {
				System.out.println("[해당 경로에 파일 존재하지 않습니다]");
				return;
			}

			// 이하 경로에 파일이 존재할 경우

			// target이 가르키는 파일을 입력 받을 수 있도록
			// 입력용 스트림 생성 기반 및 보조 스트림 생성
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);

			// 입력용 스트림을 이용해서 target 입력 받기
			byte[] bytes = bis.readAllBytes();

			// -----------------------------------

			// 출력할 파일의 경로 + _copy가 붙은 파일 이름
			// target : C:\\io_test\\20240215\\노래가사.txt
			// copy : C:\\io_test\\20240215\\노래가사_copy.txt
			StringBuilder sb = new StringBuilder();
			sb.append(target); // C:\\io_test\\20240215\\노래가사.txt
			// int String.lastIndexOf("문자열") 
			// - String 뒤에서부터 검색해서
			// "문자열"과 일치하는 부분의 인덱스를 반환
			// 없으면 -1 반환
			int insertPoint = target.lastIndexOf(".");
			sb.insert(insertPoint, "_copy");

			String copy = sb.toString(); // 복사할 파일의 경로

			// 출력용 스트림 생성
			fos = new FileOutputStream(copy);
			bos = new BufferedOutputStream(fos);

			bos.write(bytes); // 읽어왔던 내용 bytes를 bos를 이용해서 출력
			bos.flush(); // 스트림에 남아있는 데이터 밀어내기

			System.out.println("복사 완료" + copy);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (br != null)
					br.close();
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}// 클래스
