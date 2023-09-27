package com.lymin.operator;

public class StringAddOperatorTest {
	public static void main(String[] args) {
		String openSign = "[";
		String closeSign = "]";
		String contentsText = "우리나라는 대한민국이다.";
		
		System.out.println(openSign + contentsText + closeSign);
		
		System.out.println("====================" + openSign + contentsText + closeSign + "======================");

	}

}
