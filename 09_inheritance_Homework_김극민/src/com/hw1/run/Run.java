package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.TextBook;

public class Run {
	public static void main(String[] args) {
		
		// 배열로 만들어서 각각 Novel, TextBook, Poeatry 생성하여 대입
		
		Book[] books = new Book[3];
		
		books[0] = new Novel("해리 포터", "J.K 롤링", "판타지");
		
		books[1] = new TextBook("자바의 정석", "James Gosling", "컴퓨터과학");
		
		books[2] = new Poetry("우리들의 사랑시", "김소월", 30);
		
	}
}
