package com.jslee.method;

import java.util.Scanner;

public class MethodArrayTest {
	
	int[] MethodArray(int n) { // idxArray��� �޼ҵ� ���� �Ű����� 1�� return(O) 
		// ���� �޼ҵ��� n�� �Ű������� n�� �ٸ� n������ ���� ������ �� �򰥸��� �ʱ� ���ؼ� �������� �����ϰ� ���ߴ� �Ϲ����� ���� �ִ�.
		// �迭�� �����ϱ� ������ ���¸� ���߱� ���ؼ� int[]�� ����Ѵ�.
		int[] a = new int[n]; // a��� �̸��� ������ �������� �迭 ����
		for (int i = 0; i < n; i++) {
			a[i] = i; // a�� i��° �迭�� i�� ���� 
		}
		return a; // �迭�� a���� ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // ��ĳ�� ����
		MethodArrayTest result = new MethodArrayTest(); // Ŭ������ ����Ҽ� �ִ� ���� ���
		System.out.print("��� ���� : "); // ��� ���� �Է��ϱ� ���� ��¹�
		int n = sc.nextInt(); // ����ڿ��� ������ �Է°��� ����
		int [] x = result.MethodArray(n); // ���� ���� a���� x��� ������ ���� 
		
		for (int i = 0; i < n; i++) { // ����ڿ��� ���� �Է°���ŭ �ݺ� 
			System.out.println("x[" + i + "] = " + x[i]); // �ݺ��� Ƚ����ŭ ���
		}

	}

}
