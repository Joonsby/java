package com.jslee.collection;
import java.util.ArrayList;

public class Collection04 {
	// 1-45 ������ �����߿� 6���� �����ؼ� ��� -> �������� ����
	// 6���� ���ڴ� ���� �ߺ����� �ʴ´�.
	// ArrayList Ŭ������ ��ӹ޾� ���.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> random = new ArrayList<Integer>(45);
		for (int i = 1; i < 46; i++) {
			random.add(i);
		}
		for(int i = 1; i < 7; i++) {			
		    double dValue = Math.random();
		    int iValue = (int)(dValue * 45 + 1);
		    System.out.println(iValue);
		}
		System.out.println(random);
	}
}
