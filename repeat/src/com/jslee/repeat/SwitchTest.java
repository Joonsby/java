package com.jslee.repeat;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int month = stdin.nextInt();
		String MtoS;
		switch (month) {
		case 12:
		case 1:
		case 2:
			MtoS = "�ܿ��Դϴ�.";
			break;
			// 12,1,2���� ���
			// if���� �̿��ؼ� ǥ���ϸ�
			// if (month == 12 || month == 1 || month == 2)�� ǥ���� �� �ִ�.
		case 3:
		case 4:
		case 5:
			MtoS = "���Դϴ�";
			break;
			//3,4,5���� ���
		case 6:
		case 7:
		case 8:
			MtoS = "�����Դϴ�.";
			break;
			// 6,7,8���� ���
		case 9:
			System.out.println("���� 9����");
		case 10:
			System.out.println("�Ƹ��ٿ� 10����");
		case 11:
			System.out.println("������ 11����");
			MtoS = "�����Դϴ�.";
			break;
			// 9,10,11���� ���
		default:
			MtoS = "1~12���� ��� ���Դϴ�.";
			break;
			// 1~12���� ������ ������ ������ ���
		}
		System.out.println(MtoS);
	}

}
