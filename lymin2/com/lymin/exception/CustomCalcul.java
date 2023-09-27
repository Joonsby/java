package com.lymin.exception;

public class CustomCalcul {

	public void comapareXY(int x, int y) throws CustomException { // 예외 떠넘깁니다.

		if (x + y > 10) {
			throw new CustomException("x+y > 10"); // 예외를 새롭게 발생 시킵니다.
		} else {
			System.out.println("----------Noting-----------");
		}

	}

}
