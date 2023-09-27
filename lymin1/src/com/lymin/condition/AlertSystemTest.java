package com.lymin.condition;

import java.util.Scanner;

public class AlertSystemTest {
	public static void main(String[] args) {
		System.out.println("While Ex Test ");
		Scanner scanner = new Scanner(System.in);
		
		boolean isRun = true;
		int selectKey = 0;
		while (isRun) {
			System.out.println("=======================================");
			System.out.println("현재 경비 시스템이 작동 중 입니다. ");
			System.out.println("원하는시는 동작을 선택 해 주세요. ");
			System.out.println("-----------------------");
			System.out.println("1. 시스템 작동 중지 ");
			System.out.println("2. 상태 유지 ");
			System.out.println("-----------------------");

			selectKey = scanner.nextInt();

			if (selectKey == 1) {
				isRun = false;
			} else if (selectKey == 2) {
				System.out.println("경비상태를 계속 유지 합니다. ");
			} else {
				System.out.println("알수 없는 번호[" + selectKey + "]입니다. 재입력 해 주세요. \n");
			}

		}

		System.out.println("경비 시스템이 종료 되었습니다.");
	}
}
