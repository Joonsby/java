package com.lymin.javaapi;

import java.util.Calendar;

public class CalenderTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		System.out.println(calendar.get(Calendar.YEAR) + "��");
		System.out.println(calendar.get(Calendar.MONTH) + 1 + "��"); // 0���� ���� �ǹǷ�...
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "��");

		System.out.println("-----------------------------------");
		if (calendar.get(Calendar.AM_PM) == Calendar.AM) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}

		System.out.println(calendar.get(Calendar.HOUR) + "��");
		System.out.println(calendar.get(Calendar.MINUTE) + "��");
		System.out.println(calendar.get(Calendar.SECOND) + "��");
	}

}