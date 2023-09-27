package com.jslee.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashsetExam extends HashSet<String>{ // HashSet Collection�� �������� �ʰ� HashSet �θ� Ŭ������ ��� �޾Ҵ�.

//	HashSet<String> hash = new HashSet<String>(); // HashSet Collection ���� HashSet�� �ߺ��� ���� ���� �� ����.

	public void addset() { // return���� ���� addset method ����
		/*super.*/add("java"); // hash�� "java"�� �߰��Ѵ�. �տ� super�� ���� �����ϴ�.
//		hash.add("java"); // hash�� "java"�� �߰��Ѵ� .
		
		/*super.*/add("hello"); // hash�� "hello"�� �߰��Ѵ�. �տ� super�� ���� �����ϴ�.
//		hash.add("hello"); // hash�� "hello"�� �߰��Ѵ�. 
		
		/*super.*/add("hoho"); // hash�� "hoho"�� �߰��Ѵ�. �տ� super�� ���� �����ϴ�.
//		hash.add("hoho"); // hash�� "hoho"�� �߰��Ѵ�	.
//		hash.add("hoho"); // hash�� "hoho"�� �߰��Ѵ� �ߺ��Ǹ� ���� �ϳ��� ������.
		
		/*super.*/add("huhu"); // hash�� "huhu"�� �߰��Ѵ�. �տ� super�� ���� �����ϴ�.
//		hash.add("huhu"); // hash�� "huhu"�� �߰��Ѵ�.
		
		/*super.*/add("Green"); // hash�� "Green"�� �߰��Ѵ�. �տ� super�� ���� �����ϴ�.
//		hash.add("Green"); // hash�� "Green"�� �߰��Ѵ�.
		
		/*super.*/add("zzang"); // hash�� "zzang"�� �߰��Ѵ�. �տ� super�� ���� �����ϴ�.
//		hash.add("zzang"); // hash�� "zzang"�� �߰��Ѵ�.
	}

	public void printset() { // return���� ���� printset method ����
		Iterator<String> it = /*hash./super.*/iterator(); // Iterator Collection ����
		while (it.hasNext()) { // it�� �о�� ���� ��Ұ� ���������� while�� ����
			String name = it.next(); // it.next�� ���������͸� ��ȯ�� ���� String name�� ����
			System.out.println(name + "\t"); // name�� ����� ���� ���
		}
		System.out.println("\n===============");
		TreeSet<String> tree = new TreeSet<String>(/*hash*/this); // TreeSet Collection ���� / ���� ��ü�� �����Ա� ������ this�� �Է��ؾ� �Ѵ�.
		Iterator<String> it2 = tree.iterator(); // Iterator Collection ����
		while (it2.hasNext()) { // it2�� �о�� ���� ��Ұ� ���������� while�� ����
			String name = it2.next(); // it2.next�� ���������͸� ��ȯ�� ���� String name�� ����
			System.out.println(name + "\t"); // name�� ����� ���� ���
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashsetExam ha = new HashsetExam(); // HashsetExam Ŭ������ ���� ��ü�� ����
		ha.addset(); // HashsetExam Ŭ���� �ȿ� �ִ� addset �޼ҵ� ȣ��
		ha.printset(); // HashsetExam Ŭ���� �ȿ� �ִ�  printset �޼ҵ� ȣ��
	}

}
