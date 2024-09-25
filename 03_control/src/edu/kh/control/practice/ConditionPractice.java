package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
/*  키보드로 입력 받은 정수가 양수이면서 짝수일 때만 
    “짝수입니다.”를 출력하고
	짝수가 아니면 “홀수입니다.“를 출력하세요.
	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.*/
	
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result;
		
		if(num <= 0) {
			result = "양수만 입력해 주세요." ;
		} else if(num%2 ==0) {
			result = "짝수 입니다";
		} else {
			result = "홀수 입니다";
		}
		System.out.println(result);
	}
	
	public void practice2(){
/*국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)*/		
		System.out.print("국어 점수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int num3 = sc.nextInt();
		
		double num4 = (num1+num2+num3)/3;
		
		String result;
		
		if(num4>=60 && (num1>=40 || num2>=40 || num3>=40)) {
			result = "합격 입니다.";
		} else {
			result = "불합격 입니다.";
		}
		
		System.out.println(result);
	}
	
	public void practice3(){
		
//1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
//잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
		System.out.print("달을 입력하세요 : ");
		int month = sc.nextInt();
		
		int day;
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		
		case 4 : case 6 : case 9 : case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
			
		case 2 :
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
			
			
		default : System.out.println(month + " 월은 잘못 입력된 달 입니다."); 
		}		
	}
	
	public void practice4(){
		//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		//저체중/정상체중/과체중/비만을 출력하세요.
		
		System.out.print("키 입력 : ");
		double cm = sc.nextDouble();
		
		System.out.print("몸무게 입력 : ");
		double kg = sc.nextDouble();
		
		String bmi;
		
		if((kg / (cm*cm)) < 18.5) {
			bmi = "저체중";
		} else if ((kg / (cm*cm)) > 18.5 && (kg / (cm*cm)) <= 25) {
			bmi = "정상";
		} else if ((kg / (cm*cm)) > 25 && (kg / (cm*cm)) <= 30) {
			bmi = "과체중";
		} else {
			bmi = "비만";
		}
		
		System.out.println(bmi);
		
	}
	
	public void practice5(){
//중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
//평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
		System.out.print("중간고사 점수 : ");
		int middle = sc.nextInt();
		
		System.out.print("기말고사 점수 : ");
		int last = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int snack = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int check = sc.nextInt();
		
		if(check>20) {
			System.out.println("출석 횟수는 최대 20회 입니다.");
			return;
		}
		
		double midTest = (middle*0.2);
		double lastTest = (last*0.3);
		double snackTest = (snack*0.3);
		double checkTest = (check*0.2);
		double fullTest = midTest + lastTest + snackTest + checkTest;
		
		String result;
		
		if(fullTest >= 70) {
			System.out.println("중간고사 점수 (20): "+midTest);
			System.out.println("기말고사 점수 (30): "+lastTest);
			System.out.println("과제 점수 (30): "+snackTest);
			System.out.println("출결 점수 (20): "+checkTest);
			System.out.println("총점 : "+fullTest);
			System.out.println("Pass");
			
					if(check < 16) {
						System.out.println("Fail 출석 횟수 부족 : "+check);
					}
		} else {
			System.out.println("중간고사 점수 (20): "+midTest);
			System.out.println("기말고사 점수 (30): "+lastTest);
			System.out.println("과제 점수 (30): "+snackTest);
			System.out.println("출결 점수 (20): "+checkTest);
			System.out.println("총점 : "+fullTest);
			System.out.println("Fail");
		}
		
		
	}
	
	
	
}
