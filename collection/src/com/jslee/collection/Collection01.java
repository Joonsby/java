package com.jslee.collection;

import java.util.ArrayList;

public class Collection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է� -> �۾� -> ���
		int i;
		int [] arr = new int[10]; // 0~9�������� �迭�� �����Ǿ���.
		// arr = 123; �迭�� ��ġ�� ������ ���� �ʾұ� ������ �̷������δ� ���� ������ �� ����.
		ArrayList<Integer> arrlist = new ArrayList<Integer>(20); // ()�ȿ� �� ���ڴ� ������ �ǹ��Ѵ�.
		// arrlist[0] = 456; []�� �������� �ʾұ� ������ �̷������δ� ��ġ�� ������ �� ����.
		// �÷����� �̿��ϸ� ���������� �迭�� ������ ������ �� �ִ�.
		// �÷����� Ŭ�����̱� ������ ��ü���·� �����ؾߵȴ�.
		// ArrayList ��ü ���� <> �ȿ� ������ Ÿ���� ���� �ִ´�.
		// boxing�� ���ؼ� <>�ȿ��� ��ü ������ ������ Ÿ���� ���� �־�� �Ѵ�. ex) String, Double, Integer
		
		arrlist.add(12); // ù��°
		arrlist.add(34); // �ι�°
		arrlist.add(56); // ����°
		
		int firstArr = arrlist.get(0); // autoboxing�� ���ؼ� ��ü���·� ���������� ���� �ʾƵ� get�� �� ���ִ�.
		int secondArr = arrlist.get(1);
		int thirdArr = arrlist.get(2);
		
		for (int j = 0; j < 3; j++) {
			System.out.println(arrlist.get(j));
		}
		
		// System.out.println(firstArr);
		// System.out.println(secondArr);
		// System.out.println(thirdArr);
		
		// api�� ���� add�� �����ε��̱� ������ �Ű����� �ȿ� �ƹ��͵� �ȵ� �� ����.
		// ex) add(E e), add(int index, E element)
	}

}
