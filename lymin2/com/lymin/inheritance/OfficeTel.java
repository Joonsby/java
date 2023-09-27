package com.lymin.inheritance;

public class OfficeTel extends House {
	public String name;

	void work() {
		System.out.println("working");
	}

	void eat() {
		super.rest(); // 부모 Method를 호출 합니다.
		System.out.println("eating");
	}
}
