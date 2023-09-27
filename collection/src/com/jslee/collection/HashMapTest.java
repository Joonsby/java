package com.jslee.collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class input {
	Scanner sc = new Scanner(System.in);
	String name;
	int javaScore, webScore;

	void input() {
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.next();
		System.out.println("java ������ �Է��ϼ���");
		javaScore = sc.nextInt();
		System.out.println("web ������ �Է��ϼ���");
		webScore = sc.nextInt();
	}
}

class print {
	HashMap<String, input> studentInfo = new HashMap<String, input>();
	Scanner sc = new Scanner(System.in);
	boolean select = true;
	boolean isTrue = false;

	print() {
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
				input std = new input();
				std.input();
				studentInfo.put(std.name, std);
				System.out.println("[" + std.name + "]�� �л� ������ ����Ǿ����ϴ�.");
				break;
			}
			case 2: {
				System.out.println("������ ��ȸ�� �л��� �̸��� �Է��ϼ���.");

				boolean isTrue = false;
				String searchStudentName = sc.next();
				if (studentInfo.containsKey(searchStudentName)) {
					isTrue = true;
					input student = studentInfo.get(searchStudentName);
					System.out.println("��ȸ�� �л��� �̸��� [" + student.name + "] �Դϴ�.");
					System.out.println("��ȸ�� �л��� java ������ [" + student.javaScore + "] �Դϴ�.");
					System.out.println("��ȸ�� �л��� web ������ [" + student.webScore + "] �Դϴ�.");
				}
				if (!isTrue) {
					System.out.println(searchStudentName + "�� �л� ������ �����ϴ�.");
				}
				break;
			}
			case 3: {
				System.out.println("���� ��ü ���");
				Set<String> keys = studentInfo.keySet();
				for (String key : keys) {
					isTrue = true;
					input student = studentInfo.get(key);
					System.out.println("�л��� �̸��� [" + student.name + "] �Դϴ�.");
					System.out.println("�л��� java������ [" + student.javaScore + "] �Դϴ�.");
					System.out.println("�л��� web������ [" + student.webScore + "] �Դϴ�.");
					System.out.println("------------------");
				}
				if (!isTrue) {
					System.out.println("����� �л��� ������ �����ϴ�.");
				}
				break;
			}
			case 4: {

				System.out.println("������ �л��� �̸��� �Է��ϼ���.");
				String deleteStudent = sc.next();
				isTrue = false;
				for (int i = 0; i < studentInfo.size(); i++) {
					if (studentInfo.containsKey(deleteStudent)) {
						isTrue = true;
						studentInfo.remove(deleteStudent);
						System.out.println(deleteStudent + "�� ������ �����Ǿ����ϴ�.");
					}
				}
				if (!isTrue) {
					System.out.println(deleteStudent + "�� �л� ������ �����ϴ�");
				}
				break;
			}
			case 5: {
				System.out.println("���α׷��� �����մϴ�.");
				select = false;
			}
			default: {
				System.out.println("�޴��� 1~5�� �߿��� �ٽ� �������ּ���.");
			}
			}
		}
	}
}

public class HashMapTest {

	public static void main(String[] args) {
		new print();		
	}
}
