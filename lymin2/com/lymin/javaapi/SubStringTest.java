package com.lymin.javaapi;

public class SubStringTest {
	public static void main(String[] args) {
		String string = "01033334444";

		String lastNum4 = string.substring(7, 11); // �߶� ���ڿ��� ���� index, ���� index�� �־� �ݴϴ�.
		System.out.println("�޴���ȭ ���ڸ� 4�ڸ��� ���� [" + lastNum4 + "]" + "�Դϴ�.");

		String theOtherNum = string.substring(3); // index 3 ���� ��� �ڸ���.
		System.out.println(theOtherNum);
	}

}
