package com.lymin.operator;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� \n");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		
		System.out.println();
		
		System.out.print("���� �Է� \n");
		int inputNum = scanner.nextInt();
		System.out.println(inputNum);
		
		System.out.println();
		
		System.out.print("�Ǽ� �Է� \n");
		double inputRealNum = scanner.nextDouble();
		System.out.println(inputRealNum);
		
	}
}
