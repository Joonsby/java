package com.lymin.javaapi;

public class IndexOfTest {
	public static void main(String[] args) {
		String word = "korea fighting!";

		int indicator = word.indexOf("fighting");
		System.out.println("indicator value is " + indicator);

		if (word.indexOf("korea") != -1) { // index는 0 부터 시작 한다. -1은 값이 없을 때 리턴 한다.
			System.out.println("Find OK");
		} else {
			System.out.println("Not Find");
		}

	}

}
