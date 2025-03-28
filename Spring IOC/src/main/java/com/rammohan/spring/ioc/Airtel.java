package com.rammohan.spring.ioc;

public class Airtel implements Sim {

	@Override
	public void call() {
		System.out.println("calling from Airtel sim");
	}

	@Override
	public void useData() {
		System.out.println("using data from Airtel sim");
	}

}
