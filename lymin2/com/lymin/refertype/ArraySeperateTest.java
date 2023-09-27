package com.lymin.refertype;

public class ArraySeperateTest {
	public static void main(String[] args) {
		// 배열에서 선언과 생성을 분리 합니다.

		// 아래와 같이 분리하면 편집기 error가 발생합니다.
//		String[] names;
//		names = { "철수", "영희", "길동" };

		// 선언과 생성의 분리는 new를 사용하여 줍니다.
		String[] names = null; // null로 초기화 해줍니다. MEM 이점이 있습니다.
		names = new String[] { "철수", "영희", "길동" };

		System.out.println("names[0] value is " + names[0]);
		System.out.println("names[1] value is " + names[1]);
		System.out.println("names[2] value is " + names[2]);

		System.out.println("names.length value is " + names.length); // 배열의 길이(개수)를 가져 옵니다.

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}

	}

}
