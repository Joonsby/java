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

		System.out.println("결제 화면입니다.");
		System.out.println("인증번호를 입력해 주세요.");
		inputConfirmNum = scanner.nextInt();

		System.out.println("비밀번호를 입력해 주세요.");
		inputPwNum = scanner.nextInt();

		if (confirmNum == inputConfirmNum && pwNum == inputPwNum) {
			System.out.println("결제에 성공했어요.");
		} else {
			System.out.println("인증번호 또는 PW가 잘 못 되었어요");
		}

		System.out.println("----------------------------------");
		System.out.println("id value is inputId confirmNum value is " + confirmNum);
		System.out.println("id value is inputId input_confirm_num value is " + inputConfirmNum);
		System.out.println("----------------------------------");
		System.out.println("pw value is inputPw pwNum value is " + pwNum);
		System.out.println("pw value is inputPw inputPwNum value is " + inputPwNum);
	}
}
