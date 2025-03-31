package com.rammohan.spring.annotations;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	void test() {
		System.out.println("test method");
	}
}
