package com.jslee.database_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {	
	Scanner sc = new Scanner(System.in);
	String name;
	int java,web;	
	
	void input(){
		DataControl dataControl = new DataControl(); // DataControl ��ü ����
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.next();
		System.out.println("java ������ �Է��ϼ���");
		java = sc.nextInt();
		System.out.println("web ������ �Է��ϼ���");
		web = sc.nextInt();
		// DataControl���� name,java,web�� ���� ȣ��� ���ÿ� ������.
		dataControl.input(name,java,web);		
		System.out.println("[" + name + "]�л��� ������ �ԷµǾ����ϴ�.");
	}
	
	void println() {
		DataControl dataControl = new DataControl();
		ArrayList<UserInfo> student = dataControl.printAll();		
		for (int i = 0; i < student.size(); i++) {
			System.out.println((i + 1) + "��° �л��� �����Դϴ�.");
			System.out.println("�̸��� " + "[" + student.get(i).getName() + "]�Դϴ�.");
			System.out.println("java ������ " + "[" + student.get(i).getJava() + "]�Դϴ�.");
			System.out.println("web ������ " + "[" + student.get(i).getWeb() + "]�Դϴ�.");
			System.out.println("-----------------------");
		}		
	}
}
