package com.lymin.access;

public class MyCarGetSetTest {
	public static void main(String[] args) {
		MyCar myCar = new MyCar();
		myCar.setSpeed(10); // setter �޼ҵ�� �����Ͽ� �� ����
		
		System.out.println("myCar.getSpeed value is ["+myCar.getSpeed()+"]"); // getter �޼ҵ带 �����Ͽ� ��������.
	}
	
}
