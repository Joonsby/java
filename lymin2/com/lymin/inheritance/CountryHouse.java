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
		System.out.println("CountrySleep is Sweet"); // ó������ �߰�...
		super.sleep(); // ���� Method�� ȣ�⵵ ����.
	}
	
}
