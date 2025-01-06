package com.jslee.operator;

import java.util.Scanner; // Scanner를 import 해온다.

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // Scanner을 생성해준다
		int x = in.nextInt(); // 사용자가 입력한 (정수)값을 받아온다.
		System.out.println("x = " + x);
		if(x % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}		
		
	}

}
