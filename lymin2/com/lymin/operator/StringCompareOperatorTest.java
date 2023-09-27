package com.lymin.operator;

public class StringCompareOperatorTest {
	public static void main(String[] args) {
		String name01 = "홍길동";
		String name02 = "홍길동";
		String name03 = new String("홍길동"); // 다른 주소 번지수 참조. // 델리게이션 된 객체.

		System.out.println(name01 == name02);
		System.out.println(name01 == name03);
		System.out.println(name02 == name03);
		
		System.out.println("-----------------------------");
		
		System.out.println(name01.equals(name02));
		System.out.println(name01.equals(name03));
		System.out.println(name02.equals(name03));

	}

}
