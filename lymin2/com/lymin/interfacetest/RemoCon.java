package com.lymin.interfacetest;

public interface RemoCon {
	// 상수
	public static final int UID = 100; 
	public int PRODUCT_ID = 1; // static final 생략가능.
	
	//abtract method (추상)
	void setOn(); // (abtract 생략됨)
	abstract void setOff(); // abstract 생략하지 않음.
	
	//default method (기본)
	default void setInfoMenu() {
		System.out.println("show Info Menu");
	}
	
	//static method (정적)
	static void alertError() {
		System.out.println("Error CODE:0001");
	}

}
