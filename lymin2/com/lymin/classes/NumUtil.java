package com.lymin.classes;

public class NumUtil {

	static boolean isEvenOddCal(int num) {
		if (num % 2 == 0) { // ¦��
			return true;
		} else { // Ȧ��
			return false;
		}
	}

	static boolean isTwoNumCompare(int x, int y) {
		if ((x - y) >= 0) {
			return true;
		} else {
			return false;
		}
	}

}
