package com.jslee.repeat;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(조건식)
//		{
//		실행문장
//		}

//		break : 반복문 강제 종료
//		continue : 반복문 건너뛰기	

//		do{
//		실행문장;
//		} while (조건식)

		Scanner sc = new Scanner(System.in);

		int l = 10;
		while (l < 20) {
			System.out.println("20보다 작아요");
			l = sc.nextInt();
		}

		int h = 1;
		while (h <= 10) {
			System.out.println("h = " + h);
			h++;
		}

		int g = 1;
		int m = 0;
		while (g <= 100) {
			m = m + g;
			g++;
		}
		System.out.println("1~100 합계" + m);

		int i = 10;
		while (true) {
			System.out.println("출력");
			i--;
			if (i < 5) {
				break; // 반복문 종료
			}
		}

		for (int j = 1; j <= 3; j++) {
			for (int k = 1; k <= 5; k++) {
//				if(k == 3) break; // k가 3이 되면 k의 반복문을 빠져 나온다.
//				if(k == 3) continue; // k가 3이 되면 그 문장만 건너뛰고 반복문을 실행시킨다.
//				if(j == 2) break; // j가 2가 되면 j의 반복문을 빠져 나온다.
				System.out.print(j + "\t");
			}
			System.out.print("\n");
		}
		System.out.print("END");
	}

}
