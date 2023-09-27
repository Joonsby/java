package com.lymin.javaapi;

import java.util.Calendar;

public class CalenderTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		System.out.println(calendar.get(Calendar.YEAR) + "년");
		System.out.println(calendar.get(Calendar.MONTH) + 1 + "월"); // 0부터 시작 되므로...
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "일");

		System.out.println("-----------------------------------");
		if (calendar.get(Calendar.AM_PM) == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}

		System.out.println(calendar.get(Calendar.HOUR) + "시");
		System.out.println(calendar.get(Calendar.MINUTE) + "분");
		System.out.println(calendar.get(Calendar.SECOND) + "초");
	}

}
