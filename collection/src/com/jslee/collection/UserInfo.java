package com.jslee.collection;

public class UserInfo {
	private String name;
	private int age;
	private String addr;
	
	public void setName(String name01) { // ���� �ִ� ������ �̸��� �����
		this.name = name01; // ������ �����ϴ��� �򰥸��� �ֱ� ������ this(�� �ڽ�)�� �������ش�.
	}
	
	public void setAge(int age01) {
		this.age = age01;
	}
	
	public void setAddr(String addr01) {
		this.addr = addr01;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	String getAddr() {
		return addr;
	}
	
	// public void n() {
	//	 name = "java";
	// }
	// ���������� private���� �����.
	// �� ������ �ƹ��� ���� �����Ҷ� public�� ����Ѵ�
	// �ڽĿ��Ը� publicó�� ����� ������ protected�� ����Ѵ�.
	
	// public void m() {} method�� ���� public���� ��������� �����.
}
