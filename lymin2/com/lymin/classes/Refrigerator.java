package com.lymin.classes;

public class Refrigerator {

	void goOnOpen() {
		System.out.println("door Open");
	}

	void goOnClose() {
		System.out.println("door Close");
	}

	boolean isDoorOpen() {
		return false;
	}

	void runFreeze() {
		System.out.println("Freezing Start");
	}

	String getModelName() {
		String result = "DIOS-S631";

		return result;
	}
	
	int getTemperature() {
		int result = 0;
		result = -20;
		return result;
	}

}
