package com.lymin.condition;

public class RandomIfTest {
	public static void main(String[] args) {
		double randNum = Math.random();
		System.out.println("randNum value is " + randNum);

		int divediceNumber = (int) (randNum * 6 + 1); // random�� 0.0~ 0.99999 ���.. 6�� ���ϰ� +1�� ���ָ�.. ���ϴ� ���� �� �� 0�� ������
														// �ȵǹǷ�.. +1�� ���ش�.

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
