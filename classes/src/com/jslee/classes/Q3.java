package com.jslee.classes;

class Saram { // Saram Ŭ���� ����
	String name;
	int age;
	String gender;

	void title() { // Saram Ŭ���� �ȿ� title �޼ҵ� ����
		System.out.println("��� �̸� : " + name);
		System.out.println("��� ���� : " + age);
		System.out.println("��� ���� : " + gender);
		System.out.println("------------------");
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saram saram1 = new Saram();
		Saram saram2 = new Saram();
		Saram saram3 = new Saram();
		// ���ο� ��ü ����

		saram1.name = "ö��";
		saram1.age = 26;
		saram1.gender = "����";

		saram2.name = "����";
		saram2.age = 21;
		saram2.gender = "����";

		saram3.name = "����";
		saram3.age = 24;
		saram3.gender = "����";
		// ��ü�� ���� ���� �־���

		saram1.title();
		saram2.title();
		saram3.title();
		// title �޼ҵ� ȣ��
	}

}
