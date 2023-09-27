package com.lymin.access;

public class AirplaneTest {
	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		airplane.setStop(true);
		airplane.setSpeed(20);

		System.out.println("airplane.getStop value is [" + airplane.isStop() + "]");
		System.out.println("airplane.getSpeed value is [" + airplane.getSpeed() + "]");
	}

}
