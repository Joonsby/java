package com.jslee.collection;
import java.util.ArrayList;

public class Collection04 {
	// 1-45 사이의 숫자중에 6개를 추출해서 출력 -> 오름차순 정렬
	// 6개의 숫자는 서로 중복되지 않는다.
	// ArrayList 클래스를 상속받아 사용.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> random = new ArrayList<Integer>(45);
		for (int i = 1; i < 46; i++) {
			random.add(i);
		}
		for(int i = 1; i < 7; i++) {			
		    double dValue = Math.random();
		    int iValue = (int)(dValue * 45 + 1);
		    System.out.println(iValue);
		}
		System.out.println(random);
	}
}
