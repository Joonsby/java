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
	
	public abstract void bootingLogo(); // ����Ʈ�� ���׷��̵�! �� �״� ������ �־�� ��!

}
