package edu.kh.collection.pack1.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

	private String title; // 제목
	private String writer; // 저자
	private int price; // 가격

	/**
	 * 기본 생성자
	 */
	public Book() {
	}

	/**
	 * 매개 변수 생성자
	 * 
	 * @param title
	 * @param writer
	 * @param price
	 */
	public Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + ", price=" + price + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

// 메서드


} // 클래스
