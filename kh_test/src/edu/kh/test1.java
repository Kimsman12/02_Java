package edu.kh;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2~9사이 정수 입력 : ");
			
			int input = sc.nextInt();
			
			if(input <= 9 && input > 1) {
				for(int num = 1; num <= 9; num++) {
					System.out.printf("%d * %d = %d \n", input, num, (input * num));		
				}
				break;
			}else {
				System.out.println("2이상 9이하 정수만 입력해 주세요");			
			}

		} 
	}
}

/* [원인]
 * 1) 12번 줄의 int형 변수 input을 스캐너로 받을때 nextInt 명령어를 쓰지 않음
 * 2) 15번 줄의 for문 안의 내용중 printf 구문 안에 받아야할 숫자형 변수 %d가 3개 있지만 입력은 2개밖에 안됨
 * 3) 14번 줄의 if문 조건식에 2 이하의 조건은 세우지 않아 -2~ -9의 연산도 수행함
 * 4) 9번줄의 while 문의 탈출조건이 세워지지 않아 구구단을 연산해도 종료되지 않음.
 * 
 * [해결방법]
 * 1) next()구문을 nextInt()로 변경함
 * 2) 16번 줄 printf 구문을 ("%d * %d = %d \n", input, num, (input * num)) 로 변경하여 오류도 지우고 연산식도 세움
 * 3) 14번 줄의 if문 조건식을 (input <= 9 && int > 1) 로 수정하여 오류 제거
 * 4) 9번 줄의 while문 안에 if 구문이 끝난 다음 break; 로 탈출조건을 세워 탈출함
 * 
 * */



