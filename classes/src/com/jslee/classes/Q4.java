package com.jslee.classes;

class Saram2 { // Saram2 Ŭ���� ����
	String name;
	int age;
	String gender;

	void title() { // Saram2 Ŭ���� �ȿ� title �޼ҵ� ����
		System.out.println("��� �̸� : " + name);
		System.out.println("��� ���� : " + age);
		System.out.println("��� ���� : " + gender);
		System.out.println("------------------");
	}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saram2[] saram1 = new Saram2[3]; // ������ 3���� ��ü�迭 ����
		
		for (int i = 0; i < saram1.length; i++) {
			saram1[i] = new Saram2(); // ������ �迭��  �޼ҵ� ȣ��
		}

		saram1[0].name = "ö��";
		saram1[0].age = 26;
		saram1[0].gender = "����";
		
		saram1[1].name = "����";
		saram1[1].age = 24;
		saram1[1].gender = "����";
		
		saram1[2].name = "����";
		saram1[2].age = 21;
		saram1[2].gender = "����";
		
		// ��ü�� ���� ���� �־���
		
		for (int i = 0; i < saram1.length; i++) {
			saram1[i].title(); // title �޼ҵ��� ��¹��� �ݺ� ���
		}
	}
	// 5�� ������ Ǯ�� ��ü �迭�� �̿��ϴ� ���� ���� ���̴�.
	// ó������ ��ü �迭�� ����Ϸ��� ����� �� ������ �� ���� �ڿ� ����ϴ� ���� ����.
}
