package com.lymin.condition;

import java.io.IOException;

public class WhileKeyExitTest {
	public static void main(String[] args) throws Exception {
		boolean isRun = true;
		int keyCode = 0;

		while (isRun) { // true라면 계속 실행.
			keyCode = System.in.read(); // 키를 입력 받습니다.

			if (keyCode == 49) { // 숫자1의 키코드 입니다.
				isRun = false; // while 탈출.
			} else {
				System.out.println("keyCode value is " + keyCode);
			}
		}
		System.out.println("Program is End..");

	}

}
