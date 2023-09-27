package com.jslee.collection;

// https://docs.oracle.com/javase/8/docs/api/index.html api�� ���ؼ� Collection�� ã�� ���� �߿��ϴ�.

import java.util.ArrayList;
import java.util.Collections;

public class Collection02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(10); // ������ 10���� Collection �迭 ����
		list1.add(5); // ù��° ���
		list1.add(2); // �ι�° ���
		list1.add(1); // ����° ���
		list1.add(4); // �׹�° ���
		list1.add(0); // �ټ���° ���
		list1.add(3); // ������° ���
		// list1.add("test") Collection�� type�� �������� ������  "test"�� �߰��ϴ� �͵� ���������� ����Ǵ� ������ �ƴϴ�.
		// ArrayList list1 = new ArrayList(10);
		// add�� �迭�� ������ �þ�� �˾Ƽ� ������ �÷��� �迭�� ������ �ø���.
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // list1�� ù��°�� �׹�° ������ ����� ���� (���� 4������ ����)
		print(list1,list2); // method print ����
		
		Collections.sort(list1); // sort ������ ũ�⿡ ���� ����
		Collections.sort(list2); // list2 �� ù��°�� �׹�° ������ ����� ������ ũ�⿡ ���� ����
		print(list1,list2); // method print ����
		
		System.out.println("list1.containsAll(list2)" + list1.containsAll(list2));
		// Arraylist���� containsAll�� ���� �� �θ��� AbstractList���� ���� �� �θ��� AbstractCollection�� containsAll�� �ִ�.
		// containsAll�� list1�� list2�� ��� ���ԵǾ� �ִ����� boolean ���·� �Ǻ��ϴ� ���̴�.
		// list2 [1, 2, 4]�� list1 [0, 1, 2, 3, 4, 5]�� ��� ���ԵǾ� �ֱ� ������ true�̴�. 
		
		list2.add("B"); // list2 ���� �ڿ� "B"�� �߰��Ѵ�.
		list2.add("C"); // list2 ���� �ڿ� "C"�� �߰��Ѵ�. -> "B" �ڿ� "C"�� ���Եȴ�.
		list2.add(3,"A"); // list2�� ����° �ڸ��� "A"�� �߰��Ѵ�.(�޼ҵ� �����ε�) add�� ���ڵ� ���ڵ� ����ִ� ���� �����ϴ�.
		print(list1,list2); // method print ����
		
		list2.set(3,"AA"); // list2 �� ����° �ڸ��� �ִ� ���� "AA"�� ��ü�Ѵ�.
		print(list1,list2); // method print ����
		
		System.out.println("list1,retainAll(list2)" + list1.retainAll(list2));
		// list1�� list2�� ���� ��Ҹ� ������ �������� ��� �����Ѵ�. 
		print(list1,list2); // list1�� list2�� ����κ��� [1,2,4]�� ������ ������ �κ��� �����ϰ� list1�� ��µȴ�.
		
		for (int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) { // get : list�� i��°�� �ִ� ��Ҹ� �����Ѵ�.
				list2.remove(i); // remove : i��°�� �ִ� ��Ҹ� �����Ѵ�.
			}
		}
		// �Ʒ��� �ִ� ������ for������ ǥ���� ���̴�.
		
		/*
		if(list1.contains(list2.get(5))) { // list1�� list2�� 5��°�� �ִ� ��Ҹ� �����ϰ� ������
			list2.remove(5);			   // list2�� 5��° ��Ҹ� �����Ѵ�.list1�� ("C")�� �����ϰ� ���� �ʱ� ������ ���ŵ��� �ʴ´�
		}
		if(list1.contains(list2.get(4))) { // list1�� list2�� 4��°�� �ִ� ��Ҹ� �����ϰ� ������
			list2.remove(4);			   // list2�� 4��° ��Ҹ� �����Ѵ�.list1�� ("B")�� �����ϰ� ���� �ʱ� ������ ���ŵ��� �ʴ´�
		}
		if(list1.contains(list2.get(3))) { // list1�� list2�� 3��°�� �ִ� ��Ҹ� �����ϰ� ������
			list2.remove(3);			   // list2�� 3��° ��Ҹ� �����Ѵ�.list1�� ("AA")�� �����ϰ� ���� �ʱ� ������ ���ŵ��� �ʴ´�
		}
		if(list1.contains(list2.get(2))) { // list1�� list2�� 2��°�� �ִ� ��Ҹ� �����ϰ� ������
			list2.remove(2);			   // list2�� 2��° ��Ҹ� �����Ѵ�.list1�� ("4")�� �����ϰ� �ֱ� ������ �����Ѵ�.
		}
		if(list1.contains(list2.get(1))) { // list1�� list2�� 1��°�� �ִ� ��Ҹ� �����ϰ� ������
			list2.remove(1);			   // list2�� 1��° ��Ҹ� �����Ѵ�.list1�� ("2")�� �����ϰ� �ֱ� ������ �����Ѵ�.
		}
		if(list1.contains(list2.get(0))) { // list1�� list2�� 4��°�� �ִ� ��Ҹ� �����ϰ� ������
			list2.remove(0);			   // list2�� 4��° ��Ҹ� �����Ѵ�.list1�� ("1")�� �����ϰ� �ֱ� ������ �����Ѵ�.
		}
		*/

		print(list1,list2); // method print ����
	}
	static void print(ArrayList list1, ArrayList list2) { // print method ��ü�� �Ű����� 2��
		System.out.println("list1" + list1);
		System.out.println("list2" + list2);
		System.out.println();
	}

}
