package com.jslee.classes;

class ObjectOne { // ObjectOne class ����
	int a; // ���� a ����
	ObjectOne(){ // Class�� ������ �̸��� ������
		
	}
}

public class ObjectInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectOne[] obj = new ObjectOne[5]; // ������ 5���� [��ü �迭]�� ���� -> ��ü�� ��������� �ʾҴ�. new�� �迭 ������ new�̴�.
		ObjectOne obj1 = new ObjectOne(); // �Ϲ� ��ü�� ������ ���̴�.

//		System.out.println(obj[0].a); // �������� �ʴ� (��������� ����) ��ü�� ������ ȣ���� �Ұ����ϱ� ������ ������ ���.
		for (int i = 0; i < obj.length; i++) { // �迭�� ������ 5���̱� ������ obj.length�� 5��.
			System.out.print("������ : obj[" + i + "] = " + obj[i]);
			obj[i] = new ObjectOne(); // ��ü�� ������ ��
			// ()�� ������ ��ü�� ���� �Ǵ� ���̰� []�� ������ �迭�� ���� �Ǵ� ���̴�.
			System.out.println(", ������ : obj[" + i + "] = " + obj[i]);
			System.out.println(obj[0].a); // ��ü�� ������ �����̱� ������ ������ �߻����� �ʴ´�.
			// �ټ��� �ݺ� �ȴ�.
		}
		System.out.println();

		for (int i = 0; i < obj.length; i++) { // �迭�� ������ 5���̱� ������ obj.length�� 5��.
			System.out.println("������ : obj[" + i + "].a = " + obj[i].a);
			obj[i].a = i;
			System.out.println("������ : obj[" + i + "].a = " + obj[i].a);
		}
		System.out.println();
	}

}
