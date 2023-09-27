package com.lymin.exception;

public class TryCatchFinallyTest {
	public static void main(String[] args) {
		try {
			String temp = "10";
//			String temp2 = "10ABC"; // 여기서 변수가 잘 못 들어간 것으로 추측.
			String temp2 = "100";

			int result = Integer.parseInt(temp);
			int result2 = Integer.parseInt(temp2); // 이 부분에서 발생!

			System.out.println("result value is " + result);
			System.out.println("result value is " + result2);

		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace(); // 어느 부분이 문제인지 확인 해야 합니다.
			System.out.println("------NumberFormatException---------");

		} finally {
			System.out.println("------------------finally------------");

		}

	}

}
