package com.rammohan.spring.injecting.objects.injectingObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person ram = context.getBean("ram", Person.class);
		ram.getPersonDetails();

		Person sravan = context.getBean("sravan", Person.class);
		sravan.getPersonDetails();
		
		Person hemanth = context.getBean("hemanth", Person.class);
		hemanth.getPersonDetails();
	}
}
