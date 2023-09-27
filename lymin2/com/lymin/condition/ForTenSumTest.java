package com.lymin.condition;

public class ForTenSumTest {
	public static void main(String[] args) {
		int totalSum = 0;

		for (int i = 1; i < 101; i++) {
			totalSum = totalSum + i;
			System.out.println("----------roof-----" + totalSum);
		}
		System.out.println("1+2+3....+10 result value is " + totalSum);

	}

}
