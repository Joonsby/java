package com.jslee.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in); // stdin�̶�� ���ο� Scanner ȣ��
		int i; // int ������ i ���� ����
		double sum = 0.0, avg; // double ������ sum�� 0.0���� ����, avg ����
		double dnum[] = new double[5]; // �̸��� dnum�̰� ���̰� 5�� ���ο� �迭 ���� 
		System.out.println("dnum �迭�� ���� : " + dnum.length); // dnum[]�� �迭�� ���̸� ��Ÿ����.(5��)
		System.out.println("�ʱ�ȭ ���� ���� dnum[]�� ��");
		for (i = 0; i < dnum.length; i++) {// �迭 �ȿ� �ִ� ������ double�� �ָ� �ȵȴ�. ������ �迭�� type�� �ƹ��� ������谡 ����.
			System.out.println(dnum[i] + " "); // �ʱ�ȭ���� ���� dnum�� ���� 0����5���� ��Ÿ����. ���� ���� �ʾұ� ������ 0.0���� ���´�.
		}
		System.out.println(); // ������ ��ĭ ������ ���� �� �ڵ�
		
		for( double num : dnum ) { // �迭�� �̿��Ҷ��� ����� �� �ִ� for��
			// �ڿ� ������ ���� �迭��(dnum) �迭���� ���� ������ for���� �˾Ƽ� �迭�� ������ŭ �ݺ��� �Ѵ�.
			// �迭���� ����ȭ �Ǿ� �ִ� for���� ������ �ڹٿ��� �����ϴ� ���̴�.
			// �迭�� double ���±� ������ ������ ������ double ������ ������ ����Ѵ�.
			System.out.println(num + ";");
			// System.out.println(dnum + ";"); �̷������� ����� �ϴ� ���� �Ұ����ϴ�. ��ü �迭�� �׳� ����Ѵٴ� ������ �������� �ʱ� �����̴�.
		}
		
		for (i = 0; i < dnum.length; i++) {			
			System.out.print("dnum[" + i + "] ��° ������ �Է� :"); // 0������ dnum�� ������ 4������ �����͸� �Է��ϴ� ��¹�
			dnum[i] = stdin.nextDouble(); // double������ �����͸� ����ڷκ��� �Է� �޴´�.			
		}
		
		for (i = 0; i < dnum.length; i++) {
			sum = sum + dnum[i]; // dnum �迭�� ���� 0����  dnum�� ������ 4������ �հ踦 ���ϴ� �� sum += dnum[i];���ε� ǥ���� �����ϴ�.
			System.out.println("�迭�� ���� " + sum + "�Դϴ�."); // dnum[i]�� �հ��� sum�� ����Ѵ�.
			avg = sum/dnum.length; // ������ �հ踦 �迭�� ���̷� �������ν� ����� ���Ѵ�.
			System.out.println("�迭 ���� �����  " + avg + "�Դϴ�."); // dnum[i]�� drum.length�� ������ ���� ��� ���� ����Ѵ�.
		}
		
		//for (double x : dnum) { // ������ loop��, ���� for���� ������ �����̴�.
		//	x += dnum[i];
		//}
		
	}

}
