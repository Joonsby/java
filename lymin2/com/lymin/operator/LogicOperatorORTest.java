package com.lymin.operator;

public class LogicOperatorORTest {
	public static void main(String[] args) {
		boolean isOnPc = false;
		boolean isOnPhone = false;

		if (isOnPc || isOnPhone) { // 앞의 피연산자를 검사하여 true면 뒤의 연산자를 검사하지 않습니다. 효율적이므로 실무에서 이것이 많이 쓰입니다.
			System.out.println("OR(||) is true..isOnPc isOnPhone");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		} else {
			System.out.println("OR(||) the others case...");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		}

		System.out.println("===========================================");

		if (isOnPc | isOnPhone) { // 피연산자 2개를 모두 검사합니다. (비효율적으로 실무에서 잘 사용되지 않습니다.)
			System.out.println("OR(|) is true..isOnPc isOnPhone");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		} else {
			System.out.println("OR(|) the others case...");
			System.out.println("isOnPc value is " + isOnPc);
			System.out.println("isOnPhone value is " + isOnPhone);
		}

	}

}
