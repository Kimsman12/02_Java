package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
	/*길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)*/
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (i + 1);
			
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
		
		
		
	}

	public void practice2() {
	/*길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)*/
		
		int[] arr = new int[9];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (i + 1);
			
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
		
	}

	public void practice3() {
		/*사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.*/
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < input; i++) {
			
			arr[i] = i + 1;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

	public void practice4() {
/*정수 5개를 입력 받아 배열을 초기화 하고
검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력*/

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
				
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {			
			arr[i] = input;
		}
		
		boolean flag = false;
		
		System.out.print("검색할 정수 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
				if(arr[i]==input) {
				System.out.println(i + "번째 인덱스에 있습니다");
				flag = false;
				break;
			}
			if(!flag) {
				System.out.println("일치하는 값이 존재하지 않습니다.");
			}
			
		}
		

		

			
		
	}

	public void practice5() {
/*문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.*/
		
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				count++;
				System.out.print(i + "번 인덱스");
			}
		}
		
		if(count > 0) {
			System.out.print("에 " + count + "개 있음");
		}else {
			System.out.print("존재하지 않음.");
		}
		
		
		
	}

	public void practice6() {
/*사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.*/
		System.out.print("배열 길이 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int plus = 0;
		
		for(int i = 0; i < input; i++) {
			System.out.print("값 입력 : ");
			int num = sc.nextInt();
			
			arr[i] = num;
			
			plus += num;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("합 : " + plus);
	}

	public void practice7() {
/*주민등록번호 번호를 입력 받아 성별을 
 나타내는 숫자 이후부터 *로 가리고 출력하세요.*/
		
		System.out.print("주민등록번호 : ");
		String input = sc.nextLine();
		char[] arr = new char[input.length()];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			
			if(i>=7) {
				arr[i] = input.charAt(i);
			} else {
				arr[i] = '*';
			}
		}
		System.out.println(arr);
		
	}
	
	public void practice8() {
/*3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
다시 정수를 받도록 하세요.*/
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input<3) {
			System.out.println("다시 입력하세요.");
			return;
		} else if(input%2==0) {
			System.out.println("다시 입력하세요");
			return;
		}
		
		int minus = 0;
		
		int[] arr = new int[input];
		
		for(int i = 0; i < input; i++) {
			
			
			if(i >= ((input/2)+1)) {
				minus++;
			} else {
				minus--;
			}
			
			arr[i] = -minus;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice9() {
/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.*/
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
	
		}
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
	}

	public void practice10() {
/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
1~10 사이의 난수를 발생시켜 배열에 초기화 후
배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.*/		
		int[] arr = new int[10];
		
		int max = 1;    // 최대값을 담아줄 변수
		int min = 10;	// 최소값을 담아줄 변수
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			
			arr[i] = random;
			
			System.out.print(arr[i] + " ");
		}
			System.out.println();
			
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];				
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
}

	public void practice11() {
/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.*/
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			
			for(int x=0; x<i; x++) { // 중복 제거용 for문
				if(random==arr[x]) { // 앞쪽 요소에 대입된 값을 현재 요소에 대입된 값과 비교
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

	public void practice12() {
/*로또 번호 자동 생성기 프로그램을 만들기.
(중복 값 없이 오름차순으로 정렬하여 출력하세요.)*/
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			int random =((int)Math.random() * 45 + 1);
			
			lotto[i] = random;
			
			for(int x=0; x<i; x++) {
				if(random==lotto[x]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

	public void practice13() {
/*문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
문자의 개수와 함께 출력하세요.*/	
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
			
		}
		
		// char 배열에서 중복값 출력x
		
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < arr.length; i++) {
			
			boolean flag = true; // 중복 체크용 flag
			
			for(int j = 0; j < i; j++) {
				
				if(arr[i] == arr[j]) {
					flag = false; // 중복이 발생 했을때
					break;
				}
				
			}
			
			
			
			if(flag) { // 중복이 발생하지 않았을 경우
					   // 중복 아닐때만 count 늘리기
				
				 if( i == 0 ) {
					 System.out.print(arr[i]);
				 
				 }else {
					 System.out.print(", " + arr[i]);
				 }
				count++;
			}
 		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}
		
		

		
		
		
		


	public void practice14() {
/*사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.*/	

		
/*[실행 화면]
배열의 크기를 입력하세요 : 3
1번째 문자열 : 자바의 정석
2번째 문자열 : 알고리즘
3번째 문자열 : C프로그래밍
더 값을 입력하시겠습니까?(Y/N) : y
더 입력하고 싶은 개수 : 2
4번째 문자열 : 인간관계
5번째 문자열 : 자기계발
더 값을 입력하시겠습니까?(Y/N) : y
더 입력하고 싶은 개수 : 1
6번째 문자열 : 영단어600
더 값을 입력하시겠습니까?(Y/N) : n
[자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]*/
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거
		
		String[] arr = new String[size];
		
		// 2. 첫 배열에 저장할 문자열 입력받기
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();		
		}
		
		// 3. 반복이 시작되는 구간부터 무한반복
		// 	  while 작성하여 내부에 종료요건 만들어서 break
		while(true) {
			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			char ch = sc.next().charAt(0);
			
			//4. 값을 더 입력할 경우
			if(ch == 'y' || ch == 'Y') {
				
				// 5. 더 입력받을 개수 입력 받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				// 6. 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];
				
				// 7. 배열 복사(깊은 복사) + 새로운 문자열 입력받기
				for(int i = 0; i < newArr.length; i++) {
					
					if(i < arr.length ) { // 인덱스의 크기가 기존배열보다 작을 경우
						newArr[i] = arr[i]; // 기존 배열 요소값 복사
		
					} else { // 인덱스의 크기가 기존 배열보다 클 경우 새로운 입력 받기
						System.out.print((i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
						
					}
					
				}
				// 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소
				//	  newArr 대입
				arr = newArr;
				
				
			}else if(ch == 'n' || ch == 'N') { // 값을 더 입력하지 않은 경우
					
				break; // while 반복문 종료
				
			} else { // 잘못 입력한 경우
				System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
			}
			
			
		}
		// 배열값 모두 출력
		System.out.println(Arrays.toString(arr));

	}
}

