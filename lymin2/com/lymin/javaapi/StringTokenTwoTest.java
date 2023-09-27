package com.lymin.javaapi;

import java.util.StringTokenizer;

public class StringTokenTwoTest {
	public static void main(String[] args) {

		String[] stringsArray = new String[4]; // 배열 선언 및 생성

		String string = "suji|minsu|sumi|haksun";

		StringTokenizer stringTokenizer = new StringTokenizer(string, "|");
		int cnt = stringTokenizer.countTokens();

		for (int i = 0; i < cnt; i++) {
			String result = stringTokenizer.nextToken();
			System.out.println(result);
			stringsArray[i] = result; // 배열에 파싱된 값을 넣는다.
		}

		for (int j = 0; j < stringsArray.length; j++) { // 배열에 값이 잘 들어 갔는지 확인
			System.out.println("-------Arrays Value is [" + stringsArray[j] + "]");
		}
	}

}
