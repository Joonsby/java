package com.lymin.javaapi;

import java.util.Arrays;
import java.util.Random;

public class LotteMachine {
	static boolean oneTimePlug = true; // 당첨번호 1회만 출력...
	static int[] winNumber = new int[6];

	public static void main(String[] args) {
		int getCount = 0;

		for (int i = 0; i < 100000000; i++) { // 1억번 함.
			getCount++;
			System.out.println("getCount value is " + getCount + "==================================");
//			if(LottoProcess()==false) {
			if (LottoProcess() == true) {// 매주 1회 1천원씩 구매..
				getCount++;
				System.out.println("getCount win value is " + getCount + "==================================");
				return;
			}
		}

	}

	public static boolean LottoProcess() {

		boolean winOk;

		int[] selectNumber = new int[6];
		Random random = new Random(); // 이렇게 void 형으로 들어가면, 현재시간을 종자값으로 해서 인자값을 뿌려준다. 이것을 많이 사용한다.
		System.out.println("선택 번호: ");

		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.println("selectNumber value is " + selectNumber[i]);
			for (int j = 0; j < i; j++) { // 중복수 제거 로직
				if (selectNumber[i] == selectNumber[j]) {
					i--;
				}
			}
		}

		System.out.println("담첨번호: ");

		if (oneTimePlug) {
//			int[] winNumber = new int[6];
			Random random02 = new Random();
			for (int j = 0; j < 6; j++) {
				winNumber[j] = random02.nextInt(45) + 1;
				for (int k = 0; k < j; k++) { // 중복수 제거 로직
					if (winNumber[j] == winNumber[k]) {
						j--;
					}
				}
				System.out.println("winNumber value is " + winNumber[j]);
			}
			oneTimePlug = false;
		} else {
			for (int j = 0; j < 6; j++) {
				System.out.println("winNumber value is " + winNumber[j]);
			}
		}

		// 당첨 여부
		// 비교하기 전에 array는 sort를 먼저한다.

		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);

		boolean result = Arrays.equals(selectNumber, winNumber);

		if (result == true) {
			System.out.println("1등 담첨 OK");
			winOk = true;
		} else {
			System.out.println("다음 기회에....꽝");
			winOk = false;
		}

		return winOk;
	}

}
