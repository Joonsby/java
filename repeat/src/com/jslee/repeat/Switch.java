package com.jslee.repeat;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �ڵ��� ���� = �������� ���� �ڵ� -> ��ȣ�� ����ϰ� �����ϴ� ���� ����.
		//if���� ������� �� switch���� �̿��ϸ� �� �����ϰ� ����ϰ� �ڵ� �ۼ��� �����ϴ�.
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.printf("��������� �Է��ϼ���");
		year = s.nextInt();
		
		switch(year % 12) {
		case 0 : System.out.printf("�����̶�\n"); break;
		case 1 : System.out.printf("�߶�\n"); break;
		case 2 : System.out.printf("����\n"); break;
		case 3 : System.out.printf("������\n"); break;
		case 4 : System.out.printf("���\n"); break;
		case 5 : System.out.printf("�Ҷ�\n"); break;
		case 6 : System.out.printf("ȣ���̶�\n"); break;
		case 7 : System.out.printf("�䳢��\n"); break;
		case 8 : System.out.printf("���\n"); break;
		case 9 : System.out.printf("���\n"); break;
		case 10 : System.out.printf("����\n"); break;
		case 11 : System.out.printf("���\n"); break;
		}
		/*
		���������� double�� �� �� ����.
		ex) 0.0 �� 0.00�� ������ �ý����� �ٸ��� ���߰� �ֱ� ������ ��ǻ�Ͱ� �ν��� �� ���� �ٸ� �����̴�.
		�Ҽ��� �ڸ����� �Ϻ��ϰ� ��ġ�ؾ� double�� ��ġ�� �� �ִ�. double�� �׷��� �Ȱ��ٴ� ���� ��ü�� ���� �ȵȴ�.		
		case�� �������� ���� �� �ִ�.
		switch(����������){
		 �������������� ����� ������ �ִ� ���� �����Ѵ�.
		 case ��1: ���๮��; break;
		 case ��2: ���๮��; break;
		 case ��3: ���๮��; break;
		 case ��4: ���๮��; break;
		 default: -> if���� else�� ����
		}
		if(���>=90)
		if���� ������ ������ ������ �� ����ϰ� switch�� ��Ȯ�� ���� ������ �����Ҷ� ����Ѵ�.
		*/
	}

}
