package com.jslee.inheritance;
class SuperEx{ // SuperEx class ����
	public SuperEx() { // ������ ����
		System.out.println(1);
	}
	
	public SuperEx(int i) { // ������ �Ű������� ���� ������ �����ε�
		System.out.println(2);
	}
	
	public SuperEx(boolean b) { // boolean�� �Ű������� ���� ������ �����ε�
		System.out.println(3);
	}
}

class Sub extends SuperEx{ // SuperEx Ŭ������ Sub�� ��ӹ��� 
	public Sub() { // ������ ����
		// super(); ��� ������ �����Ǿ� �ִ�. �θ��� �����ڵ� ã�Ƽ� ȣ���ؾ� �Ǳ� �����̴�. �Ű������� ���� 1���� ȣ���Ѵ�.
		// �θ� ������ ȣ�� -> Super(); ���� �ִ� �����̱� ������ ���� �����ϴ�.
		super(3); // super : �θ�Ŭ������ ��Ī�ϴ� Ű�����̴�.
		// SuperEx(3);�� ������ ���̴�.
		System.out.println(4); // 4�� Sub
	}
	public Sub(int a) { // ������ �����ε�
		this("A"); // this : �ڱ� �ڽ��� ��Ī
		// Sub("A")�� ������ �����̴�.
		// SuperEx();�� �����Ǿ� �ִ�.
		System.out.println(5); // 5�� Sub	
	}
	public Sub(String s) { // ������ �����ε�
		super(true);
		System.out.println(6); // 6�� Sub
	}
}


public class Super01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Sub(); 2��(�θ� ������), 4�� Sub(�ڽ� ������) ȣ��
		// new Sub(3);  3�� -> 6�� -> 5��
		// new Sub(true); 4, 5, 6�� �߿� boolean type�� ���� ������ ������ �߻��Ѵ�.
		// new Sub("A"); 3�� -> 6�� 
		// �ƹ��͵� ���� ������ �θ�� �ڽ��� �⺻ �����ڸ� ȣ���Ѵ�.
		/*
		�ڽ��� �����ڰ� �ΰ��� ȣ��ȴ�.
		�θ�� �ڽ� �Ѵ� ���� �����ڸ� ������ �ֱ� �����̴�.
		�ڽ��� �����ڴ� ������ �θ��� �����ڸ� ȣ���ϰ� �Ǿ��ִ�.
		*/
	}

}
