package com.jslee.classes;

public class Accounts {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		String chulName = "ö��";
		String chulNo = "123456";
		long chulBalance = 1000;
		
		String youngName = "����";
		String youngNo = "654321";
		long youngBalance = 200;
		
		chulBalance -= 200;
		youngBalance += 100;
		
		System.out.println("ö���� ����");
		System.out.println(" ���¸��� : " + chulName);
		System.out.println(" ���¹�ȣ : " + chulNo);
		System.out.println(" �����ܰ� : " + chulBalance);
		
		System.out.println("������ ����");
		System.out.println(" ���¸��� : " + youngName);
		System.out.println(" ���¹�ȣ : " + youngNo);
		System.out.println(" �����ܰ� : " + youngBalance);
	}

}
