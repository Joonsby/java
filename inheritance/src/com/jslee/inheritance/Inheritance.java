package com.jslee.inheritance;

class A{
	int i;
	void m() {
		// h = 789; ����� �ڽ��� �θ𿡰� �޴� ���̱� ������ �ڽ��� ���� ����� �� ����.
		// �׷��� ������ �θ�� �ƹ��͵� ������ �ʴ´�.
	}
}

class B extends A{ // �θ��� �θ��� �ҸӴϵ� �����ϴ�. ������ ������ �����ϴ�.
	int h;
	void method() {
		i = 456; // A(�θ�)�� ������ i�� ���� 456�� ������ �� �ִ�.
		m(); // A(�θ�)�� ������ �ִ� method�� ȣ���� �� �ִ�.		
	}
}

class X extends B //, X ���߻���� �Ұ����ϴ�. �׷��� �������� �θ� ���� �� ����. // X��� Ŭ������ B��� Ŭ������ ��� �޴´�. A�� B�� �θ� �ȴ�. B�� A�� Ȯ��ȴ�.
{
	
}

class C{
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob = new A();
		ob.i = 123;		
	}

}
