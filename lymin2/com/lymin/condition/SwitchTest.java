package com.lymin.condition;

public class SwitchTest {
	public static void main(String[] args) {

		double randNum =  Math.random();
		System.out.println("randNum value is "+randNum);
		
		int divediceNumber = (int) (randNum * 10 + 1); // random은 0.0~ 0.99999 출력.. 10을 곱하고 +1을 해주면.. 원하는 값을 낼 수 0이 나오면 안되므로.. +1을 해준다.

		switch (divediceNumber) {
		case 1:
			System.out.println("divediceNumber is 1");
			break;
		case 2:
			System.out.println("divediceNumber is 2");
			break;
		case 3:
			System.out.println("divediceNumber is 3");
			break;
		case 4:
			System.out.println("divediceNumber is 4");
			break;
		case 5:
			System.out.println("divediceNumber is 5");
			break;
		default:
			System.out.println("divediceNumber is 6~10");
			break;
		}

	}

}
