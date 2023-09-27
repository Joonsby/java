package com.lymin.operator;

public class LogicOperatorTest {
	public static void main(String[] args) {
		boolean isOnTv = true;
		boolean isOnRadio = true;

		if (isOnTv && isOnRadio) { // 앞의 피연산자를 검사하여 false면 뒤의 연산자를 검사하지 않습니다. 효율적이므로 실무에서 이것이 많이 쓰입니다.
			System.out.println("AND(&&) is true..isOnTv isOnRadio");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isONRadio value is " + isOnRadio);
		} else {
			System.out.println("AND(&&) the others case...");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isONRadio value is " + isOnRadio);
		}

		System.out.println("===========================================");

		if (isOnTv & isOnRadio) { // 피연산자 2개를 모두 검사합니다. (비효율적으로 실무에서 잘 사용되지 않습니다.)
			System.out.println("AND(&) is true..isOnTv isOnRadio");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isONRadio value is " + isOnRadio);
		} else {
			System.out.println("AND(&) the others case...");
			System.out.println("isOnTv value is " + isOnTv);
			System.out.println("isONRadio value is " + isOnRadio);
		}

	}

}
