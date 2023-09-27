package com.lymin.exception;

public class TryCatchFinallyTest {
	public static void main(String[] args) {
		try {
			String temp = "10";
//			String temp2 = "10ABC"; // ���⼭ ������ �� �� �� ������ ����.
			String temp2 = "100";

			int result = Integer.parseInt(temp);
			int result2 = Integer.parseInt(temp2); // �� �κп��� �߻�!

			System.out.println("result value is " + result);
			System.out.println("result value is " + result2);

		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace(); // ��� �κ��� �������� Ȯ�� �ؾ� �մϴ�.
			System.out.println("------NumberFormatException---------");

		} finally {
			System.out.println("------------------finally------------");

		}

	}

}