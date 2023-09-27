package com.lymin.operator;

import java.util.Scanner;

public class TwoNumCompareTest {
	public static void main(String[] args) {
		System.out.println("Operator Two Test");
		int inputNum01 = 0;
		int inputNum02 = 0;
		boolean isEqual = false;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력해 주세요. \n");
		inputNum01 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력해 주세요. \n");
		inputNum02 = scanner.nextInt();
		
		isEqual = (inputNum01 == inputNum02);

		System.out.println("input two num isEqual value is ["+ isEqual+"]");
	}
}
