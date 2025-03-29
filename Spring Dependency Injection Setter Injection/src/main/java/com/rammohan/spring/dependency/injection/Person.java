package com.rammohan.spring.dependency.injection;

public class Person {
	private int id;
	private String myName;

	public void setId(int id) {
		this.id = id;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	void getDetails() {
		System.out.println("Name : " + myName);
		System.out.println("ID : " + id);
	}
}
