package com.jslee.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in); // stdin이라는 새로운 Scanner 호출
		int i; // int 형태의 i 변수 선언
		double sum = 0.0, avg; // double 형태의 sum을 0.0으로 선언, avg 선언
		double dnum[] = new double[5]; // 이름이 dnum이고 길이가 5인 새로운 배열 선언 
		System.out.println("dnum 배열의 길이 : " + dnum.length); // dnum[]의 배열의 길이를 나타낸다.(5개)
		System.out.println("초기화 하지 않은 dnum[]의 값");
		for (i = 0; i < dnum.length; i++) {// 배열 안에 있는 번지에 double을 주면 안된다. 번지와 배열의 type은 아무런 상관관계가 없다.
			System.out.println(dnum[i] + " "); // 초기화하지 않은 dnum의 값을 0부터5까지 나타낸다. 값을 주지 않았기 때문에 0.0으로 나온다.
		}
		System.out.println(); // 문장을 한칸 내리기 위해 쓴 코드
		
		for( double num : dnum ) { // 배열을 이용할때만 사용할 수 있는 for문
			// 뒤에 나오는 것은 배열명(dnum) 배열명을 집어 넣으면 for문이 알아서 배열의 갯수만큼 반복을 한다.
			// 배열에만 최적화 되어 있는 for문의 구조를 자바에서 제공하는 것이다.
			// 배열이 double 형태기 때문에 동일한 형태인 double 형태의 변수를 사용한다.
			System.out.println(num + ";");
			// System.out.println(dnum + ";"); 이런식으로 출력을 하는 것은 불가능하다. 전체 배열을 그냥 출력한다는 개념은 존재하지 않기 때문이다.
		}
		
		for (i = 0; i < dnum.length; i++) {			
			System.out.print("dnum[" + i + "] 번째 데이터 입력 :"); // 0번부터 dnum의 길이인 4까지의 데이터를 입력하는 출력문
			dnum[i] = stdin.nextDouble(); // double형태의 데이터를 사용자로부터 입력 받는다.			
		}
		
		for (i = 0; i < dnum.length; i++) {
			sum = sum + dnum[i]; // dnum 배열의 값을 0부터  dnum의 길이인 4까지의 합계를 구하는 식 sum += dnum[i];으로도 표현이 가능하다.
			System.out.println("배열의 합은 " + sum + "입니다."); // dnum[i]의 합계인 sum을 출력한다.
			avg = sum/dnum.length; // 각각의 합계를 배열의 길이로 나눔으로써 평균을 구한다.
			System.out.println("배열 값의 평균은  " + avg + "입니다."); // dnum[i]를 drum.length의 값으로 나눈 평균 값을 출력한다.
		}
		
		//for (double x : dnum) { // 개선된 loop문, 위의 for문과 동일한 문장이다.
		//	x += dnum[i];
		//}
		
	}

}
