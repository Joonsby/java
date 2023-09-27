package com.lymin.condition;

import java.util.Scanner;

public class GoldenBellTest {
	public static void main(String[] args) {
		System.out.println("If else Test ");
		Scanner scanner = new Scanner(System.in);

		int firstAnswer = 0;
		int secAnswer = 0;
		
		int ok_count = 0;

		System.out.println("");
		System.out.println("도전 골든벨에 오신것을 환영합니다.");
		System.out.println("");
		System.out.println("미국으로 자유의 여신상을 보낸 사람은 누구일까요?");
		System.out.println("1. 에펠");
		System.out.println("2. 엥겔스");
		System.out.println("3. 보드리야르");
		firstAnswer = scanner.nextInt();

		System.out.println("");
		if (firstAnswer == 1) {
			System.out.println("(1.에펠) 정답입니다.");
			ok_count++;
		} else {
			System.out.println("틀렸어요.");
		}

		System.out.println("");
		System.out.println("영화 닥터 스트레인지2에서 스트레인지 조력자 크리스틴역의 배우는 누구인가요?");
		System.out.println("1. 레이첼 와이즈");
		System.out.println("2. 레이첼 맥아담스");
		System.out.println("3. 엘리자베스 올슨");
		secAnswer = scanner.nextInt();

		if (secAnswer == 2) {
			System.out.println("2. 레이첼 맥아담스) 정답입니다.");
			ok_count++;
		} else {
			System.out.println("틀렸어요.");
		}
		System.out.println("");
		System.out.println("모두 "+ ok_count + "문제 맞추셨어요.");
		System.out.println("");
		System.out.println("골든벨이 종료되었어요.");
	}
}
