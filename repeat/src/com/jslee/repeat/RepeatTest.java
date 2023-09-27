package com.jslee.repeat;

import java.util.Scanner;

public class RepeatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 5~87까지 합을 구하는 프로그램을 작성
		int num = 0;
		for (int i = 5; i <= 87; i++) {
			num = num + i;
		}
		System.out.println("1번 문제의 정답은 " + num + "입니다.");

		// 2. 1~100수 중에서 2의 배수이면서 7의 배수인 숫자를 출력하고
		// 그 출력된 숫자들의 합을 구하는 프로그램을 작성해본다.

		int num2 = 0;
		for (int i = 0; i <= 100; i += 14) {
			num2 = num2 + i;
		}

		System.out.println("2번 문제의 정답은 " + num2 + "입니다.");

		// 3. 1~10까지를 곱해서 그 결과를 출력하는 프로그램 작성

		int num3 = 1;
		for (int i = 1; i <= 10; i++) {
			num3 = num3 * i;
		}
		System.out.println("3번 문제의 정답은 " + num3 + "입니다.");

		// 4. 두개의 숫자를 입력받아 두 수 사이의 숫자 합계를 구한다.

		Scanner scanner = new Scanner(System.in);

//		System.out.println("첫번째 숫자를 입력해주세요");
//		int inputNumber1 = scanner.nextInt();
//
//		System.out.println("두번째 숫자를 입력해주세요");
//		int inputNumber2 = scanner.nextInt();
//
//		int j = 0;
//		for (int i = inputNumber1; i <= inputNumber2; i++) {
//			j = j + i;
//		}
//		System.out.println(j);

		// 5. 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해나간다.
		// 그리고 그합이 언제 1000을 넘어서는지 1000을 넘어선 값은 얼마나 되는지 계산하여
		// 출력하는 프로그램을 작성.

		// 6. 두개의 숫자를 입력받는다.
		// 예를 들어 3, 5를 입력받게 되면 3 , 4 , 5 단 출력
		// 단, 음수를 입력하거나 또는 5, 3 입력이 되거나 1~9 숫자범위를 넘어가면 출력 X, 다시 입력받기

		System.out.println("첫번째 구구단 숫자를 입력해주세요."); // 첫번째 구구단 숫자 문구
		int multiNum1 = scanner.nextInt(); // 첫번째 구구단 숫자 Scanner
		
//		while(true) {
//			
//		}

		System.out.println("두번째 구구단 숫자를 입력해주세요"); // 두번째 구구단 숫자 문구 
		int multiNum2 = scanner.nextInt(); // 두번째 구구단 숫자 Scanner

		for (int i = multiNum1; i <= multiNum2; i++) {
			for (int k = 1; k <= 9; k++) {
				System.out.println(multiNum1 + "*" + k + " = " + multiNum1 * k);
			}
			multiNum1++;
		}

		// 7. 숫자를 입력 받는다.
		// 입력받은 숫자가 0이 될때까지 입력된 모든 숫자들의 합계를 구한다.

		// 입력 : 5
		// 입력 : 9
		// 입력 : 0 => 14
		
//		System.out.println("숫자를 입력해주세요");
//		int num5 = scanner.nextInt();
//		int sum = 0;
//		
//		while(num != 0) {
//			System.out.println("숫자를 입력해주세요");
//			sum = sum + num5;
//			num5 = scanner.nextInt();
//		}
	}
}