package com.lymin.javaapi;

public class SystemAPI02Test {
	public static void main(String[] args) {

		long startTime = 0;
		long endTime = 0;

		System.out.println("myOS is [" + System.getProperty("os.name") + "]");
		System.out.println("java version is [" + System.getProperty("java.version") + "]");

		for (int i = 0; i < 9999999; i++) { // õ����
			System.out.println("counter is [" + i + "]");
			if (i == 0) {
				startTime = System.currentTimeMillis();
			} else if (i == 799) {
				System.out.println("counter is [" + i + "] gc!");
				System.gc();
			} else if (i == 899999) { // ���鸸��.
				endTime = System.currentTimeMillis();
				System.out.println("�ҿ�ð��� " + (endTime - startTime) / 1000 + "��"); // �и���ũ ���� �Դϴ�. �ʸ� ���Ϸ��� 1000���� ���������
																					// �մϴ�.
				System.out.println("counter is [" + i + "] Exit!");
				System.exit(0);
			} else {

			}

		}

	}

}
