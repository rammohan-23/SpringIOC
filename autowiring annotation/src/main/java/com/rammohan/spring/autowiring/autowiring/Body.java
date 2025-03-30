package com.rammohan.spring.autowiring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Body {
	@Autowired
	@Qualifier("humanHeartObject")
	private Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("set");
	}

	void startPump() {
		if (heart != null) {
			heart.startPumping();
		} else {
			System.out.println("You are dead!");
		}
	}
}
