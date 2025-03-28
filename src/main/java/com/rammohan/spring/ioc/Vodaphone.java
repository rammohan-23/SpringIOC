package com.rammohan.spring.ioc;

public class Vodaphone implements Sim{

	@Override
	public void call() {
		System.out.println("calling from Vodaphone sim");
	}

	@Override
	public void useData() {
		System.out.println("using data from Vodaphone sim");
	}


}
