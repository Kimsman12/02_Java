package edu.kh.collection.pack1.model.dto;

public class Student implements Comparable<Student>{
	// 필드
	private String name;
	private int age;
	private String region;
	private char gender;
	private int scroe;
	
	public Student() {} // 기본생성자
	
	// 매개변수 생성자
	public Student(String name, int age, String region, char gender, int scroe) {
		super();
		this.name = name;
		this.age = age;
		this.region = region;
		this.gender = gender;
		this.scroe = scroe;
	}

	// 게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getScroe() {
		return scroe;
	}

	public void setScroe(int scroe) {
		this.scroe = scroe;
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", region=" + region + ", gender=" + gender + ", scroe="
				+ scroe + "]";
	}

	@Override
	public int compareTo(Student other) {
		// compareTo() : 객체를 정렬하기 위해 사용하는 메서드
		// 두 객체를 비교하고 그 결과로 정수를 반환함
		// 현재 객체의 값과 다른 객체의 값을 비교함
		
		// 현재 객체의 나이 - 다른 객체의 나이 -> 비교
		// 값이 양수면 현재 객체가 더 크다
		// 음수면 현재 객체가 더 작다
		
		return this.age - other.age; // 나이를 오름차순으로 정렬
		// 	   other.age - this.age; -> 나이를 기준으로 내림차순 정렬
	}
	
	
}
