package com.lymin.operator;

import java.util.Scanner;

public class ComfirmTest {
	public static void main(String[] args) {
		System.out.println("Operator Two Test");
		Scanner scanner = new Scanner(System.in);

		int confirmNum = 1234;
		int pwNum = 1111;

		int inputConfirmNum = 0;
		int inputPwNum = 0;

		System.out.println("���� ȭ���Դϴ�.");
		System.out.println("������ȣ�� �Է��� �ּ���.");
		inputConfirmNum = scanner.nextInt();

		System.out.println("��й�ȣ�� �Է��� �ּ���.");
		inputPwNum = scanner.nextInt();

		if (confirmNum == inputConfirmNum && pwNum == inputPwNum) {
			System.out.println("������ �����߾��.");
		} else {
			System.out.println("������ȣ �Ǵ� PW�� �� �� �Ǿ����");
		}

		System.out.println("----------------------------------");
		System.out.println("id value is inputId confirmNum value is " + confirmNum);
		System.out.println("id value is inputId input_confirm_num value is " + inputConfirmNum);
		System.out.println("----------------------------------");
		System.out.println("pw value is inputPw pwNum value is " + pwNum);
		System.out.println("pw value is inputPw inputPwNum value is " + inputPwNum);
	}
}
