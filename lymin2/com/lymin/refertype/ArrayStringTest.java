package com.lymin.refertype;

public class ArrayStringTest {
	public static void main(String[] args) {
		String[] names = { "철수", "영희", "길동" }; 

		System.out.println("names[0] value is " + names[0]);
		System.out.println("names[1] value is " + names[1]);
		System.out.println("names[2] value is " + names[2]);

		System.out.println("names.length value is " + names.length); // 배열의 길이(개수)를 가져 옵니다.
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}

	}

}
