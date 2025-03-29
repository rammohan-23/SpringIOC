package com.rammohan.spring.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person rmr = context.getBean("rmr", Person.class);
		rmr.getDetails();
		
		Person sd = context.getBean("sravan", Person.class);
		sd.getDetails();

	}

}
