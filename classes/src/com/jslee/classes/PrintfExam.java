package com.jslee.classes;

public class PrintfExam {

	public static void main(String[] args) {
		// printf�� ��� ������ ��������� �ִ�. �׷��� ������ ������ ���� ������� �ȴ�.
		// %f�� �Ҽ������� ����� �ϴµ� �� ���̿� .���ڸ� �Է��ϸ� ���° �Ҽ������� ��Ÿ���� ������ �� �ִ�.
		// %20.3f�� 20ĭ�� ���� �Ҽ��� ���ڸ����� ǥ���ϰڴٴ� �ǹ��̴�.
		// %,d ��� �ִ� ,�� ���ڸ� ������ ,�� ��ڴٴ� �ǹ��̴�.
		// $�� �����ϸ� ��,��,���� �˱� ������ ��¥�� ��ȯ�ؼ� ����Ѵ�.
		// %d�� ������ ���·� ��µȴ�.
		// %n�� �ٹٲ��̴�.
		// TODO Auto-generated method stub
		System.out.printf("%d%d%n",30,20);
		System.out.printf("%d,%d%n",20,30);
		System.out.println();
		
		System.out.printf("���� : %,d��%n",25320000);
		System.out.printf("%20.3f%n",35.33333);
		System.out.println();
		
		System.out.printf("%d�� %d�� %d��%n",2009,5,3);		
		System.out.printf("%2$d�� %3$d�� %1$d��%n",1,2005,3);
		System.out.println();
	}

}
