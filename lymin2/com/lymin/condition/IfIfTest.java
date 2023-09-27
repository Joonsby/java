package com.lymin.condition;

public class IfIfTest {
	public static void main(String[] args) {
		char gubun = 'F'; // M: male, F: Female
		int age = 20;

		if (gubun == 'F') {
			if (age == 20) {
				System.out.println("Female.. age is 20");
			} else {
				System.out.println("Female.. age is not 20");
			}

		} else if (gubun == 'M') {
			System.out.println("male");
		} else {
			System.out.println("unknown case...");
		}
	}

}
