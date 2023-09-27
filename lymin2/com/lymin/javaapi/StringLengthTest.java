package com.lymin.javaapi;

public class StringLengthTest {
	public static void main(String[] args) {
		String phoneNum = "01055556666";
//		String phoneNum = "07055556666";
//		String phoneNum = "0255556666";
//		String phoneNum = "024445555";
//		String phoneNum = "08072";

		if (phoneNum.length() == 11 && phoneNum.indexOf("010") == 0) {
			System.out.println("SmartPhone number");
		} else if (phoneNum.length() == 11 && phoneNum.indexOf("070") == 0) {
			System.out.println("Internet Phone number");
		} else if (phoneNum.length() < 11 && phoneNum.indexOf("02") == 0) {
			System.out.println("Seoul House Phone number");
		} else {
			System.out.println("Unknown Phone number");
			System.out.println("!!!phoneNum.length value is [" + phoneNum.length() + "]");
			System.out.println("!!!phoneNum value is [" + phoneNum + "]");
		}

		System.out.println("phoneNum.length value is [" + phoneNum.length() + "]");
		System.out.println("phoneNum value is [" + phoneNum + "]");

	}

}
