package com.rammohan.spring.injecting.objects.injectingObjects;

public class Person {
	private int id;
	private String name;
	
	private Family family;
	private Job job;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	void getPersonDetails() {
		System.out.println("Name : "+ name);
		System.out.println("ID : "+ id);
		family.getFamilyDetails();
		job.getJobInfo();
		System.out.println("=================================\n=================================");
	}
}
