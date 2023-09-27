package com.lymin.operator;

public class OperatorPriorityTest {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		int z = 3;
		
		int result = x + y * z; // 곱하기 연산을 먼저 합니다.
		System.out.println("result value is "+ result);
		
		int result2 = (x + y) * z; // 더하기를 먼저 하고 싶으면 괄호()를 사용합니다.
		System.out.println("result2 value is "+ result2);
		
		int result3 = x + (y * z); //꼭 괄호를 해주는 것이 좋습니다.
		System.out.println("result3 value is "+ result3);

	}

}
