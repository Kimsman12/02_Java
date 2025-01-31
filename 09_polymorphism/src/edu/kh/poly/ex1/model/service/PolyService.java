package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.model.dto.Car;
import edu.kh.poly.ex1.model.dto.Spark;
import edu.kh.poly.ex1.model.dto.Tesla;

public class PolyService {

	public void ex1() {
		// 다형성 확인 예제
		
		// car객체 생성
		Car car = new Car();
  //부모타입 참조변수 = 부모객체
		
		//Tesla 객체 생성
		Tesla tesla = new Tesla();
   //자식타입 참조변수 = 자식객체
		
		// **********다형성**********
		
// 부모타입 참조변수 = 자식객체
		Car car2 = new Tesla();
		// Tesla 객체를 참조하는 변수의 타입이 Car(부모) 이기 때문에
		// Tesla 객체가 Car(부모) 객체로 변화함
		// -> 업캐스팅
		
		Car car3 = new Spark();
		// Spark 객체를 참조하는 변수(car3)의 타입이 Car(부모)
		// Spark 객체가 Car 객체로 변화함
		// -> 업캐스팅
		
		
		// **** 다형성(업캐스팅) 작성 방법 ****
		
		// 1) 자식 객체가 부모 객체로 변하였기 때문에
		// 	  자식만의 고유한 필드, 메서드를 사용할 수 없다
		
		// 1-1) car (부모 = 부모)
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		// car 메서드 모두 사용 가능
		
		// 1-2) Tesla (자식 = 자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(100000);
		// Tesla 부모, 본인의 메서드 모두 사용 가능
		
		// 1-3) car2 (부모 = 자식Tesla)
		// Car car2 = new Tesla();
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		//car2.setBatteryCapacity(100000); 
		// 부모타입 참조변수이기 때문에 Tesla의 고유필드와 메서드 사용 불가능
		// The method setBatteryCapacity(int) is undefined for the type Car
		
		car3.setEngine("경차 엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		
		
		// ---------------------------------------------------
		
		// 2) 다형성을 이용한 객체 배열
		
		// 객체 배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		// 다형성을 이용한 객체배열 : 
		// 부모타입의 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		
		Car[] arr = new Car[3];
		// 각 배열 요소 Car 타입 참조변수
		
		arr[0] = car; // Car 주소
		arr[1] = car2; // Tesla 주소
		arr[2] = car3; // Spark 주소
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스의 엔진 : " + arr[i].getEngine());		
		}
		
		// 상속 + 다형성
		// 상속 특징 : Car 상속 클래스는 모두 getEngine()을 가지고 있다.
		// 다형성(업캐스팅) : 부모타입 참조변수 arr[i]로 자식객체를 참조할 수 있다.
		
		
		
		
		
		
	}

	// 전달받은 Car 또는 자식객체(Tesla, Spark)의 엔진, 연료, 바퀴갯수를 출력 매서드
	public void printCar(Car temp) {
		// 부모타입 참조변수 = 자식타입객체
		// Car temp = c
		// Car temp = t
		// Car temp = s
		// 다형성의 업캐스팅 모양과 똑같다
		// -> temp라는 매개변수에는 Tesla, Spark, Car 의 주소가 넘어와도 된다(업캐스팅)
		System.out.println("엔진 : " + temp.getEngine());
		System.out.println("연료 : " + temp.getFuel());
		System.out.println("바퀴 : " + temp.getWheel() + "개");
		System.out.println();
		
		
	}
	
	// 매개변수로 전달받은 정수값에 따라 Car, Tesla, Spark 객체를 만들어
	// 반환하는 메서드
	public Car createCar(int num) {
		
		Car result = null;
		
		switch(num) {
		case 1 : result = new Car(); break;
		case 2 : result = new Tesla(); break;
		case 3 : result = new Spark(); break;
		}
		
		return result;
		
	}
	
	public void ex2() {
		// 다형성(업캐스팅)을 이용한 매개변수 사용법
		
		Tesla t = new Tesla("전기모터", "전기", 4, 1000000);
		
		Spark s = new Spark("경차엔진", "휘발유", 4, 0.5);
		
		Car c = new Car("경유엔진", "경유", 12);
		
		printCar(t);
		printCar(s);
		printCar(c);
		
		System.out.println("---------------------------------------------------------");
		
		// 다형성을 이용한 반환형 사용법
		
		// Car[] arr = { new Car(), new Tesla(), new Spark() };
		
		Car[] arr = { createCar(1), createCar(2), createCar(3) };
					//   Car	  , Car(Tesla)  , Car(Spark)
		
		
		
		// 객체가 어떤 타입(자료형)인지 검사
		// instanceof 연산자 : 객체의 자료형을 검사하는 연산자
		// -> 참조하는 객체가 특정 자료형이거나, 상속관계인지 확인
		
		System.out.println( arr[1] instanceof Tesla );
		System.out.println( arr[1] instanceof Spark );
		System.out.println( arr[1] instanceof Car );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void ex4() {
		
		Car c1 = new Tesla();
		
		//Spark s1 = (Spark)c1; // c1을 관계없는 Spark로 다운캐스팅 하려고함
		// 다운캐스팅 잘못해도 컴파일 에러 발생 안함
		// -> 실행 시 발생(런타임 에러)
		// ClassCastException : 형변환 예외
		
		// 런타임 에러 : 프로그램 실행 시 발생하는 예외(에러)
		// 컴파일 에러 : 실행 전 코드에 빨간줄 에러
		
		// 해결방법 : instanceof와 같이 사용해야 한다
		
		
		// 예외처리 방법
		if(c1 instanceof Spark) { // c1이 Spark이거나 상속관계인가?
			
			Spark s1 = (Spark)c1;
			System.out.println("성공");
			
		}else { // 아니라면
			
			System.out.println("실패. Spark타입 아님");
			
		}
		
	}

	public void ex5() {
		
		// 바인딩 (Binding)
		// 실제 실행할 메소드 코드와 호출하는 코드를 연결 시키는 것
		
		Car c1 = new Car("경유엔진", "경유",8);
		
		System.out.println( c1.toString() );
		// String edu.kh.poly.ex1.model.dto.Car.toString ()
		// Car 객체에 있는 toString() 메소드를 호출 == 바인딩
		// 프로그램 "실행 전"
		// - 컴파일러는 toString() 메서드가 Car에 있는걸로 인식해서
		// c1.toStriong() 호출코드와 
		// String edu.kh.poly.ex1.model.dto.Car.toString () 메소드 코드를 연결
		// -> 정적바인딩
		
		
		// ** 다형성 적용 시 바인딩 **
		
		Car c2 = new Spark("경차엔진", "휘발유", 4, 0.5);
		// 업캐스팅 적용 -> 부모 부분만 참조 가능상태
		
		System.out.println(c2.toString());
		// String edu.kh.poly.ex1.model.dto.Car.toString ()
		// 참조변수 c2가 Car 타입이므로,
		// toString()도 Car의 toString() 호출 - 정적바인딩
		
		// 하지만 실행해보면 자식(Spark)의 toString()이 호출되는것을 확인
		// 경차엔진 / 휘발유 / 4 / 0.5
		// -> 컴파일 시에는 부모(Car)와 바인딩 == 정적바인딩
		// -> "실행 시" 에는 자식(Spark)의 오버라이딩된 메서드와 바인딩
		// == 동적바인딩
		
		
		
		
	}


}

