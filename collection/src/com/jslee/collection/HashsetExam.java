package com.jslee.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashsetExam extends HashSet<String>{ // HashSet Collection을 생성하지 않고 HashSet 부모 클래스를 상속 받았다.

//	HashSet<String> hash = new HashSet<String>(); // HashSet Collection 생성 HashSet은 중복된 값을 가질 수 없다.

	public void addset() { // return값이 없는 addset method 생성
		/*super.*/add("java"); // hash에 "java"를 추가한다. 앞에 super는 생략 가능하다.
//		hash.add("java"); // hash에 "java"를 추가한다 .
		
		/*super.*/add("hello"); // hash에 "hello"를 추가한다. 앞에 super는 생략 가능하다.
//		hash.add("hello"); // hash에 "hello"를 추가한다. 
		
		/*super.*/add("hoho"); // hash에 "hoho"를 추가한다. 앞에 super는 생략 가능하다.
//		hash.add("hoho"); // hash에 "hoho"를 추가한다	.
//		hash.add("hoho"); // hash에 "hoho"를 추가한다 중복되면 값을 하나만 가진다.
		
		/*super.*/add("huhu"); // hash에 "huhu"를 추가한다. 앞에 super는 생략 가능하다.
//		hash.add("huhu"); // hash에 "huhu"를 추가한다.
		
		/*super.*/add("Green"); // hash에 "Green"를 추가한다. 앞에 super는 생략 가능하다.
//		hash.add("Green"); // hash에 "Green"를 추가한다.
		
		/*super.*/add("zzang"); // hash에 "zzang"를 추가한다. 앞에 super는 생략 가능하다.
//		hash.add("zzang"); // hash에 "zzang"를 추가한다.
	}

	public void printset() { // return값이 없는 printset method 생성
		Iterator<String> it = /*hash./super.*/iterator(); // Iterator Collection 생성
		while (it.hasNext()) { // it에 읽어올 다음 요소가 없을때까지 while문 실행
			String name = it.next(); // it.next의 다음데이터를 반환한 값을 String name에 저장
			System.out.println(name + "\t"); // name에 저장된 값을 출력
		}
		System.out.println("\n===============");
		TreeSet<String> tree = new TreeSet<String>(/*hash*/this); // TreeSet Collection 생성 / 나의 객체를 가져왔기 때문에 this를 입력해야 한다.
		Iterator<String> it2 = tree.iterator(); // Iterator Collection 생성
		while (it2.hasNext()) { // it2에 읽어올 다음 요소가 없을때까지 while문 실행
			String name = it2.next(); // it2.next의 다음데이터를 반환한 값을 String name에 저장
			System.out.println(name + "\t"); // name에 저장된 값을 출력
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashsetExam ha = new HashsetExam(); // HashsetExam 클래스에 대한 객체를 생성
		ha.addset(); // HashsetExam 클래스 안에 있는 addset 메소드 호출
		ha.printset(); // HashsetExam 클래스 안에 있는  printset 메소드 호출
	}

}
