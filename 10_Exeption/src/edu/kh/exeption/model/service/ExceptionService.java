package edu.kh.exeption.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {
	
	// 예외(Exception) : 소스코드의 수정으로 해결 가능한 오류
	
	// 예외는 두종류로 구분됨
	// 1) Unchecked Exception : 선택적으로 예외처리 (ex. Runtime Exception...)
	// 2) Checked Exception : 필수적으로 예외 처리 (ex. IOException, 나머지...)
	
	private Scanner sc  = new Scanner(System.in);
	
	public void ex1() {
		
		System.out.println("두 정수를 입력 받아 나누기 한 몫을 출력");
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		

		
		try {
			// 예외가 발생할것 같은 코드
			System.out.println("결과 : " + input1 / input2);
			// Exception in thread "main" java.lang.ArithmeticException: / by zero
		} catch(ArithmeticException e) {
			// try에서 던져진 예외를 catch문의 매개변수 e로 잡음
			System.out.println("infinity");
			
		}
		
		// 발생하는 예외중 일부 예외 try-catch 사용 안해도
		// if-else 로 예외 상황 방지 가능
		// 일부예외 == 대부분 Unchecked Exception
		
		
	}

	public void ex2() {
		// 여러가지 예외에 대한 처리 방법
		
		try {
			System.out.print("정수 1 입력 : "); // InputMismatchException
			int input1 = sc.nextInt();			// Int형이 아닌 다른형을 넣었을 때
			
			System.out.print("정수 2 입력 : "); // InputMismatchException
			int input2 = sc.nextInt();
			
			System.out.println("결과 : " + input1 / input2); 
			
			String str = null;
			
			System.out.println(str.charAt(0)); // NullPointerException
			
			
		} catch(InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요.");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch(Exception e) {
			// Exception 클래스 : 모든 예외의 최상이 부모
			// 다형성 - 업캐스팅 : 부모타입 참조변수로 자식객체 참조
			
			// ** 상위타입의 예외 클래스를 catch문에 작성하면
			// 	  다형성 업캐스팅에 의해 모두 잡아서 처리 가능하다
			
			
			
			System.out.println("뭔지 모르겠으나 예외가 발생해서 처리함..");
			
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력
			// 예외 발샐 지점 추적 메서드
			
			
		}

	}
	
	public void ex3() {
		
		// try - catch - finally
		// finally : try 구문에서 예외가 발생 하든말든 무조건 마지막에 수행
		
		try {
			System.out.print("정수 1 입력 : "); // InputMismatchException
			int input1 = sc.nextInt();			// Int형이 아닌 다른형을 넣었을 때
			
			System.out.print("정수 2 입력 : "); // InputMismatchException
			int input2 = sc.nextInt();
			
			System.out.println("결과 : " + input1 / input2); 
			
		} catch(ArithmeticException e) {
			System.out.println("예외 처리 됨");
			
			// catch문 매개변수 활용
			// 매개변수 e : 예외관련 정보 + 예외관련 기능
			
			System.out.println(e.getClass()); // 어떤 예외클래스인가?
			// class java.lang.ArithmeticException

			System.out.println(e.getMessage()); // 예외발생시 출력된 내용
			// / by zero
			
			System.out.println(e); // e.toString()
			// java.lang.ArithmeticException
			
			e.printStackTrace();
			
			
		} catch(InputMismatchException e){
			System.out.println("숫자만 넣어라");			
		}finally {
			System.out.println("무조건 수행됨");
			sc.close(); // 스캐너 통로 닫기 : 메모리 누수 방지
		}
		
		
		
		
		
		
		
	}
	
	public void ex4() {
		
		// throw / throws
		try {
			methodA();
		} catch (Exception e) {
			// Exception : 모든 예외의 최상위 부모 
			// == 예외 종류 상관없이 모두 처리가능
			System.out.println("methodC 에서부터 발생한 예외를 ex4에서 잡아 처리함");
		}
		
		
		
		
		
		
		
	}
	
	public void methodA() throws IOException {
		methodB();
	}
	
	public void methodB() throws IOException {
		methodC();
	}
	
	public void methodC() throws IOException {
		// throws : 호출한 메서드에게 예외를 던짐
		// -> 호출한 메서드에게 예외를 처리하라고 위임하는 행위
		
		// 예외 강제발생 구문
		throw new IOException();
	}
	
	public void ex5() throws UserException {
		// 사용자 정의 예외
		throw new UserException("사용자 정의 예외 발생");
		
		
		
	}
}
