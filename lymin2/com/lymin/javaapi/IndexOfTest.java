package com.lymin.javaapi;

public class IndexOfTest {
	public static void main(String[] args) {
		String word = "korea fighting!";

		int indicator = word.indexOf("fighting");
		System.out.println("indicator value is " + indicator);

		if (word.indexOf("korea") != -1) { // index�� 0 ���� ���� �Ѵ�. -1�� ���� ���� �� ���� �Ѵ�.
			System.out.println("Find OK");
		} else {
			System.out.println("Not Find");
		}

	}

}
