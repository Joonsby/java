package com.lymin.condition;

import java.util.Scanner;

public class MBTITest {
	public static void main(String[] args) {
		System.out.println("If switch Test ");
		Scanner scanner = new Scanner(System.in);
		int MBTIType = 0;
		System.out.println("MBTI�� ������ �˾ƺ��ϴ�. ");
		System.out.println("");
		System.out.println("����� MBTI�� �����ΰ���? ");
		System.out.println(" 1. ENFJ \n 2. ISTJ \n 3. ESTP  \n 4. INFJ \n ");

//		MBTIType = scanner.nextInt();
		
		try { // ����ڰ� ���ھƴ� �׿� ���� �Է� �κп� ���� ���ܸ� ó�� �մϴ�.
			MBTIType = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��� ��� �մϴ�.");
		}

		System.out.println("");
		if (MBTIType == 1) {
			System.out.println("ENFJ : ������");
		} else if (MBTIType == 2) {
			System.out.println("ISTJ : ����������");
		} else if (MBTIType == 3) {
			System.out.println("ESTP : �����");
		} else if (MBTIType == 4) {
			System.out.println("INFJ : ��ȣ��");
		} else {
			System.out.println("����Ÿ�� �����ϴ�. 1~4�� �Է��� �ּž� �մϴ�");
		}

		System.out.println("");
		System.out.println("���α׷��� ���� �Ǿ����ϴ�. ");
	}
}
