package com.lymin.condition;

public class IfElseTest {
	public static void main(String[] args) {
		int jungSuAge = 10;

		if (jungSuAge > 5) {
			System.out.println("jungSuAge is > 5");
		} else { // 위의 조건을 제외한 모든 경우를 처리 합니다. the others 입니다.
			System.out.println("jungSuAge is <= 5");
		}
	}

}
