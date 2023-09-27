package com.jslee.method;

import java.util.Scanner;

public class OverloadingTest {
	int maxOf(int[] a) { // ù��° �޼ҵ� ���� �Ű������� �޴� ���� �迭�̱� ������ a��� ������ �迭�� ����
		int max = a[0]; // �ִ밪�� �����ϱ� ���� max �ʱⰪ�� a �迭�� 0��°�� ����
		for (int i = 0; i < a.length; i++) { // a�� ���ڸ�ŭ �ݺ�
			if(a[i]>max) { // a�� i��° ���� max�� ������ ũ�ٸ� max ���� a�� i��° �迭�� ������ ���� 
				max = a[i];
			}
		}
		return max;
	}
	
	// main�� �����ϴ°� ����� ���� �ڵ尡 �� ���� ���� ����.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingTest ob = new OverloadingTest(); // class�� ����ϱ� ���� ���� ���
		Scanner stdln = new Scanner(System.in); // stdln Scanner ����
		
		System.out.print("�ο� ���� �Է����ּ��� : "); // �ο� ���� �Է��ϴ� ��¹�
		int person = stdln.nextInt(); // ����ڰ� �Է��� �ο� ���� �ޱ� ���� ���� person
		
		int[] height = new int[person]; // ����ڰ� �Է��� ���ڸ� �迭�� ������ �Է�
		int[] weight = new int[person]; // ����ڰ� �Է��� ���ڸ� �迭�� ������ �Է�
		
		System.out.println(person + "���� ����� ü���� �Է��Ͻÿ�."); // ����ڰ� �Է��� �ο����� �˷��ֱ� ���� ��¹�
		for (int i = 0; i < person; i++) { // ����ڰ� ��ĳ�ʿ� �Է��� ���ڸ�ŭ for�� �ݺ�
			System.out.print((i + 1) + "���� ���� : "); // i�� 0���� �����ϱ� ������ +1�� ���ְ� i��° ����� ������ �Է��ϱ� ���� ��¹�
			height[i] = stdln.nextInt(); // ����ڰ� �Է��� i��° ������ �ޱ����� �迭
			System.out.print((i + 1) + "���� ü�� : "); // i�� 0���� �����ϱ� ������ +1�� ���ְ� i��° ����� ü���� �Է��ϱ� ���� ��¹�
			weight[i] = stdln.nextInt(); // ����ڰ� �Է��� i��° ������ �ޱ����� �迭
		}
		System.out.println("���� Ű�� ū ����� ���� : " + ob.maxOf(height) + "cm"); // ����ڰ� �Է��� Ű�� �ִ��� method�� �̿��Ͽ� ��� 
		// �迭�� �̸��� �Ű������ȿ� �����ϸ� �迭 ��ü�� ������ �� �ִ�.
		System.out.println("���� �׶��� ����� ü�� : " + ob.maxOf(weight) + "kg"); // ����ڰ� �Է��� ü���� �ִ��� method�� �̿��Ͽ� ���
		// System.out.println(height); �̷������δ� �迭 ��ü�� ����� �� ����.
	}

}
