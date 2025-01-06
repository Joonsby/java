package com.jslee.database_project;

import java.util.Scanner;

public class Control {
	public Control(){
		Menu menu = new Menu();
		DataControl dataControl = new DataControl();
		Scanner sc = new Scanner(System.in);
		String name;
		boolean select = true;
		while (select) {
		System.out.println("�޴��� �����ϼ���");
		System.out.println("1.���� �Է�");
		System.out.println("2.���� ���");
		System.out.println("3.���� ��ü ���");
		System.out.println("4.���� ����");
		System.out.println("5.����");
		int menuSelect = sc.nextInt();
		switch (menuSelect) {
			case 1: {			
				menu.input();
				break;
			}
			case 2: {
				// ���̺� ���� Ư�� ���� �̾Ƴ��� ��� select from t where id = 'b';
				// id�� 'b'�� ���� �̾� ���� ���̴�. �ߺ��Ǵ� ������ �ִ� ��� �ش�Ǵ� ��� ������ �� �����´�.
				// �����ϰ� select�� executeQuery�� ����Ѵ�.
				// executeQuery�� executeUpdate�� �Բ� ����� �� ����.(�ѹ��� �ѹ��� ���)
				System.out.println("����� ���ϴ� �л��� �̸��� �Է��ϼ���.");
				name = sc.next();			
				dataControl.print(name);
				break;
			}
			case 3: {			
				menu.printAll();
				break;
			}
			case 4: {
				// ���̺� ���� ���ڵ带 ���� �ϴ� ��� delete from table�� where id='a';
				// delete from table���� ����ϸ� table ��ü�� ��������.
				// id�� a�� ���� ����ٴ� ���̴�.
				System.out.println("������ �л��� �̸��� �Է��ϼ���.");
				name = sc.next();			
				dataControl.delete(name);			
				break;
			}
			case 5: {
				System.out.println("���α׷��� �����մϴ�.");
				select = false;
				break;
			}
			default: {
				System.out.println("�޴��� 1~5�� �߿��� �ٽ� �������ּ���.");
			}
		}
		sc.close();
	}
}
}
