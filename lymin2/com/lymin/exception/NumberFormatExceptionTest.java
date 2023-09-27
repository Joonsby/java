package com.lymin.exception;

public class NumberFormatExceptionTest {
	public static void main(String[] args) {
		String temp = "10";
//		String temp2 = "10ABC";
		String temp2 = "100";

		int result = Integer.parseInt(temp);
		int result2 = Integer.parseInt(temp2);

		System.out.println("result value is " + result);
		System.out.println("result value is " + result2);

	}
}
