package com.lymin.classes;

public class SmartPhone {
	String phoneName = "none";
	
//	public SmartPhone() {
//	super();
//	// TODO Auto-generated constructor stub
//	phoneName = "myPhone";
//	System.out.println("SmartPhone Constructor is call "
//			+ "phoneName value is "+phoneName);
//}
	
//	public SmartPhone(String name) { // �Ű� ������ String�� �� ���� �ɴϴ�.
//		phoneName = name; // �� String���� �ʵ忡 �ֽ��ϴ�.
//		
//		System.out.println("SmartPhone Constructor is call "
//		+ "phoneName value is "+phoneName); // ����մϴ�.
//	}


	public SmartPhone(String phoneName) { //�̸��� phoneName �̷� ������, �ʵ���� �ƴ϶� �޾ƿ��� ���Դϴ�. 
		super(); // ���� class ��Ī
		this.phoneName = phoneName; // �޾ƿ� ���� �ʵ��� ���� �����ϱ� ���Ͽ� this�� �־��־����ϴ�.
		
		// �Ʒ����� ���� �Է��մϴ�.
		System.out.println("SmartPhone Auto Constructor is call "
		+ "phoneName value is "+phoneName); // ����մϴ�.
	}

}
