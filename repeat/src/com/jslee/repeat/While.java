package com.jslee.repeat;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(���ǽ�)
//		{
//		���๮��
//		}

//		break : �ݺ��� ���� ����
//		continue : �ݺ��� �ǳʶٱ�	

//		do{
//		���๮��;
//		} while (���ǽ�)

		Scanner sc = new Scanner(System.in);

		int l = 10;
		while (l < 20) {
			System.out.println("20���� �۾ƿ�");
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
		System.out.println("1~100 �հ�" + m);

		int i = 10;
		while (true) {
			System.out.println("���");
			i--;
			if (i < 5) {
				break; // �ݺ��� ����
			}
		}

		for (int j = 1; j <= 3; j++) {
			for (int k = 1; k <= 5; k++) {
//				if(k == 3) break; // k�� 3�� �Ǹ� k�� �ݺ����� ���� ���´�.
//				if(k == 3) continue; // k�� 3�� �Ǹ� �� ���常 �ǳʶٰ� �ݺ����� �����Ų��.
//				if(j == 2) break; // j�� 2�� �Ǹ� j�� �ݺ����� ���� ���´�.
				System.out.print(j + "\t");
			}
			System.out.print("\n");
		}
		System.out.print("END");
	}

}
