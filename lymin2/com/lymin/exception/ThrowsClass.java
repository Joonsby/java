package com.lymin.exception;

public class ThrowsClass {
	public void findClass() throws ClassNotFoundException {
		Class class1 = Class.forName("java.lang.StringTwo"); // �̷� �޼ҵ尡 ���� ������ ClassNotFoundException �߻��մϴ�.
		//���⼭ Try Catch�� ���� �ʰ� �� �޼ҵ带 ȣ�� �ϴ� �κп��� Try catch �ϵ��� �� �� ���ϴ�.
	}

}
