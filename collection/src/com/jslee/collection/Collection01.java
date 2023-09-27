package com.jslee.collection;

import java.util.ArrayList;

public class Collection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력 -> 작업 -> 결과
		int i;
		int [] arr = new int[10]; // 0~9번까지의 배열이 생성되었다.
		// arr = 123; 배열의 위치가 지정이 되지 않았기 때문에 이런식으로는 값을 대입할 수 없다.
		ArrayList<Integer> arrlist = new ArrayList<Integer>(20); // ()안에 들어간 숫자는 갯수를 의미한다.
		// arrlist[0] = 456; []를 지정하지 않았기 때문에 이런식으로는 위치를 지정할 수 없다.
		// 컬렉션을 이용하면 가변적으로 배열의 갯수를 조절할 수 있다.
		// 컬렉션은 클래스이기 때문에 객체형태로 지정해야된다.
		// ArrayList 객체 생성 <> 안에 데이터 타입을 집어 넣는다.
		// boxing을 통해서 <>안에는 객체 형태의 데이터 타입을 집어 넣어야 한다. ex) String, Double, Integer
		
		arrlist.add(12); // 첫번째
		arrlist.add(34); // 두번째
		arrlist.add(56); // 세번째
		
		int firstArr = arrlist.get(0); // autoboxing에 의해서 객체형태로 변수선언을 하지 않아도 get을 할 수있다.
		int secondArr = arrlist.get(1);
		int thirdArr = arrlist.get(2);
		
		for (int j = 0; j < 3; j++) {
			System.out.println(arrlist.get(j));
		}
		
		// System.out.println(firstArr);
		// System.out.println(secondArr);
		// System.out.println(thirdArr);
		
		// api를 보면 add는 오버로딩이기 때문에 매개변수 안에 아무것도 안들어갈 수 없다.
		// ex) add(E e), add(int index, E element)
	}

}
