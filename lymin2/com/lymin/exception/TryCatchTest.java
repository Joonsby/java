package com.lymin.exception;

public class TryCatchTest {
	public static void main(String[] args) {
		try {
			Class class1 = Class.forName("java.lang.StringTwo"); // 이런 이름이 있는지 검사합니다.

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 예외상세를 콘솔 화면에 표기 하여 줃 수 있습니다.
			System.out.println("Class not exsist");
		}
	}

}
