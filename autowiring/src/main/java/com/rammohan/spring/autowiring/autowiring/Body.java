package com.rammohan.spring.autowiring.autowiring;

public class Body {
	private Heart heart;
	private int id;

	public Body(Heart heart) {
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void setId(int id) {
		this.id = id;
	}

	void startPump() {
		if (heart != null) {
			heart.startPumping();
		} else {
			System.out.println("You are dead!");
		}
		System.out.println("id:: " + id);
	}
}
