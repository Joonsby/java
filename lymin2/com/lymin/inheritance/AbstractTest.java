package com.lymin.inheritance;

public class AbstractTest {
	public static void main(String[] args) {
//		SmartPhone smartPhone = new SmartPhone("myPhone");
		
		LgPhone lgPhone = new LgPhone("WING");
		lgPhone.powerOn(); // abstract method ȣ��
		lgPhone.quckPowerOff();
		lgPhone.powerOff(); // abstract method ȣ��
		lgPhone.bootingLogo(); // ���� �߰��� abstract �޼ҵ带 ������ �Ͽ� ȣ����.
		
		System.out.println("----------------------");
		SamSungPhone samSungPhone = new SamSungPhone("Galaxy21");
		samSungPhone.powerOn();
		samSungPhone.quckPowerOn();
		samSungPhone.powerOff();
		samSungPhone.bootingLogo();
		
	}

}
