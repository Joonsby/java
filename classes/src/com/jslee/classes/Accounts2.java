package com.jslee.classes;

// class�� �̿��ؼ� ��ü�� ������ �� �����̴�.
// method�� ���������� main class�� �ٴ����� ���°��� ����.

class Account{ // ���°��� Ŭ���� ����
	String name; // �ʵ� : ����
	String no;
	int balance;
	void print() {
		System.out.println("�� �̸� :" + name);
		System.out.println("�� ���¹�ȣ :" + no);
		System.out.println("�� �ܾ� :" + balance);
	}
	//Ŭ������ �Ϻ��������� �ʵ带 �����ϰ� �۾��� �� �ִ� �޼ҵ尡 ���� �ȴ�.
}

public class Accounts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account user1 = new Account(); // ���ο� ��ü ����		
		user1.name = "ö��";
		user1.no = "123456";
		user1.balance = 1000;
		
		Account user2 = new Account(); // ���ο� ��ü ����
		user2.name = "����";
		user2.no = "654321";
		user2.balance = 200;
		
//		System.out.println(" �� �̸�: " + user1.name);
//		System.out.println(" �� ���¹�ȣ: " + user1.no);
//		System.out.println(" �� �ܾ�: " + user1.balance + "��");
//		
//		System.out.println(" �� �̸�: " + user2.name);
//		System.out.println(" �� ���¹�ȣ: " + user2.no);
//		System.out.println(" �� �ܾ�: " + user2.balance + "��");
		// �޼ҵ忡 ��¹��� ����־��� ������ ��¹��� �ʿ� ��������.
		user1.print();
		user2.print();

	}

}
