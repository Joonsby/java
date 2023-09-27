package com.lymin.javaapi;

public class SubStringTest {
	public static void main(String[] args) {
		String string = "01033334444";

		String lastNum4 = string.substring(7, 11); // 잘라낼 문자열의 시작 index, 끝날 index를 넣어 줍니다.
		System.out.println("휴대전화 뒷자리 4자리의 값은 [" + lastNum4 + "]" + "입니다.");

		String theOtherNum = string.substring(3); // index 3 이후 모두 자르기.
		System.out.println(theOtherNum);
	}

}
