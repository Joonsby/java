package com.jslee.inheritance;

class AA{
	private int a; // Ŭ���� �������� ����� �� �ִ� ������ ���� a ����
	AA(){ // �޼ҵ� AA ȣ��
		a = 50;
	}
	int getA() { // a���� ���Ͻ�Ű�� getA ���� ȣ��
		return a;
	}
}

class BB extends AA { // Ŭ���� BB�� AA�κ��� ��� ����
	// �ڽĿ��� �����ڰ� �������� �ʾƵ� �ִ�.
	// �ڽĿ��� �����ڰ� �������� �ʾƵ� �θ��� �����ڴ� ȣ�� �ȴ�.
}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB x = new BB(); // BB Ŭ���� ��ü ����
		System.out.println("x.getA() = " + x.getA()); // return ���� a ���� ȣ��
	}

}
