package com.lymin.condition;

public class IfIfIfTest {
	public static void main(String[] args) {
		char gubun = 'F'; // M: male, F: Female
		int age = 20;
		boolean join = true;

		if (gubun == 'F') {
			if (age == 20) {
				System.out.println("Female.. age is 20");

				if (join) { // 이렇게 3중 If는 사용을 금지 합니다. 코드의 가독성이 떨어집니다.
					System.out.println("Female.. age is 20 join true");
				} else {
					System.out.println("Female.. age is 20 join false");
				}

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
