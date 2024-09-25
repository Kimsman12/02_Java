package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	
	public void practice3() {
//마트에서 고객에게 할인 혜택을 제공하려고 한다
//물건의 총 가격과 회원 여부를 입력받아, 
//회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 
//최종 가격을 출력해라	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("가격을 입력하세요  : ");
	
	int input1 = sc.nextInt();
	
	System.out.println("멤버십 있으세요?  : ");
	
	boolean input2 = sc.nextBoolean();
	
	double result1 = (input2 == true)? (input1 * 0.9) : (input1 * 0.95);
	
	System.out.println(result1 + "원");
	
	
}

	public void practice4() {
		
//ATM에서 사용자가 원하는 금액을 입력하면, 5만원, 1만원, 5천원, 1천원 
//단위로 최소 개수의 지폐로 돈을 인출하라
//ex) 사용자가 123000원을 입력하면, 5만원 지폐 2장, 1만원 지폐 2장, 
//5천원 지폐 0장, 1천원 지폐 3장이 필요함
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인출 금액  : ");
		
		int input1 = sc.nextInt();
		
		int result1 = input1 % 50000;
		int result2 = result1 % 10000;
		int result3 = result2 % 5000;
		int result4 = result3 % 1000;
		
		int result5 = input1 / 50000;
		int result6 = result1 / 10000;
		int result7 = result2 / 5000;
		int result8 = result3 / 1000;

		System.out.printf("5만원 지폐%d장,1만원 지폐%d장, 5천원 지폐%d장, 1천원 지폐%d장",
				result5, result6, result7, result8);
		
		// 5만원짜리 1장 만원짜리 1장 1천원짜리 1장
		
		
	}

	public void practice5() {
		
//사용자로부터 두 개의 정수를 입력받아, 
//첫 번째 수가 두 번째 수의 배수인지 확인하고 결과를 출력해라
//만약 배수라면 "배수입니다"를 출력하고, 아니라면 "배수가 아닙니다"를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수  : ");
		
		int input1 = sc.nextInt();
		
		System.out.println("두번째 정수  : ");
		
		int input2 = sc.nextInt();
		
		String result = (input1 % input2 == 0) ? "배수입니다." : "배수가 아닙니다.";
		
		System.out.println(result);
		
	}

}
