package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	public void practice() {
		
		// 1) 기본 생성자를 이용하여 첫 번째 Book 객체 생성
		// 2) 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		// 3) 객체가 가진 필드 값을 toString()을 이용하여 출력

		// 4) 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		// 5) 수정된 객체의 필드 값을 toString() 메소드를 이용하여 출력

		// 6) 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 7) 할인된 가격 = 가격 - (가격 * 할인율)
		
		Book book1 = new Book();

		
		Book book2 = new Book("자바의 정석", 30000, 0.2, "남궁민");
		
		
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("남궁성");
		
		System.out.println("=====================");
		
		System.out.println("수정된 결과 확인");
		System.out.println(book1.toString());
		
		System.out.println("=====================");
		
		System.out.println("도서명 = " + book1.getTitle());
		System.out.println("할인된 가격 = " + (int)(30000 - (book1.getPrice() * book1.getDiscountRate())));
		System.out.println("도서명 = " + book2.getTitle());
		System.out.println("할인된 가격 = " + (int)(30000 - (book2.getPrice() * book2.getDiscountRate())));
	}
	
}

/*
현실 객체 : 사람
객체 지향 언어 : 사람이 쓰기 편한 언어
자바 객체 : 메서드 
class : 메서드 묶음
new 연산자 : 클래스 안에서 사용할 메서드를 복사하여 참조하는것
추상화 : 공통점만 묶어서 보기 편하게 만드는 것
캡슐화 : 외부에서 접근 불가능하게 감싸는것
캡슐화 원칙 : private
메서드/기능의 '정의'란 : 목적에 쓰여지기 위해 기능을 제작하는 것
메서드의 '호출' 이란 : 사용하기 위해 불러내는것
return : 종료하고 호출한 위치로 돌아가는것

public String ex1() {
    return "Hi";
}

위 메서드 상세히 해석 : 
	ex1() 을 부른 곳으로 String 형인 "Hi" 값을 가지고 감 	
*/





