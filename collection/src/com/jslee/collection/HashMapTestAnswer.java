package com.jslee.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class input2 {	
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

class InputType2 {
//	ArrayList<input> student = new ArrayList<input>(); // ��ü �迭 ���� input Ŭ���� ������
	HashMap<String, input2> student = new HashMap<String, input2>(); // HashMap ��ü ����
	// HashMap<String, ��������> student = new HashMap<String, ��������>();
	Scanner sc = new Scanner(System.in);
	void menu() {
		boolean isRun = true;
		while (isRun) {
			System.out.println("���ϴ� �޴��� �����ϼ���");
			System.out.println("1.�����Է� \n2.������� \n3.������ü��� \n4.�������� \n5.����");
			int menu = sc.nextInt(); // �޴��� ������ ���� �޾ƿ�
			if (menu == 1) {
				input2 std = new input2(); // input ��ü ����
				std.input(); // input Ŭ���� �ȿ� �ִ� input �޼ҵ� ȣ��
				student.put(std.name, std); // ArrayList<input> ��ü �迭 �ȿ� std���� �߰���
//				student.put(std.name,std.java);
//				student.put(key��,�л�����); // ArrayList<input> ��ü �迭 �ȿ� std���� �߰���
			} else if (menu == 2) {
				// if(�Է�Ű��.containsKey()){
				// �������� �л� = new ��������();
				// �л� = std.get(str);
				// System.out.println("key = %s => value = %d%n, str, i);
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
				input2 std = new input2(); // input ��ü ����
				System.out.println("����� �л��� �̸��� �Է��ϼ���");
				String inputName = sc.next(); // ArrayList<input> student �� name�� ���� ���� �̸��� �Է��Ѵ�.	
				boolean find = false; // find��� boolean�� ���� ����				
					if(student.containsKey(inputName)) {
						find = true;
						// inputName�� student�� �迭�߿� �ϳ��� ��ġ�ϴ� ���� �ִٸ� find�� true�̴�.
						// �Էµ� �л��� ���� ArrayList<input> student �ȿ� �ִ� name�� ���� ��ġ�� ������ student�� �迭 ������ŭ �ݺ��ؼ� ���Ѵ�.
						// ��ġ�Ѵٸ� ��ġ�ϴ� ������ �迭�� �����´�.
						student.get(inputName); // student�� i���翡 �ִ� �迭�� �����´� 
						std.output(); // input Ŭ������ �ִ� output �޼ҵ� ���					
				}
				if (!find) { // ���� find�� false��� for���� Ż���Ͽ� �Ʒ� ������ ����Ѵ�. 
					System.out.println("�Է��� ������ �л��� �����ϴ�.");
				}
			} else if (menu == 3) { // key���� �̾Ƽ� �;ߵȴ�.
				Set<String> s = student.keySet(); // key������ �����ϰڴٴ� ���̴�. ������ key������ s�� �����ߴ�. <K(Key)>�̱� ������ String�� �־���� �ȴ�.
				for(String str : s) { // key�� ������ �ִ� ��ŭ �ݺ� ��Ű�ڴٴ� ������ for��
					input2 i = student.get(str); // ������ Ű�� ���ε� ���� �����ϰų�, �� �ʿ� Ű�� ���� ������ ���� ��� null�� �����Ѵ�.
					// hash.get() �ȿ��� key���� �Է��ؾ� �Ѵ�. �Է��� key���� �������� �ʴ´ٸ� null�� �����Ѵ�.
					System.out.printf("key = %s => value = %d%n", str, i); // str(key)�� i(value)�� �Բ� ����ϰڴٴ� ���̴�.		
				}
			} else if (menu == 4) {
				input std = new input(); // input ��ü ����
				System.out.println("������ �л��� �̸��� �Է��ϼ���");
				String inputName = sc.next(); // ArrayList<input> student �� name�� ���� ���� �̸��� �Է��Ѵ�.
				boolean delete = false; // find��� boolean�� ���� ����
				for (int i = 0; i < student.size(); i++) { 
					if(student.containsKey(inputName)) {
						delete = true; // inputName�� student�� �迭�߿� �ϳ��� ��ġ�ϴ� ���� �ִٸ� find�� true�̴�.
						student.remove(inputName);
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

public class HashMapTestAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputType2 studentInfo = new InputType2(); // inputType Ŭ���� ��ü ����
		studentInfo.menu(); // inputType�� menu�޼ҵ� ȣ��
	}
}
