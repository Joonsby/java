package com.jslee.collection;

import java.util.ArrayList;

class ��������{
	String �̸�;
	int java,html,jsp;
	int ����;
	int ���;
}

public class Collection03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>(); // �÷����� ������ �ִ� ������ ��ü�� ���� �� �ִٴ� ���̴�.
		�������� �л�1 = new ��������();
		�л�1.�̸� = "ȫ�浿";
		�л�1.java = 100;
		
		�������� �л�2 = new ��������();
		�л�2.�̸� = "��ö��";
		�л�2.java = 90;
		ArrayList<��������> std = new ArrayList<��������>(5);
		std.add(�л�1);
		std.add(�л�2);
		
		// ~~~.sort
		std.remove(�л�1);
	}

}
