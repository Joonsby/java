package com.lymin.condition;

import java.util.Scanner;

public class MBTITest {
	public static void main(String[] args) {
		System.out.println("If switch Test ");
		Scanner scanner = new Scanner(System.in);
		int MBTIType = 0;
		System.out.println("MBTI별 성향을 알아봅니다. ");
		System.out.println("");
		System.out.println("당신의 MBTI은 무엇인가요? ");
		System.out.println(" 1. ENFJ \n 2. ISTJ \n 3. ESTP  \n 4. INFJ \n ");

//		MBTIType = scanner.nextInt();
		
		try { // 사용자가 숫자아닌 그외 문자 입력 부분에 대한 예외를 처리 합니다.
			MBTIType = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("숫자만 입력해 줘야 합니다.");
		}

		System.out.println("");
		if (MBTIType == 1) {
			System.out.println("ENFJ : 선도자");
		} else if (MBTIType == 2) {
			System.out.println("ISTJ : 현실주의자");
		} else if (MBTIType == 3) {
			System.out.println("ESTP : 사업가");
		} else if (MBTIType == 4) {
			System.out.println("INFJ : 옹호자");
		} else {
			System.out.println("데이타가 없습니다. 1~4중 입력해 주셔야 합니다");
		}

		System.out.println("");
		System.out.println("프로그램이 종료 되었습니다. ");
	}
}
