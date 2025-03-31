package com.rammohan.spring.annotations.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Person ram = context.getBean("getPerson", Person.class);
		ram.getPersonDetails();
		((AnnotationConfigApplicationContext)context).close();
	}
}
