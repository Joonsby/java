package com.jslee.repeat;

import java.util.ArrayList;

// 1~45 �������� ���� 6�� ���� -> ���� ���
// ���ڵ��� �ߺ����� �ʴ´�.

public class RandomNumberExample {

	public static void main(String[] args) {
		// int[] arr = new int[45]; 45���� ������� ������ �������.
		// ������ 6���� ������ �Ǳ� ������ 45���� ������ ���� �ʿ䰡 ����.

		ArrayList<Integer> ran = new ArrayList<Integer>(6); // ������ 6���� ���ڸ� ������ ������ 6�� �����.
		int repeatTime = 0; // �ݺ�Ƚ���� ��Ÿ���� ������ �����Ѵ�.
		// while(ran.size() != 6)
		while(repeatTime < 6) { // �ݺ� Ƚ���� 6�� �ɶ����� �ݺ���Ų��.
			int randomNum = (int) (Math.random() * 45) + 1;
			// Math�� Ŭ�����̱� ������ api���� Math��� Ŭ������ �˻��ؾ� �ȴ�.
			// 45���� ���� �������� �����ؾ� �Ǳ� ������ *45�� ����� �ϰ� 0�������� �����ϱ� ������ +1�� ����� �Ѵ�.
			if (!ran.contains(randomNum)) { // randomNum�� ArrayList ran�� ���Ե��� ������ randomNum�� �߰����� �ʴ´�. 
				ran.add(randomNum);// ran�̶�� Arraylist�� randomNum�� add�� ���� �ִ´�.
				repeatTime++; // �ݺ�Ƚ���� 1�� ���� ��Ų��.
			}
		}		
		System.out.println(ran);
	}
}
