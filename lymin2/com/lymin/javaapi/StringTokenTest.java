package com.lymin.javaapi;

import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		String string = "suji|minsu|sumi|haksun";

		StringTokenizer stringTokenizer = new StringTokenizer(string, "|");
		int cnt = stringTokenizer.countTokens();

		for (int i = 0; i < cnt; i++) {
			String result = stringTokenizer.nextToken();
			System.out.println(result);
		}
	}

}
