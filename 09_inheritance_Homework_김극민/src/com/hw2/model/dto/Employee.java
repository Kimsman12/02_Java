package com.hw2.model.dto;

public class Employee extends Person{
	
	private String position;

	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}

	@Override
	public String getInfo() {
		return String.format("ID : %s , 이름 : %s , 직책 : %s", id , name , position);
		// id와 name을 person에서 protected로 만들었기 때문에
		// 후손 클래스에서 직접 접근 가능하다
	}
	
	
	
}
