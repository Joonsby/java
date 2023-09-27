package com.lymin.collect;

import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		List list = new Vector(); // �Ϲ����� ���

		list.add("ö��");
		list.add("�μ�");
		list.add("ĥ��");

		for (int i = 0; i < list.size(); i++) {
			String temp = (String) list.get(i); // get �޼ҵ带 ���Ͽ� �ε����� �ҷ����� ĳ���� �Ͽ� �ӽ� ���� �մϴ�.
			System.out.println("Vector value is [" + temp + "]"); // �ӽ� ������ ���� ����մϴ�.
		}
		System.out.println("------------------------------");

		List List02 = new Vector();
		List02.add(new Book("������ ����", "ö��")); // Book Ŭ������ �����ؼ� Vector�� �ֽ��ϴ�.
		List02.add(new Book("������ ����", "����"));
		List02.add(new Book("ö���� ����", "����"));

		for (int i = 0; i < List02.size(); i++) {
			Book book = (Book) List02.get(i); // get �޼ҵ带 ���Ͽ� �ε����� �ҷ����� ĳ���� �Ͽ� �ӽ� ���� �մϴ�.
			System.out.println("Book title value is [" + book.getTitle() + ":" + book.getWriter() + "]");
		}
		System.out.println("------------------------------");

		List02.remove(1); // ������ ���� ����.
		for (int i = 0; i < List02.size(); i++) {
			Book book = (Book) List02.get(i); // get �޼ҵ带 ���Ͽ� �ε����� �ҷ����� ĳ���� �Ͽ� �ӽ� ���� �մϴ�.
			System.out.println("Book title value is [" + book.getTitle() + ":" + book.getWriter() + "]");
		}

	}

}
