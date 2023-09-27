package com.jslee.collection;

import java.util.ArrayList;
import java.util.Scanner;

class Input01 {
	Scanner sc = new Scanner(System.in);
	String name; // ��ü Ÿ���� ==�� ����� �� ����.
	int java, web;

	void input() {
		System.out.println("�̸��� �Է����ּ���.");
		name = sc.next();
		System.out.println("java������ �Է����ּ���.");
		java = sc.nextInt();
		System.out.println("web������ �Է����ּ���.");
		web = sc.nextInt();
	}
	void output() {		
		System.out.println("�̸��� [" + name + "]�Դϴ�.");
		System.out.println("java������ [" + java + "]�Դϴ�.");
		System.out.println("web ������ [" + web + "]�Դϴ�.");
		System.out.println("-----------------------------");
	}
}

class InputType {
	ArrayList<Input01> student = new ArrayList<Input01>(); // ��ü �迭 ���� input Ŭ���� ������
	Scanner sc = new Scanner(System.in);
	void menu() {
		boolean isRun = true;
		while (isRun) {
			System.out.println("���ϴ� �޴��� �����ϼ���");
			System.out.println("1.�����Է� \n2.������� \n3.������ü��� \n4.�������� \n5.����");
			int menu = sc.nextInt(); // �޴��� ������ ���� �޾ƿ�
			if (menu == 1) {
				Input01 std = new Input01(); // input ��ü ����
				std.input(); // input Ŭ���� �ȿ� �ִ� input �޼ҵ� ȣ��
				student.add(std); // ArrayList<input> ��ü �迭 �ȿ� std���� �߰���
			} else if (menu == 2) {
				 /*
				  �̸� �Է�				 
				 for (int i = 0; i < student.size(); i++) {				
				 		if(�̸�equals.(�̸��Է�.get(i).name)){
				 			input std = new input(); // input ��ü ����				 			
							std = student.get(i);
							std.output();
				 		} ��ü�� ==�� ����� �� ���� ������ equals ���				 		
				 	}
				  */
				Input01 std = new Input01(); // input ��ü ����
				System.out.println("����� �л��� �̸��� �Է��ϼ���");
				String inputName = sc.next(); // ArrayList<input> student �� name�� ���� ���� �̸��� �Է��Ѵ�.	
				boolean find = false; // find��� boolean�� ���� ����
				for (int i = 0; i < student.size(); i++) { 
					if(inputName.equals(student.get(i).name)) {
						find = true;
						// inputName�� student�� �迭�߿� �ϳ��� ��ġ�ϴ� ���� �ִٸ� find�� true�̴�.
						// �Էµ� �л��� ���� ArrayList<input> student �ȿ� �ִ� name�� ���� ��ġ�� ������ student�� �迭 ������ŭ �ݺ��ؼ� ���Ѵ�.
						// ��ġ�Ѵٸ� ��ġ�ϴ� ������ �迭�� �����´�.
						std = student.get(i); // student�� i���翡 �ִ� �迭�� �����´� 
						std.output(); // input Ŭ������ �ִ� output �޼ҵ� ���
					}
				}
				if (!find) { // ���� find�� false��� for���� Ż���Ͽ� �Ʒ� ������ ����Ѵ�. 
					System.out.println("�Է��� ������ �л��� �����ϴ�.");
				}
			} else if (menu == 3) {
				Input01 std = new Input01(); // input ��ü ����
				for (int i = 0; i < student.size(); i++) {
					std = student.get(i); // student��� �̸��� ArrayList<input>�� �ִ� ���� std�� ����
					std.output(); // output �޼ҵ� ��� -> name, java, web�� ���� Ŭ���� �ȿ� �ֱ� ������ output �޼ҵ忡���� ���� �޾Ƶ��� �� �ִ�.
				}
			} else if (menu == 4) {
				Input01 std = new Input01(); // input ��ü ����
				System.out.println("������ �л��� �̸��� �Է��ϼ���");
				String inputName = sc.next(); // ArrayList<input> student �� name�� ���� ���� �̸��� �Է��Ѵ�.
				boolean delete = false; // find��� boolean�� ���� ����
				for (int i = 0; i < student.size(); i++) { 
					if(inputName.equals(student.get(i).name)) {
						delete = true; // inputName�� student�� �迭�߿� �ϳ��� ��ġ�ϴ� ���� �ִٸ� find�� true�̴�.
						student.remove(i);
						// �Էµ� �л��� ���� ArrayList<input> student �ȿ� �ִ� name�� ���� ��ġ�� ������ student�� �迭 ������ŭ �ݺ��ؼ� ���Ѵ�.						
						System.out.println(inputName + "�� ������ �����Ǿ����ϴ�.");
					}
				}
				if(!delete) { // ���� find�� false��� for���� Ż���Ͽ� �Ʒ� ������ ����Ѵ�.
					System.out.println("������ ������ �л��� �����ϴ�.");
				}
			} else if (menu == 5) {
				System.out.println("����");
				isRun = false;
			} else {
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
	}
}

public class CollectionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputType studentInfo = new InputType(); // inputType Ŭ���� ��ü ����
		studentInfo.menu(); // inputType�� menu�޼ҵ� ȣ��
	}
}
