package com.jslee.method;

public class MethodExam {
	// sub1 �޼ҵ� ���� (�Ű����� X return X)
	public void sub1() {
		System.out.println("---no argument ---"); // argument�� ���ٴ� ��¹�  
	}
	// sub2 �޼ҵ� ���� (�Ű����� O return X)
	public void sub2(int a, int b) { // int ������ �Ű����� �ΰ� ����
		int c; // �������� ���� c ����
		c = a + b; // ���� c�� �Ű����� a + b�̴�.
		System.out.println(a + "+" + b + " = " + c); // a + b = c��� ���� ���
	}
	// sub3 �޼ҵ� ����(�Ű����� O return O)
	public double sub3(int m, int n) { // �ΰ��� �������� ���� m , n ����  
		double k; // double ������ ���� k ����
		k = m + n; // �Ű����� m , n�� �� k ����
		System.out.println(m + " + " + n + " = " + k); // m + n = k��� ���� ���
		return k; // m + n = k�� �޼ҵ�� return
	}

	public static void main(String[] args) { // ���� �޼ҵ�
		// TODO Auto-generated method stub
		MethodExam ken = new MethodExam(); // ���� Ŭ���� ������ = new ���� Ŭ������(); Ŭ���� �ȿ� �ִ� ������ ����ϰڴٴ� ��
		System.out.println("***** method result *****"); // �޼ҵ� ��� ���� ���
		ken.sub1(); // sub1 �޼ҵ� ȣ��
		ken.sub2(30, 50); // sub2 �Ű������� ���� 30 50�� �����ϰ� �޼ҵ� ȣ��
		double w = ken.sub3(10, 20); // double ������ ���� w�� �Ű������� 10, 20 �� ���� ������ sub3 �޼ҵ带 ȣ���� ���� ����
		System.out.println("sub3(x , y) = " + w); // w���� ���
	}

}
