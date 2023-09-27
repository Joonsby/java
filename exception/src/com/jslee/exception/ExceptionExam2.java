package com.jslee.exception;

public class ExceptionExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int)(Math.random()*3)+1;
		System.out.println("난수 = " + i);
		if(i == 3) {
			try {
				throw new Exception(); // 강제로 예외를 발생 시킨다.
			} catch (Exception e) {
				System.out.println(e + "=> 발생");
			}
		} else {
			System.out.println("올바른 숫자입니다.");
		}
		System.out.println("**end**");
	}

}
