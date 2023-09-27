package com.lymin.operator;

public class DenyOperatorTest {
	public static void main(String[] args) {
		boolean isOnTV = false;

		System.out.println("isOnTv value is " + isOnTV);

		isOnTV = !isOnTV;

		System.out.println("isOnTv value is " + isOnTV);

		if (!isOnTV) {
			System.out.println("TV is Off");
		} else {
			System.out.println("TV is On");
		}
	}
}
