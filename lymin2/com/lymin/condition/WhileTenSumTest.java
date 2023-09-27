package com.lymin.condition;

public class WhileTenSumTest {
	public static void main(String[] args) {
		int totalSum = 0;
		int count = 0;
		
		while(count < 11) {
			System.out.println(count);
			totalSum = totalSum + count;
			count++;
		}
		System.out.println("1+2+3....+10 result value is " + totalSum);
	}
}
