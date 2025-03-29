package com.rammohan.spring.dependency.injection;

public class Person {
	private int id;
	private String myName;

	public Person(int id, String myName) {
		this.id = id;
		this.myName = myName;
	}

	void getDetails() {
		System.out.println("Name : " + myName);
		System.out.println("ID : " + id);
	}
}
