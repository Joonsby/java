package com.lymin.operator;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력 \n");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		
		System.out.println();
		
		System.out.print("정수 입력 \n");
		int inputNum = scanner.nextInt();
		System.out.println(inputNum);
		
		System.out.println();
		
		System.out.print("실수 입력 \n");
		double inputRealNum = scanner.nextDouble();
		System.out.println(inputRealNum);
		
	}
}
