package com.lymin.exception;

public class CustomCalcul {

	public void comapareXY(int x, int y) throws CustomException { // ���� ���ѱ�ϴ�.

		if (x + y > 10) {
			throw new CustomException("x+y > 10"); // ���ܸ� ���Ӱ� �߻� ��ŵ�ϴ�.
		} else {
			System.out.println("----------Noting-----------");
		}

	}

}
