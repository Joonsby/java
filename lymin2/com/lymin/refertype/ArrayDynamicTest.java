package com.lymin.refertype;

public class ArrayDynamicTest {
	public static void main(String[] args) {

		// 사용할 개수를 정의 하고, 해당 값을 넣을 수 있습니다.
		String[] names = null;
		names = new String[5];

		names[0] = "민수";
		names[1] = "칠수";
		names[2] = "만수";
		names[3] = "갑수";
		names[4] = "현수";

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}

	}

}
