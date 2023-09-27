package com.lymin.operator;

import java.util.Scanner;

public class Scanner02Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("당신의 이름을 입력해 주세요. \n");
		String inputName = scanner.nextLine();
		System.out.println("당신의 이름은 [" + inputName + "]" + "입니다.");

		System.out.println();

		System.out.print("당신의 나이를 입력해 주세요. \n");
		int inputAge = scanner.nextInt();
		System.out.println("당신의 나이는 [" + inputAge + "]" + "입니다.");

		System.out.println();
	}
}
