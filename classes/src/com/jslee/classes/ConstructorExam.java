package com.jslee.classes;

class Puppy{ // Puppy��� �̸��� Ŭ���� ����
	String str;
	int i;
	// Puppy���� �������� ����
	Puppy(){ // Puppy Ŭ���� �ȿ� ������ �̸��� Method ���� -> ������ ����
		System.out.println("������ ȣ��"); // �����ڰ� ȣ�� �Ǹ� "������ ȣ��"�̶�� ���� ���
		printPuppyName(); // �����ڰ� ȣ��Ǹ� printPuppyName() �޼ҵ� ��� 
		// ���� Ŭ���� �ȿ� �ִ� �޼ҵ�� ���� �޼ҵ� ȣ�⹮�� �ۼ����� �ʾƵ� ȣ���� �����ϴ�.
		str = "�޸�"; // printPuppyName()�� ����� �Ŀ� str �� "�޸�"��� �̸��� ���� 
		i = -98989; // printPuppyName()�� ����� �Ŀ� i �� -98989 ���ڸ� ����
	}
	public void printPuppyName() { // printPuppyName �޼ҵ� ����
		System.out.println("printPuppyName() ȣ��");
		System.out.println("���� ���� str = " + str + ", i = " + i);
	}
}

public class ConstructorExam {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p = new Puppy(); // ��ü ������ ���ÿ� ������ ȣ�� (�����ڴ� ��ü�� ������ �� ���� ȣ������ �ʾƵ� �ڵ����� ȣ��ȴ�.)
		p.printPuppyName();  // printPuppyName�̶�� �޼ҵ带 ȣ���ϴ� ��ɹ�
	}

}
