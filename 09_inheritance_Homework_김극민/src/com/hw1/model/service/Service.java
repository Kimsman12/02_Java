package com.hw1.model.service;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.TextBook;

public class Service {
	
	public void book1() {
		
		Book novel = new Novel();
		
		novel.setTitle("해리 포터");
		novel.setAuthor("J.K 롤링");

		
		Book tb = new TextBook();
		tb.setTitle("자바 프로그래밍");
		tb.setAuthor("James Gosling");
		
		Book poem = new Poetry();
		poem.setTitle("우리들의 사랑 시");
		poem.setAuthor("김소월");
		
		
	}
	
	
	
}
