package com.lymin.javaapi;

import java.util.StringTokenizer;

public class StringTokenTwoTest {
	public static void main(String[] args) {

		String[] stringsArray = new String[4]; // �迭 ���� �� ����

		String string = "suji|minsu|sumi|haksun";

		StringTokenizer stringTokenizer = new StringTokenizer(string, "|");
		int cnt = stringTokenizer.countTokens();

		for (int i = 0; i < cnt; i++) {
			String result = stringTokenizer.nextToken();
			System.out.println(result);
			stringsArray[i] = result; // �迭�� �Ľ̵� ���� �ִ´�.
		}

		for (int j = 0; j < stringsArray.length; j++) { // �迭�� ���� �� ��� ������ Ȯ��
			System.out.println("-------Arrays Value is [" + stringsArray[j] + "]");
		}
	}

}
