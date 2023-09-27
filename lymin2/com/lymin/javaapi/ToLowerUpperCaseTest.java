package com.lymin.javaapi;

public class ToLowerUpperCaseTest {
	public static void main(String[] args) {
		String string = "I'm a boy";

		String toLower = string.toLowerCase();
		String toUpper = string.toUpperCase();

		System.out.println("toLower Value is [" + toLower + "]"); // 모두 소문자로
		System.out.println("toUpper Value is [" + toUpper + "]"); // 모두 대문자로..
	}

}
