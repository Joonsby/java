package com.lymin.inheritance;

public class OverrideTest {
	public static void main(String[] args) {
		Apart apart = new Apart();
		apart.musicPlay();
		
		apart.rest(); // �ڽ� Ŭ�������� �����ǵ� �޼ҵ带 ȣ�� �մϴ�.
		
		System.out.println("-----------------------------");
		
		CountryHouse countryHouse = new CountryHouse();
		countryHouse.baseBallPlay();
		countryHouse.rest();
		countryHouse.sleep(); // �����ϼ����� ������ �� �޼ҵ��� ȣ��
		
	}
}
