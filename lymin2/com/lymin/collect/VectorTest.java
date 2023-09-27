package com.lymin.collect;

import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		List list = new Vector(); // 일반적인 사용

		list.add("철수");
		list.add("민수");
		list.add("칠수");

		for (int i = 0; i < list.size(); i++) {
			String temp = (String) list.get(i); // get 메소드를 통하여 인덱스로 불러오고 캐스팅 하여 임시 저장 합니다.
			System.out.println("Vector value is [" + temp + "]"); // 임시 저장한 값을 출력합니다.
		}
		System.out.println("------------------------------");

		List List02 = new Vector();
		List02.add(new Book("역사의 시작", "철수")); // Book 클래스를 생성해서 Vector에 넣습니다.
		List02.add(new Book("수학의 시작", "영희"));
		List02.add(new Book("철학의 개요", "수지"));

		for (int i = 0; i < List02.size(); i++) {
			Book book = (Book) List02.get(i); // get 메소드를 통하여 인덱스로 불러오고 캐스팅 하여 임시 저장 합니다.
			System.out.println("Book title value is [" + book.getTitle() + ":" + book.getWriter() + "]");
		}
		System.out.println("------------------------------");

		List02.remove(1); // 수학의 시작 삭제.
		for (int i = 0; i < List02.size(); i++) {
			Book book = (Book) List02.get(i); // get 메소드를 통하여 인덱스로 불러오고 캐스팅 하여 임시 저장 합니다.
			System.out.println("Book title value is [" + book.getTitle() + ":" + book.getWriter() + "]");
		}

	}

}
