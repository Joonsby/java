package com.jslee.inheritance;

class SuperClassExam { // SuperClassExam Ŭ���� ����
	SuperClassExam() { // ������ ����
		System.out.println("������ SuperClassExam() ȣ��");
	}

	public void methodZero() { // methodZero �޼ҵ� ����
		System.out.println("SuperClassExam methodZero() ȣ��");
	}

	/*
	int methodTwo(int i) { // methodTwo �޼ҵ� ���� ������ �Ű����� 1��
		System.out.println("superClass methodTwo(int i)�޼ҵ� ȣ��");
	}

	protected String methodThree(int i) { // methodThree �޼ҵ� ���� returnType : String int �Ű����� 1��
		System.out.println("SuperClass methodThree(int i)�޼ҵ� ȣ��");
		return i;
	}
	���� ���ſ� �ּ�
	*/	
}

class SubClassExam extends SuperClassExam { // SubClassExam Ŭ���� ���� SuperClassExam ��ӹ���
	SubClassExam() { // SubclassExam �޼ҵ� ����
		System.out.println("������ SubClass() ȣ��");
	}

	public void methodZero() { // methodZero �޼ҵ� ���� return ����
		System.out.println("SubClass methodZero() �޼ҵ� ȣ��");
	}

	public void methodOWn() { // methodOne �޼ҵ� ���� return ����
		System.out.println("SubClass methodOWn() �޼ҵ� ȣ��");
	}

	String methodThree(String s, int k) { // methodThree �޼ҵ� ���� returnType: String String,int�� �Ű����� ���� 2��
		System.out.println("SubClass methodTwo() �޼ҵ� ȣ��");
		return s;
	}

	protected String methodThree(int k, String str) { // methodThree �޼ҵ� �����ε� �Ű������� ������ ������ �Ű������� ������ �ٸ��� ������ overriding�� �ƴϴ�.
		System.out.println("SubClass methodThree() �޼ҵ� ȣ��");
		return str;
	}
	
	// methodThree�� �Ű������� �ٸ��� �θ� ������ �ִ� �޼ҵ带 �ڽ��� �������� �ʾұ� ������ overriding�� �ƴϴ�.
}

public class SuperClassExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClassExam sp = new SuperClassExam();
		SubClassExam sb = new SubClassExam();
		// sb.methodThree(100); // �ڽĿ��� ���� int�� �Ű����� �Ѱ��� ������ �ִ� �޼ҵ尡 �ڽĿ��Դ� �������� ������ �θ𿡰� �����ϱ� ������ ȣ���� �����ϴ�.
		// sp.methodOwn(); // SuperClassExam���� methodOwn �޼ҵ尡 �������� �ʱ� ������ ȣ���� �� ����.
		// sb.methodTwo(123); // �ڽ��� ������ ���� ������ �θ� ������ �ֱ� ������ �޼ҵ� ȣ���� �����ϴ�.

	}

}
