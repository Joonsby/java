package com.lymin.condition;

import java.util.Scanner;

public class AlertSystemTest {
	public static void main(String[] args) {
		System.out.println("While Ex Test ");
		Scanner scanner = new Scanner(System.in);
		
		boolean isRun = true;
		int selectKey = 0;
		while (isRun) {
			System.out.println("=======================================");
			System.out.println("���� ��� �ý����� �۵� �� �Դϴ�. ");
			System.out.println("���ϴ½ô� ������ ���� �� �ּ���. ");
			System.out.println("-----------------------");
			System.out.println("1. �ý��� �۵� ���� ");
			System.out.println("2. ���� ���� ");
			System.out.println("-----------------------");

			selectKey = scanner.nextInt();

			if (selectKey == 1) {
				isRun = false;
			} else if (selectKey == 2) {
				System.out.println("�����¸� ��� ���� �մϴ�. ");
			} else {
				System.out.println("�˼� ���� ��ȣ[" + selectKey + "]�Դϴ�. ���Է� �� �ּ���. \n");
			}

		}

		System.out.println("��� �ý����� ���� �Ǿ����ϴ�.");
	}
}
