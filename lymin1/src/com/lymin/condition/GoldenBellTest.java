package com.lymin.condition;

import java.util.Scanner;

public class GoldenBellTest {
	public static void main(String[] args) {
		System.out.println("If else Test ");
		Scanner scanner = new Scanner(System.in);

		int firstAnswer = 0;
		int secAnswer = 0;
		
		int ok_count = 0;

		System.out.println("");
		System.out.println("���� ��级�� ���Ű��� ȯ���մϴ�.");
		System.out.println("");
		System.out.println("�̱����� ������ ���Ż��� ���� ����� �����ϱ��?");
		System.out.println("1. ����");
		System.out.println("2. ���ֽ�");
		System.out.println("3. ���帮�߸�");
		firstAnswer = scanner.nextInt();

		System.out.println("");
		if (firstAnswer == 1) {
			System.out.println("(1.����) �����Դϴ�.");
			ok_count++;
		} else {
			System.out.println("Ʋ�Ⱦ��.");
		}

		System.out.println("");
		System.out.println("��ȭ ���� ��Ʈ������2���� ��Ʈ������ ������ ũ����ƾ���� ���� �����ΰ���?");
		System.out.println("1. ����ÿ ������");
		System.out.println("2. ����ÿ �ƾƴ㽺");
		System.out.println("3. �����ں��� �ý�");
		secAnswer = scanner.nextInt();

		if (secAnswer == 2) {
			System.out.println("2. ����ÿ �ƾƴ㽺) �����Դϴ�.");
			ok_count++;
		} else {
			System.out.println("Ʋ�Ⱦ��.");
		}
		System.out.println("");
		System.out.println("��� "+ ok_count + "���� ���߼̾��.");
		System.out.println("");
		System.out.println("��级�� ����Ǿ����.");
	}
}
