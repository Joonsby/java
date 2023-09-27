package com.jslee.exception;

public class ExceptionExam {

	public static void main(String[] args) {
		try { // 예외 발생 -> try문 안에 있는 오류를 수정한다. / catch는 예외가 있을때만 반응한다.
			int[] arr = new int[5];
			arr[0] = 789;
			arr[4] = 123; // 배열 인덱스를 4로 수정
			String str = "가나다";
			int i = Integer.parseInt(str);
			System.out.println(arr[0] + "," + arr[4]); // 배열 인덱스를 4로 수정
		} catch (Exception e) { // 예외를 인식만 하는 부분 -> 예외를 수정하는 코드가 들어가는 것이다 아니라 try부분을 고쳐야 된다.
			System.out.println(e);
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
