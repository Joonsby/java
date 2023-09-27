package com.lymin.condition;

public class ForContinue02Test {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			if (i % 2 != 0) { // 나머지가 있다. 2로 나눈뒤에 나머지 값이 0 이 아니라 값이 존재.
				continue; // 여기서 아래로 이동하지 않고 다시 조건문을 타게 됩니다.
			}
			
			if (i != 0) { // 0은 짝수가 아닙니다.
				System.out.println(i); // 짝수를 출력합니다.
			}

		}
	}

}
