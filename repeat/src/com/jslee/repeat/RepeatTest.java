package com.jslee.repeat;

import java.util.Scanner;

public class RepeatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 5~87���� ���� ���ϴ� ���α׷��� �ۼ�
		int num = 0;
		for (int i = 5; i <= 87; i++) {
			num = num + i;
		}
		System.out.println("1�� ������ ������ " + num + "�Դϴ�.");

		// 2. 1~100�� �߿��� 2�� ����̸鼭 7�� ����� ���ڸ� ����ϰ�
		// �� ��µ� ���ڵ��� ���� ���ϴ� ���α׷��� �ۼ��غ���.

		int num2 = 0;
		for (int i = 0; i <= 100; i += 14) {
			num2 = num2 + i;
		}

		System.out.println("2�� ������ ������ " + num2 + "�Դϴ�.");

		// 3. 1~10������ ���ؼ� �� ����� ����ϴ� ���α׷� �ۼ�

		int num3 = 1;
		for (int i = 1; i <= 10; i++) {
			num3 = num3 * i;
		}
		System.out.println("3�� ������ ������ " + num3 + "�Դϴ�.");

		// 4. �ΰ��� ���ڸ� �Է¹޾� �� �� ������ ���� �հ踦 ���Ѵ�.

		Scanner scanner = new Scanner(System.in);

//		System.out.println("ù��° ���ڸ� �Է����ּ���");
//		int inputNumber1 = scanner.nextInt();
//
//		System.out.println("�ι�° ���ڸ� �Է����ּ���");
//		int inputNumber2 = scanner.nextInt();
//
//		int j = 0;
//		for (int i = inputNumber1; i <= inputNumber2; i++) {
//			j = j + i;
//		}
//		System.out.println(j);

		// 5. 1���� �����ؼ� ��� Ȧ���� 3�� ����� ¦���� ���س�����.
		// �׸��� ������ ���� 1000�� �Ѿ���� 1000�� �Ѿ ���� �󸶳� �Ǵ��� ����Ͽ�
		// ����ϴ� ���α׷��� �ۼ�.

		// 6. �ΰ��� ���ڸ� �Է¹޴´�.
		// ���� ��� 3, 5�� �Է¹ް� �Ǹ� 3 , 4 , 5 �� ���
		// ��, ������ �Է��ϰų� �Ǵ� 5, 3 �Է��� �ǰų� 1~9 ���ڹ����� �Ѿ�� ��� X, �ٽ� �Է¹ޱ�

		System.out.println("ù��° ������ ���ڸ� �Է����ּ���."); // ù��° ������ ���� ����
		int multiNum1 = scanner.nextInt(); // ù��° ������ ���� Scanner
		
//		while(true) {
//			
//		}

		System.out.println("�ι�° ������ ���ڸ� �Է����ּ���"); // �ι�° ������ ���� ���� 
		int multiNum2 = scanner.nextInt(); // �ι�° ������ ���� Scanner

		for (int i = multiNum1; i <= multiNum2; i++) {
			for (int k = 1; k <= 9; k++) {
				System.out.println(multiNum1 + "*" + k + " = " + multiNum1 * k);
			}
			multiNum1++;
		}

		// 7. ���ڸ� �Է� �޴´�.
		// �Է¹��� ���ڰ� 0�� �ɶ����� �Էµ� ��� ���ڵ��� �հ踦 ���Ѵ�.

		// �Է� : 5
		// �Է� : 9
		// �Է� : 0 => 14
		
//		System.out.println("���ڸ� �Է����ּ���");
//		int num5 = scanner.nextInt();
//		int sum = 0;
//		
//		while(num != 0) {
//			System.out.println("���ڸ� �Է����ּ���");
//			sum = sum + num5;
//			num5 = scanner.nextInt();
//		}
	}
}