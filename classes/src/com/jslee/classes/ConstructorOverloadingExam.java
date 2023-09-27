package com.jslee.classes;

class PuppyExam { // PuppyExam Ŭ���� ����
	PuppyExam() { // ������ ����
		System.out.println("������  ���");
	}

	PuppyExam(String A) { // ������ �����ε� ���� (String �Ű����� 1��)
		System.out.println("�Ű����� ���� [" + A + "] �Դϴ�.");
	}

	PuppyExam(String Java, String Hi) { // ������ �����ε� ���� (String �Ű����� 2��)
		System.out.println("�Ű����� ���� [" + Java + "," + Hi + "] �Դϴ�.");
	}

	PuppyExam(char F) { // ������ �����ε� ���� (Char �Ű����� 1��)
		System.out.println("�Ű����� ���� [" + F + "] �Դϴ�.");
	}

	PuppyExam(boolean isTrue) { // ������ �����ε� ���� (boolean �Ű����� 1��)
		System.out.println("�Ű����� ���� [" + isTrue + "] �Դϴ�.");
	}
}

public class ConstructorOverloadingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PuppyExam p1 = new PuppyExam();

		PuppyExam p2 = new PuppyExam("A");

		PuppyExam p3 = new PuppyExam("Java", "Hi");

		PuppyExam p4 = new PuppyExam('F');

		PuppyExam p5 = new PuppyExam("true");

		// ��ü ����� ���ÿ� �����ڰ� ȣ���� �ȴ�.
	}

}
