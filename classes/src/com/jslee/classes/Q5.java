package com.jslee.classes;

import java.util.Scanner;

class GradeResult {
	String Grade, name;
	int java, html, jsp, sum, average;
}

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GradeResult result = new GradeResult();

		for (int i = 1; i <= 5; i++) {

			System.out.println(i + "��° �л� �Դϴ�.\n");
			System.out.println("�й��� �Է����ּ���.");
			String grade = sc.nextLine();
			System.out.println("�й��� [" + grade + "] �Դϴ�.\n");

			System.out.println("�̸��� �Է����ּ���.");
			String name = sc.nextLine();
			System.out.println("�̸��� [" + name + "] �Դϴ� \n");

			System.out.println("java�� ������ �Է����ּ���.");
			int java = sc.nextInt();

			System.out.println("html�� ������ �Է����ּ���.");
			int html = sc.nextInt();

			System.out.println("jsp�� ������ �Է����ּ���.");
			int jsp = sc.nextInt();

			int result1 = java + html + jsp;
			System.out.println("������ ������ " + result1 + "�� �Դϴ�.");

			int average = result1 / 3;
			System.out.println("������ ����� " + average + "�� �Դϴ�.\n");
		}

	}

}
