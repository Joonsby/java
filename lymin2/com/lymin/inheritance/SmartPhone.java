package com.lymin.inheritance;

public abstract class SmartPhone {
	public String name;

	public SmartPhone(String name) {
		this.name = name;
	}

	public void powerOn() {
		System.out.println("SmartPhone Power On");
	}

	public void powerOff() {
		System.out.println("SmartPhone Power Off");
	}
	
	public abstract void bootingLogo(); // 스마트폰 업그래이드! 이 그능 무조건 넣어야 함!

}
