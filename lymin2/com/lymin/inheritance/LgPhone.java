package com.lymin.inheritance;

public class LgPhone extends SmartPhone {

	public LgPhone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void quckPowerOff() { // LG���� �ű�� �Դϴ�.
		System.out.println("LG quick PowerOff");
	}

	@Override // ������(�������̵� �Դϴ�.
	public void bootingLogo() { 
		// TODO Auto-generated method stub
		System.out.println("LG Logo is Visible....");
				
	}

}
