package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample { // 기능제공용 클래스
	Scanner sc = new Scanner(System.in);
	public void ex1() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
	}
	
	public void ex2() {
		// 영어 알파벳 A부터 Z까지 한줄로 출력
		// ABCDEFGHIJKLMNOPQRSTUWXYZ
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i); // 강제형변환
		}
		
		System.out.println("\n=============================");
		
		for(char i = 'A'; i <= 'Z'; i++)
			System.out.print(i);
	}
	
	
	public void ex3() {
//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//단, 입력한 수는 1보다 크거나 같아야 합니다.
//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		System.out.print("숫자를 입력하세요 : ");
		
		int input = sc.nextInt();
		
		if(input<1) {
			System.out.println("1보다 큰 수를 입력하세요.");
			return;
		}
		
		for(int i = 0; i<=input; i++) {
			System.out.print(i);
		}
		
		
		
	}

	public void ex4() {
//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<=0) {
			System.out.println("1 이상의 수를 입력하세요.");
			return;
		}
		
		for(int i = input; i>=1; i--) {
			System.out.print(i);
		}
		
	}

	public void ex5() {
// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		
		System.out.print("숫자를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			int iNum = i += num;
			
			
			System.out.print(iNum);
		}
		
	}
	
	public void ex6() {
//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		if(num1 < 1) {
			System.out.println("1이상의 숫자를 입력하세요.");
			return;
		}
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		if(num2 < 1) {
		System.out.println("1이상의 숫자를 입력하세요.");
		return;
		}
		
		for(int i=num1; i<=num2; i++) {
			System.out.print(i);
		}
		
		
		
	}

	public void ex7() {
// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		System.out.println("원하는 단을 입력하세요 : ");
		int num = sc.nextInt();
		
		
		int i = 1;
		while(i <= 9 ) {
			
			System.out.println(num + "x" + i + " = "  +(num * i));
			
			i++;
			
		}
				
		
	}

	public void ex8() {
//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		System.out.print("단 수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1 || num>10) {
			System.out.println("2~9단만 입력해 주세요.");
			return;
		}
		
		
		while (num <= 9){
			
			System.out.println("========"+num+"단==========");
			
			int i = 1;
			while (i<=9) {
				System.out.println(num + "x" + i + " = "  +(num * i));
				i++;
			}
			
			num++;
		}
		
		
		
		
	}

	public void ex9() {
/*다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
*
**
***
**** */	
		System.out.print("숫자를 입력하세요 : ");
		
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			
			for (int col = 1; col <= row; col++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}		


	public void ex10() {
		
		System.out.print("숫자를 입력하세요 : ");
		
		int input = sc.nextInt();
		
		for(int i = input; i>0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void ex11() {
/*ex.
정수 입력 : 4
   *
  **
 ***
****  
*/		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

	public void ex12 () {
/*정수 입력 : 3
*
**
*** (여기까지 위쪽 삼각형)
**
*
	- 위쪽 삼각형 : 행(row)은 input만큼, 열(col)은 row만큼 반복
	- 아래 삼각형 : 행은 input보다 1 작은수에서 1씩 감소
					열은 현재 행만큼 반복
*/	
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int row = num - 1; row>=1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		

		
		
	}

	public void ex13() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			
			for(int col = 1; col <= input + row - 1; col++) {
				
				if(input-row >= col) {
					
					System.out.print(" ");
					
				}else { System.out.print("*");
					
				}
			}
			System.out.println();
		}
		
	}

	public void ex14() {
		System.out.print("정수 입력 : ");
		
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			
			for(int col=1; col <= input; col++) {
				
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	public void ex15() {
		//1부터 사용자에게 입력 받은 수까지 중에서
		//1) 2와 3의 배수를 모두 출력하고
		//2) 2와 3의 공배수의 개수를 출력하세요.
		
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			
			// 2의 배수 또는 3의 배수인 경우 출력
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				
				// 2와 3의 공배수
				if(i % 2 == 0 && i % 3 == 0) {
					count++;
				}
				
			}
			
		}
		
		System.out.println("\ncount : " + count);
		
	}
}





