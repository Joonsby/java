package com.jslee.database_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {	
	public void input(){
		DataControl dataControl = new DataControl(); // DataControl ��ü ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		
		System.out.println("java ������ �Է��ϼ���");
		int java = sc.nextInt();
		
		System.out.println("web ������ �Է��ϼ���");
		int web = sc.nextInt();
		
		sc.close();
		dataControl.input(name,java,web); // DataControl���� name,java,web�� ���� ȣ��� ���ÿ� ������.
		System.out.println("[" + name + "]�л��� ������ �ԷµǾ����ϴ�.");
	}
	
	public void printAll() {
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
