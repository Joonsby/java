package com.jslee.method;

import java.util.Scanner;

public class OverloadingTest {
	int maxOf(int[] a) { // 첫번째 메소드 생성 매개변수에 받는 값이 배열이기 때문에 a라는 변수를 배열로 생성
		int max = a[0]; // 최대값을 설정하기 위해 max 초기값을 a 배열의 0번째로 설정
		for (int i = 0; i < a.length; i++) { // a의 숫자만큼 반복
			if(a[i]>max) { // a의 i번째 값이 max의 값보다 크다면 max 값을 a의 i번째 배열의 값으로 변경 
				max = a[i];
			}
		}
		return max;
	}
	
	// main은 시작하는것 말고는 거의 코드가 안 들어가는 것이 좋다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingTest ob = new OverloadingTest(); // class를 사용하기 위한 권한 허용
		Scanner stdln = new Scanner(System.in); // stdln Scanner 생성
		
		System.out.print("인원 수를 입력해주세요 : "); // 인원 수를 입력하는 출력문
		int person = stdln.nextInt(); // 사용자가 입력한 인원 수를 받기 위한 변수 person
		
		int[] height = new int[person]; // 사용자가 입력한 숫자를 배열의 갯수로 입력
		int[] weight = new int[person]; // 사용자가 입력한 숫자를 배열의 갯수로 입력
		
		System.out.println(person + "명의 신장과 체중을 입력하시오."); // 사용자가 입력한 인원수를 알려주기 위한 출력문
		for (int i = 0; i < person; i++) { // 사용자가 스캐너에 입력한 숫자만큼 for문 반복
			System.out.print((i + 1) + "번의 신장 : "); // i는 0부터 시작하기 때문에 +1을 해주고 i번째 사람의 신장을 입력하기 위한 출력문
			height[i] = stdln.nextInt(); // 사용자가 입력한 i번째 신장을 받기위한 배열
			System.out.print((i + 1) + "번의 체중 : "); // i는 0부터 시작하기 때문에 +1을 해주고 i번째 사람의 체중을 입력하기 위한 출력문
			weight[i] = stdln.nextInt(); // 사용자가 입력한 i번째 신장을 받기위한 배열
		}
		System.out.println("가장 키가 큰 사람의 신장 : " + ob.maxOf(height) + "cm"); // 사용자가 입력한 키의 최댓값을 method를 이용하여 출력 
		// 배열의 이름을 매개변수안에 기입하면 배열 전체를 데려갈 수 있다.
		System.out.println("가장 뚱뚱한 사람의 체중 : " + ob.maxOf(weight) + "kg"); // 사용자가 입력한 체중의 최댓값을 method를 이용하여 출력
		// System.out.println(height); 이런식으로는 배열 전체를 출력할 수 없다.
	}

}
