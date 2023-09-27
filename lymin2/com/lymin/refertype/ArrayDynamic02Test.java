package com.lymin.refertype;

public class ArrayDynamic02Test {
	public static void main(String[] args) {

		String[] names = new String[5]; // 이와 같은 형태로 사용을 많이 합니다.

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
