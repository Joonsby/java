package com.lymin.classes;

public class Calculator {

	// 메소드 Method : 아래와 같은 형태로 존재 한다.
	int plus(int x, int y) { // 리턴 값이 있으며, 매개변수가 2개
		int result = 0;
		result = x + y;

		return result;
	}

	int minus(int x, int y) {
		int result = 0;
		result = x - y;

		return result;
	}

	String getName() { // 리턴 값이 String
		String result = "MyCalculor";

		return result;
	}

	boolean isBateryEmpty() { // 리넡 값이 boolean.
		return false;
	}

	void setFactoryInit() { // 리턴 값이 없음.
		System.out.println("---------Calculator is Factory Init----------");
	}

}
