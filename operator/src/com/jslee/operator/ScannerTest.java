package com.jslee.operator;

import java.util.Scanner; // Scanner�� import �ؿ´�.

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // Scanner�� �������ش�
		int x = in.nextInt(); // ����ڰ� �Է��� (����)���� �޾ƿ´�.
		System.out.println("x = " + x);
		if(x % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}		
		
	}

}
