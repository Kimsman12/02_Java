package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1(){
	//모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를
	//키보드로 입력 받고 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 
	//사탕의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수  : ");
		
		int input1 = sc.nextInt();
		
		System.out.println("사탕 개수  : ");
		
		int input2 = sc.nextInt();
		
		int result1 = input2 % input1; 
		int result2 = input2 / input1;
		
		System.out.println("남은 사탕 개수 : " + result1);
		System.out.println("나눠가진 사탕 : " + result2 );
		
		
	}

	public void practice2() {
	// 키보드로 입력 받은 값들을 변수에 기록하고 
	// 저장된 변수 값을 화면에 출력하여 확인하세요.	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("변수 값 : ");
	
	int input1 = sc.nextInt();
	
	System.out.println(input1);
		
		
	}

	
	public void practice3(){
	// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
	// 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어  : ");
		
		int input1 = sc.nextInt();
		
		System.out.println("영어  : ");
		
		int input2 = sc.nextInt();
		
		System.out.println("수학  : ");
		
		int input3 = sc.nextInt();
		
		int result1 = input1 + input2 + input3; 
		double result2 = (input1 + input2 + input3) / 3.0;
		
		System.out.println("합계 점수 : " + result1);
		System.out.println("평균 점수 : " + result2 );


	}

}
