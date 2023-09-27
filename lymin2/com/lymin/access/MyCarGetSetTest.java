package com.lymin.access;

public class MyCarGetSetTest {
	public static void main(String[] args) {
		MyCar myCar = new MyCar();
		myCar.setSpeed(10); // setter 메소드로 접근하여 값 변경
		
		System.out.println("myCar.getSpeed value is ["+myCar.getSpeed()+"]"); // getter 메소드를 접근하여 값가져옴.
	}
	
}
