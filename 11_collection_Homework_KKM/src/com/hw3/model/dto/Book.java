package com.hw3.model.dto;

public class Book {
	private String title;
	private String writer;
	private int price;
	private String publisher;
	private int bookNum;
	
	public Book() {}

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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public Book(String title, String writer, int price, String publisher, int bookNum) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.publisher = publisher;
		this.bookNum = bookNum;
	}
	
	@Override
	public String toString() {
		return bookNum + "번 도서 : [ 도서제목 : " + title + " / 도서 저자 : " + writer + "/ 가격 : " + price + "원 / 출판사 : " + publisher;
	}
}
