package com.rammohan.spring.annotations.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:person-info.properties")
public class Person {
	@Value("${person.Id}")
	private int id;
	@Value("${person.name}")
	private String name;
	@Autowired
	private Family family;
	@Autowired
	private Job job;

	void getPersonDetails() {
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		family.getFamilyDetails();
		job.getJobInfo();
		System.out.println("=================================\n=================================");
	}
}
