package com.lymin.refertype;

public class ArrayStringTest {
	public static void main(String[] args) {
		String[] names = { "ö��", "����", "�浿" }; 

		System.out.println("names[0] value is " + names[0]);
		System.out.println("names[1] value is " + names[1]);
		System.out.println("names[2] value is " + names[2]);

		System.out.println("names.length value is " + names.length); // �迭�� ����(����)�� ���� �ɴϴ�.
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}

	}

}
