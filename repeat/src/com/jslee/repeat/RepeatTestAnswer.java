package com.jslee.repeat;

public class RepeatTestAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1�� ����
		int num1 = 0;
		for (int i = 5; i <= 87; i++) {
			num1 = num1 + i;
		}
		System.out.println("5~87 �հ� : " + num1);

		// 2�� ����
		int num2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				num2 = num2 + i;
			}
		}
		System.out.println(num2);

		// 3�� ����
		int num3 = 1;
		for (int i = 1; i <= 10; i++) {
			num3 = num3 * i;
		}
		System.out.println("1~10 �� : " + num3);
		
		// 4�� ����
	}

}
