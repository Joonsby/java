package com.jslee.array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사이즈가 7인 정수형 배열 생성
		// 	     생성된 배열의 값을 입력(Scanner)
		//    최대값, 최소값 출력
		
		int arr[] = new int[7]; // 사이즈가 7인 정수형 배열을 생성 했다.		
		Scanner scanner = new Scanner(System.in); // 이름이 scanner인 scanner를 호출하였다.
		//int max,min = 0; 이런식으로 선언한 경우에는 min에만 0으로 초기화가 되고 max는 단순히 선언만 된 상태이다. 
						 
//		int max = 0, min = 0; // max와 min에 각각 0을 대입해 초기회 시켰다.
//		
//		for (int i = 0; i < arr.length; i++) {			
//			min = arr[0]; // for문 안에서의 min 변수에 배열의 초기값을 설정했다.
//			max = arr[0]; // for문 안에서의 max 변수에 배열의 초기값을 설정했다.
//			System.out.print("배열의 값을 입력 하세요 : "); // 배열의 값을 사용자로부터 받기 위한 출력문
//			arr[i] = scanner.nextInt(); // 사용자로부터 배열에 집어 넣을 값을 int형태로 받기 위한 문장
//			if(min > arr[i]) { // 사용자로부터 받은 배열의 값이 i번째 값보다 크다면 min값을 i번째 배열로 바꿈으로써 최솟값으로 만든다
//				min = arr[i];
//			}
//			if(max < arr[i]) { // 사용자로부터 받은 배열의 값이 i번째 값보다 작다면 max값을 i번째 배열로 바꿈으로써 최대값으로 만든다
//				max = arr[i];
//			}
//		}
//		System.out.println("최대값은 " + max + "입니다.");
//		System.out.println("최솟값은 " + min + "입니다.");

		
		
		// 2. 배열의 사이즈를 입력 받기
		// 생성된 배열의 값을 입력(Scanner) -> 배열 값들의 합계, 평균
		
//		System.out.println("배열의 갯수를 입력해주세요.");
//		int size = scanner.nextInt(); // 배열의 사이즈를 사용자로부터 받는다.
//		int arr2[] = new int[size]; // 두번째 배열의 새로운 선언
//		int sum = 0, avg = 0;	 // 합계(sum)와 평균(avg)의 초기값(0) 설정
//
//		
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println("배열 값을 입력하세요."); // 배열 값을 입력하라는 문구 출력
//			arr2[i] = scanner.nextInt(); // 배열의 값을 사용자로부터 받아온다.
//			System.out.println(i + "번째 배열의 값은" + arr2[i] + "입니다.");
//			// 사용자가 입력한 배열값을 출력
//		}
//		
//		for (int i = 0; i < arr2.length; i++) {
//			sum += arr2[i]; // 사용자가 입력한 배열들의 합계 변수 선언
//			avg = sum / arr2.length; // 합계를 배열의 갯수로 나누어 평균을 구하는 변수 선언
//		}
//		System.out.println("배열의 합은 " + sum + "입니다."); // 배열들의 합계를 출력
//		System.out.println("배열의 평균은 " + avg + "입니다."); // 배열들의 평균을 출력 
		

		
		// 3. int inum[] = {8, 7, 3, 6, 9, 6, 8, 7, 0, 4, 1, 2};
		// 숫자 입력 -> 입력받은 값과 일치하는 값이 배열에 존재한다면
		//           값의 위치를 출력 ..
		//           일치하는 값이 없는 경우 -> 값이 없음 출력
		
		int inum[] = {8,7,3,6,9,6,8,7,0,4,1,2}; // 배열 선언
		System.out.print("숫자를 입력해주세요."); // 사용자에게 숫자를 입력하라는 문구 출력
		int num = scanner.nextInt(); // 사용자로부터 int값을 받는다
		boolean check = false; // 값 없음을 출력 받기 위해 만든 flag 변수 
		// 플래그(flag)란 깃발이라는 뜻인데, 컴퓨터에서 무언가를 기억하거나 또는 다른 프로그램에게 약속된 신호를 남기기 위한 용도로 프로그램에 사용되는 미리 정의된 비트이다.
		System.out.println("입력한 숫자는 \"" + num + "\"입니다."); // 입력한 숫자를 확인하기 위한 출력문
		
		for (int i = 0; i < inum.length; i++) { // for문을 통하여 if문을 12번 반복 시킨다.
//		for (int i : inum) { 배열을 이용할때만 사용하는 for문 사용
//			if(num == i){
//			
//			}
//		}			
			if(num == inum[i]) { // 사용자가 입력한 int 값이 i번째 배열과 일치할때의 조건문
				System.out.println("입력받은 숫자는 " + i + "번째 배열에 포합됩니다."); // 사용자로부터 입력받은 int값이 i번째 배열에 포함된다는 문구를 출력
			} else { 
				check = true; // 값이 없음을 출력하기 위한 문구를 만들기 위한 flag 변수를 true로 만든다.
			}			
		}
		if(check) {
			System.out.println("값이 없음"); // flag변수가 true가 되면 값이 없음이 출력된다.
		}

		
		// 3번 문제 풀이
		/*
		int num1 = scanner.nextInt(); // 사용자로부터 값을 입력 받는다.
		int sw = 1; // 값이 없는 상황을 만들기 위해 선언한 flag 변수
		
		// 배열이 0번부터 11번까지이기 때문에 if문이 12개가 필요하다.
		if (num1 == inum[0]) { // 0번째 배열
			
		} else if(in == inum[1]) { // 1번째 배열
			
		}... else if(in == inum[11]){
			
		}
		
		// 따라서 for문을 통해서 0부터 12까지의 배열의 if문을 12번 반복시킨다. 		
		for (int i = 0; i < inum.length; i++){
		
		for (int i : inum) { // 배열을 이용할때만 사용하는 for문 사용
			if(in == i) // 위와 같은 for문을 사용하면 if문 안에 in == i를 기입한다.
			
			if(in == inum[i]){ // 배열의 i번째와 사용자가 입력한 값이 일치하는지 확인한다.
				System.out.println(i); i는 배열의 순서이기 때문에 배열의 순서인 i를 출력한다.
			} else{
				System.out.println("값 없음");(X) // 반복문 안에 이 문구를 넣게 되면 계속해서 같은 문구가 반복이 된기 때문에 안에 넣으면 안된다.
			} else{
				sw = 2; // 똑같은 것을 못만난 상황 flag 변수
			}			
		}
		
		if(sw == 2){
			System.out.println("값 없음"); // 이렇게 출력하면 값이 없을때 값 없음이 출력된다.
		}
		
		for(int i : inum){
			if(
		}
		
		*/
	}
	

	


}
