package com.lymin.classes;

public class Calculator {

	// �޼ҵ� Method : �Ʒ��� ���� ���·� ���� �Ѵ�.
	int plus(int x, int y) { // ���� ���� ������, �Ű������� 2��
		int result = 0;
		result = x + y;

		return result;
	}

	int minus(int x, int y) {
		int result = 0;
		result = x - y;

		return result;
	}

	String getName() { // ���� ���� String
		String result = "MyCalculor";

		return result;
	}

	boolean isBateryEmpty() { // ���� ���� boolean.
		return false;
	}

	void setFactoryInit() { // ���� ���� ����.
		System.out.println("---------Calculator is Factory Init----------");
	}

}
