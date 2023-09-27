package com.lymin.javaapi;

public class StringValueOfTest {
	public static void main(String[] args) {
		String string = String.valueOf(100);
		String string2 = String.valueOf(100.123);
		String string3 = String.valueOf(true);

		System.out.println(string);
		System.out.println(string2);
		System.out.println(string3);
	}

}
