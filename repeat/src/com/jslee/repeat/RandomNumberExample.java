package com.jslee.repeat;

import java.util.ArrayList;

// 1~45 범위에서 숫자 6개 추출 -> 정렬 출력
// 숫자들이 중복되지 않는다.

public class RandomNumberExample {

	public static void main(String[] args) {
		// int[] arr = new int[45]; 45개를 집어넣을 공간을 만들었다.
		// 공간은 6개를 만들어야 되기 때문에 45개의 공간을 만들 필요가 없다.

		ArrayList<Integer> ran = new ArrayList<Integer>(6); // 추출할 6개의 숫자를 추출할 공간을 6개 만든다.
		int repeatTime = 0; // 반복횟수를 나타내는 변수를 선언한다.
		// while(ran.size() != 6)
		while(repeatTime < 6) { // 반복 횟수가 6이 될때까지 반복시킨다.
			int randomNum = (int) (Math.random() * 45) + 1;
			// Math는 클래스이기 때문에 api에서 Math라는 클래스를 검색해야 된다.
			// 45개의 숫자 범위에서 추출해야 되기 때문에 *45를 해줘야 하고 0에서부터 시작하기 때문에 +1도 해줘야 한다.
			if (!ran.contains(randomNum)) { // randomNum이 ArrayList ran에 포함되지 않으면 randomNum을 추가하지 않는다. 
				ran.add(randomNum);// ran이라는 Arraylist에 randomNum을 add로 집어 넣는다.
				repeatTime++; // 반복횟수를 1씩 증가 시킨다.
			}
		}		
		System.out.println(ran);
	}
}
