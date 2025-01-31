package edu.kh.poly.ex1.model.service;

public class KKMCalculator implements Calculator{
	// extends : 확장하다, implement : 구현하다
	// (부) 클래스 - (자) 클래스 : extends 사용
	// (부) 인터페이스 - (자) 인터페이스 : extends 사용
	// (부) 인터페이스 - (자) 클래스 : implements 사용
	// (부) 클래스 - (자) 인터페이스 : 상속 불가
	
	// 추상클래스 : 공통적인 동작과 상태(일반메서드, 필드)를 공유하면서
	//              일부 동작만 다르게 구현하고자 할 때 사용
	
	// 인터페이스 : 같은 메서드를 강제구현 하면서 다른 동작만을 구현하고자 할때 사용
	
	
	

	@Override
	public int plus(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int minus(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	
	
	
}
