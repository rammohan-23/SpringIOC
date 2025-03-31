package com.rammohan.spring.annotations.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:job-info.properties")
public class Job {
	@Value("${job.teamName}")
	private String teamName;
	@Value("${job.managerName}")
	private String managerName;

	void getJobInfo() {
		System.out.println("=================JOB DETAILS===============\nTeam Name : " + teamName + "\nManager : "
				+ managerName + "\n============================================");
	}
}
