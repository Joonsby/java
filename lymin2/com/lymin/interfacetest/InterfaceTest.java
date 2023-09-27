package com.lymin.interfacetest;

public class InterfaceTest {
	public static void main(String[] args) {
		RemoCon remoCon;
		remoCon = new Radio(); // �������̽��� �����ϰ�, ����� �������̽��� ��ü�� �����ؼ� �ֽ��ϴ�.
		// RemoCon remoCon = new Radio(); �� ���̼ŵ� �˴ϴ�.

		remoCon.setOn(); // �����ǵ� �޼ҵ��� ȣ��
		remoCon.setInfoMenu(); //�����ǵ� �޼ҵ��� ȣ��
		
		System.out.println("RemoCon.UID value is [" + RemoCon.UID + "]"); // static final(���) �ʵ� Ȯ��.
		System.out.println("RemoCon.PRODUCT_ID value is [" + RemoCon.PRODUCT_ID + "]"); // static final(���) �ʵ� Ȯ��.

		RemoCon.alertError(); // static method�� ȣ��.
		
		System.out.println("--------------------");
		
		RemoCon remoConTwo = new Tv();
		remoConTwo.setOn();
		remoConTwo.setOff();
		remoConTwo.setInfoMenu();
		
		RemoCon.alertError();
	}

}
