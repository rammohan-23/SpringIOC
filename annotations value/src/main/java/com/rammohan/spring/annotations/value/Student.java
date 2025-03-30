package com.rammohan.spring.annotations.value;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String name;
	
	@Value("${student.course}")
	private String course;
	
	@Value("${student.shift}")
	private String shift;
	
	void displayInfo() {
		System.out.println(name + "\n" + course +"\n"+ shift);
	}
}
