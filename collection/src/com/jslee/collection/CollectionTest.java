package com.jslee.collection;

import java.util.ArrayList;
import java.util.Scanner;

class inputTest { // inputTest Class ����
	String name;
	int java, web;
	Scanner sc = new Scanner(System.in);

	void menu() {
		ArrayList<String> name = new ArrayList<String>(); // �̸��� �޾ƿ� ��ü ���� ���� ArrayList = ���׸� Ÿ��
		ArrayList<Integer> java = new ArrayList<Integer>(); // java������ �޾ƿ� ��ü ���� ����
		ArrayList<Integer> web = new ArrayList<Integer>(); // web������ �޾ƿ� ��ü ���� ����
		
		boolean isRun = true; // while���� �����Ű�� ���� ���� ����

		while (isRun) { // isRun�� false���� �ɶ����� �ݺ��� ���� 
			System.out.println("���ϴ� �޴��� �����ϼ���");
			System.out.println("1.�����Է� \n2.������� \n3.������ü��� \n4.�������� \n5.����");
			int menu = sc.nextInt(); // �޾ƿ� �Է°����� �޴� ����
			switch (menu) { // �޾ƿ� �Է°����� switch�� ����
			case 1:
				System.out.println("1.�����Է�");
				System.out.println("�̸��� �Է��ϼ���.");
				String name01 = sc.next(); // �޾ƿ� �̸��� name01 ������ ����
				name.add(name01); // �޾ƿ� name01 ���� String Ÿ���� name ��ü ������ ����
				System.out.println("java ������ �Է��ϼ���.");
				int java01 = sc.nextInt(); 
				java.add(java01); // �޾ƿ� java01 ���� Integer Ÿ���� java ��ü ������ ����
				System.out.println("web ������ �Է��ϼ���.");
				int web01 = sc.nextInt();
				web.add(web01); // �޾ƿ� web01 ���� Integer Ÿ���� web ��ü ������ ����
				break;
			case 2:
				System.out.println("2.�������");
				System.out.println("�� ��° �л����� �Է��ϼ���.");
				int i = sc.nextInt();
				String studentName = name.get(i - 1);
				Integer javaResult = java.get(i - 1);
				Integer webResult = web.get(i - 1);
				System.out.println(i + "��° �л��� �̸��� java������ web������ ���� " + studentName + ", " + javaResult + ", "
						+ webResult + "�Դϴ�.");
				System.out.println();
				break;
			case 3:
				for (int j = 0; j < name.size(); j++) {
					System.out.println((j + 1) + "��° �л��� �̸��� java������ web������ ���� " + name.get(j) + ", " + java.get(j)
							+ ", " + web.get(j) + "�Դϴ�.");
				}
				break;
			case 4:
				System.out.println("4.��������");
				System.out.println("������ �л��� ��ȣ�� �Է��ϼ���.");
				int k = sc.nextInt();
				name.remove(k-1);
				java.remove(k-1);
				web.remove(k-1);
				System.out.println(k + "��° �л��� ������ ���� �Ǿ����ϴ�.");
				break;
			case 5:
				System.out.println("����");
				isRun = false;
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
	}
}

public class CollectionTest {

	public static void main(String[] args) {

		inputTest studentInfo = new inputTest(); // inputTest Ŭ���� ��ü ����
		studentInfo.menu(); // inputTest �ȿ� �ִ� menu method ȣ��

		/*
		 * ���α׷� ���� 1.�����Է� Scanner inputTest{ String name; int java,web;
		 * 
		 * } 2.������� System.out.println(); printTest{} 3.������ü��� printAllTest{} 4.��������
		 * classdeleteTest{} 5.���� exit{} ���ϴ� �޴��� �����ϼ���. 5���� ������ ������ ���α׷��� ������� �ʴ´�.
		 * 
		 * 1 ���̵�, java, web ���� �Է�
		 * 
		 * 1.�����Է� 2.������� 3.������ü��� 4.�������� 5.���� ���ϴ� �޴��� �����ϼ���.
		 * 
		 * 1 ���̵�, java, web ���� �Է�
		 * 
		 * 3 1.�����Է� 2.������� 3.������ü��� 4.�������� 5.���� ���ϴ� �޴��� �����ϼ���. �θ��� ������ ȭ�鿡 ���;� �Ѵ�.
		 * 
		 * 2 ����ϰ����ϴ� �л��� ���̵� �Է��ϼ���. ���� ���ٸ� �����ϴ�.
		 * 
		 */
	}

}
