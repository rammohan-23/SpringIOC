package com.rammohan.spring.annotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:family-info.properties")
public class Family {
	@Value("${family.fatherName}")
	private String fatherName;
	@Value("${family.motherName}")
	private String motherName;

	void getFamilyDetails() {
		System.out.println("===============FAMILY DETAILS===============\nFather Name : " + fatherName
				+ "\nMother Name : " + motherName + "\n============================================");
	}

}
