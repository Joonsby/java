package com.lymin.condition;

public class IfElseIfElseTest {
	public static void main(String[] args) {
		int jungSuAge = 4;

		if (jungSuAge > 5) {
			System.out.println("jungSuAge is > 5");
		} else if (jungSuAge == 4) {
			System.out.println("jungSuAge is 4");
		} else { // 위의두 조건을 제외한 모든 경우를 처리 합니다.
			System.out.println("jungSuAge is <= 5");
		}
	}

}
