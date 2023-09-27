package com.lymin.condition;

public class IfTest {
	public static void main(String[] args) {
		int mathScore = 51;

		if (mathScore > 50) {
			System.out.println("mathScore is > 50");
		}

		if (mathScore == 51) {
			System.out.println("mathScore is 51");
		}

		if (mathScore > 80) // 가끔 코드의 줄을 줄인다고 이렇게 {}를 안쓰고 작업 하시는 분들이 있습니다. 절대로 이렇게 작성하시면 안됩니다.
			System.out.println("mathScore is > 80"); // {}를 사용하지 안으면, 이 한줄까지만 if 조건 실행 문 구간이다.
		System.out.println("main method is end"); // 위의 if 절과 전혀 상관이 없다.

	}

}
