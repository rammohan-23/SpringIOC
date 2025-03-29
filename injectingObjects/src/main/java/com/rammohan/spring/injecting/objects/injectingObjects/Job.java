package com.rammohan.spring.injecting.objects.injectingObjects;

public class Job {
	private String teamName;
	private String managerName;

	void getJobInfo() {
		System.out.println("=================JOB DETAILS===============\nTeam Name : " + teamName + "\nManager : "
				+ managerName + "\n============================================");
	}

	public Job(String teamName, String managerName) {
		this.teamName = teamName;
		this.managerName = managerName;
	}
}
