package com.jslee.operator;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// ��/��/�� ���� �Է� -> ��/��/��,����,���,��� ���
		// ����� 90���̻��̸� A����, 80�� �̻��̸� B����, 70�� �̻��̸� C����, �������� F����

		System.out.println("���� ������ �Է��ϼ���.");		
		int score1 = in.nextInt();//���� ����
		
		System.out.println("���� ������ �Է��ϼ���.");
		int score2 = in.nextInt();//���� ����
		
		System.out.println("���� ������ �Է��ϼ���.");
		int score3 = in.nextInt();//���� ����
		
		int sum = score1 + score2 + score3;//����
		double average = sum / 3;//���
		//������ char < int < double
		//�ڷ����� ū ������ ��������.
		//&&�� �ΰ��� ������ �¾ƾ� �Ѵ�.
		//||�� �� �� �ϳ��� ������ �¾Ƶ� �ȴ�.
		char grade;//����
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}		
		System.out.println("���� ������ [" + score1 + "]�� �Դϴ�.");
		System.out.println("���� ������ [" + score2 + "]�� �Դϴ�.");
		System.out.println("���� ������ [" + score3 + "]�� �Դϴ�.");
		System.out.println("������ [" + sum + "]�� �Դϴ�.");
		System.out.println("��� ������ [" + average + "]�� �Դϴ�.");
		System.out.println("������ [" + grade + "]�Դϴ�.");
	}

}
