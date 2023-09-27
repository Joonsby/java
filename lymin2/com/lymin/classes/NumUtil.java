package com.lymin.classes;

public class NumUtil {

	static boolean isEvenOddCal(int num) {
		if (num % 2 == 0) { // Â¦¼ö
			return true;
		} else { // È¦¼ö
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
