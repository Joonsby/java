package com.jslee.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExam {
	Hashtable<String/*key*/, UserInfo/*value*/> table = new Hashtable<String, UserInfo>(); // UserInfo�� ���� ��ü�� ���� / ������ �߿����� �ʱ� ������ Hashtable ����
	
	public HashTableExam() {
		UserInfo u = new UserInfo();
		// u.name = "��"; � ������ ¥�� ���������� �����ؼ� ����ϴ� ���� ���� �Ұ����ϴ�
		// u.n(); method�� public ���� ��������� ȣ���� �� �ִ�. u.name�� "java"�� �����ѰͰ� ����.
		// private�� ���� ������ �� ������ method�� ���ؼ� ���������� ���� �Է��ϴ� ���� �����ϴ�.
		// ���� �������� private�� Ȯ���� ũ�� method���� public�� Ȯ���̴� ũ��.
		// ��������� ������ ��������� open�� ������ �̿��ؾ� �Ѵ�.
		u.setName("��");
		u.setAge(20);
		u.setAddr("������");
		
		UserInfo u2 = new UserInfo();
		u2.setName("��");
		u2.setAge(25);
		u2.setAddr("���ﵿ");
		
		UserInfo u3 = new UserInfo();
		u3.setName("��");
		u3.setAge(30);
		u3.setAddr("û�㵿");
		
		table.put("ga",u);
		table.put("na",u2);
		table.put("da",u3);
		
		Enumeration<String> e = table.keys();
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			UserInfo value = table.get(key); // table�� �ִ� ���� value�� ���� �ְڴٴ� ���̴�.
			System.out.println(key + " = " + value);
			 // System.out.println(value.name); // name�� private�̱� ������ �ٷ� �������� ���� �Ұ����ϴ�.
			 System.out.printf("%s, %d, %s%n", value.getName(), value.getAge(), value.getAddr());
		}		
	}
}
