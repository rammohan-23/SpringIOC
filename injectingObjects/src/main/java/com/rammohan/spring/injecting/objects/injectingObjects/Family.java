package com.rammohan.spring.injecting.objects.injectingObjects;

public class Family {
	private String fatherName;
	private String motherName;

	void getFamilyDetails() {
		System.out.println("===============FAMILY DETAILS===============\nFather Name : " + fatherName
				+ "\nMother Name : " + motherName + "\n============================================");
	}

	public Family(String fatherName, String motherName) {
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
}
