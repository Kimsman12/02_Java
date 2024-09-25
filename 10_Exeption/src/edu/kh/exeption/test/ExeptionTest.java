package edu.kh.exeption.test;

public class ExeptionTest {

	public static void main(String[] args) {
		
		// 컴파일 에러 => 개발자가 코드 잘못쓴 경우
		
		//int a = 99.9; // Type mismatch: cannot convert from double to int
		int a = (int)99.9; // 코드 수정 가능
		
		
		
		// 런타임 에러 => 프로그램 수행 중 발생하는 에러
		// 				  주로 if문으로 처리 가능하다.
		
		int[] arr = new int[3]; // 길이 3 : 인덱스 0,1,2 까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40;
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		// 배열 범위 초과 예외
		

		

	}

}
