package com.jslee.classes;

class Overloading1 {

	public void disp(int i, String str) {
		System.out.println("정수와 문자열 출력: " + i + " " + str);
	}

	public void disp(String str) {
		System.out.println("문자열 출력: " + str);
	}

	public void disp(int i, String str, double ken) {
		System.out.println("정수와 문자열, 실수 출력: " + i + " " + str + " " + ken);
	}
}

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading1 kkk = new Overloading1();
		kkk.disp(50, "자바 프로그래밍");
		kkk.disp(50, "자바프로그래밍", 20);
		kkk.disp("자바프로그래밍기초");
	}

}
