package com.lymin.operator;

public class CompareOperatorTest {
	public static void main(String[] args) {
		int number01 = 10;
		int number02 = 20;

		boolean compareResult01 = (number01 == number02);
		boolean compareResult02 = (number01 != number02);
		boolean compareResult03 = (number01 > number02);
		boolean compareResult04 = (number01 < number02);
		boolean compareResult05 = (number01 >= number02);
		boolean compareResult06 = (number01 <= number02);

		System.out.println("compareResult01 == value is [" + compareResult01 + "]");
		System.out.println("compareResult02 != value is [" + compareResult02 + "]");
		System.out.println("compareResult03 > value is [" + compareResult03 + "]");
		System.out.println("compareResult04 < value is [" + compareResult04 + "]");
		System.out.println("compareResult05 >= value is [" + compareResult05 + "]");
		System.out.println("compareResult06 <= value is [" + compareResult06 + "]");

	}

}
