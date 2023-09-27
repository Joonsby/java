package com.lymin.condition;

public class RandomIfTest {
	public static void main(String[] args) {
		double randNum = Math.random();
		System.out.println("randNum value is " + randNum);

		int divediceNumber = (int) (randNum * 6 + 1); // random은 0.0~ 0.99999 출력.. 6을 곱하고 +1을 해주면.. 원하는 값을 낼 수 0이 나오면
														// 안되므로.. +1을 해준다.

		if (divediceNumber == 1) {
			System.out.println("divediceNumber is 1");
		} else if (divediceNumber == 2) {
			System.out.println("divediceNumber is 2");
		} else if (divediceNumber == 3) {
			System.out.println("divediceNumber is 3");
		} else {
			System.out.println("divediceNumber is 4~6");
		}
	}
}
