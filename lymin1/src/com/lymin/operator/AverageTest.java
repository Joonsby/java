package com.lymin.operator;

public class AverageTest {
	public static void main(String[] args) {
		System.out.println("Operator Two Test");
		int mathScore = 90;
		int historyScore = 100;
		int scienceScore = 70;
		int musicScore = 50;
		int average = 0;
		int sum = mathScore + historyScore + scienceScore + musicScore;
		average = (sum / 4);
		System.out.println("average value is " + (average));
	}
}
