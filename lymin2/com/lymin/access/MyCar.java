package com.lymin.access;

public class MyCar {
	private int speed; // private 으로 보호해줍니다.

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

//	public int getSpeed() { // getter method (외부 접근을 위한 method)
//		return speed;
//	}
//	
//	public void setSpeed(int speed) { // setter method (외부 접근을 위한 method)
//		this.speed = speed;
//	}

}
