package com.lymin.operator;

import java.util.Scanner;

public class Scanner02Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("����� �̸��� �Է��� �ּ���. \n");
		String inputName = scanner.nextLine();
		System.out.println("����� �̸��� [" + inputName + "]" + "�Դϴ�.");

		System.out.println();

		System.out.print("����� ���̸� �Է��� �ּ���. \n");
		int inputAge = scanner.nextInt();
		System.out.println("����� ���̴� [" + inputAge + "]" + "�Դϴ�.");

		System.out.println();
	}
}
