package com.lymin.inheritance;

public class CountryHouse extends House {
	public String name;

	void baseBallPlay() {
		System.out.println("baseBallPlay");
	}

	void rest() {
		System.out.println("rest is forest bathing");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		System.out.println("CountrySleep is Sweet"); // 처리내용 추가...
		super.sleep(); // 무모 Method의 호출도 가능.
	}
	
}
