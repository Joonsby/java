package com.lymin.inheritance;

public class Boy extends People {
	public int idNum;
	
	public Boy(String name) {
		super(name); // �θ� ����ŵ�ϴ�.
		// TODO Auto-generated constructor stub
	}
	
	public Boy(String name, int idNum) { 
		super(name); // �θ� �����ڷ� �����ϰ�
		// TODO Auto-generated constructor stub
		this.idNum = idNum; // �ڽ��� �ʵ� ������ ���� �����Ѵ�.
	}

}
