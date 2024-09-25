package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	
	public void practice1() {
//키보드로 나이를 입력받아 
//20세 이상이면 "저는 성인 입니다", 아니면 "저는 미성년 입니다" 출력.
//입력받은 값이 13세 이상이면서 19세 이하면 "청소년입니까? true"출력, 아니면 false 출력
//입력받은 값이 65세 이상이거나, 12세 이하면 
//"노인이거나 어린이 입니까? true" 출력 아니면 false 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이  : ");
		
		int input1 = sc.nextInt();
		
		String result1 = input1>=20 ? "저는 성인입니다" : "저는 미성년 입니다";
		
		System.out.println(result1);
		
		String result2 = (input1>=13 && input1<=19) ? "청소년입니까? true" : "false";
		String result3 = (input1>=65 || input1<=12) ? "노인이거나 어린이입니까? true" : "false";
		
		System.out.println(result2);
		System.out.println(result3);
			
	}
	
}
