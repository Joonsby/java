package com.jslee.inheritance;

// Overloading�� �ϳ��� Ŭ���� �ȿ��� �Ͼ�� ���̰�
// Overriding�� ����� �������� �����Ǹ� �ϸ鼭 �Ͼ�� ���̴�.

class Overriding01{
	void m() {}
	void m(int i) {}
	void mm() {
		System.out.println(" �θ� Ŭ���� mm()");
	}
}
class Overriding02 extends Overriding01{
	// Overriding : �θ� ������ �ִ� �޼ҵ带 �ڽ��� ���ϴ� ���·� ���Ӱ� �����ؼ� ��� �ϴ°�
	// �����Ǵ� returnType�� ������ ����, method�̸�, �Ű������� ������ ���ƾ� �ϰ� ���� ��ɸ� �ٸ��� �ȴ�.
	// �����Ǹ� �Ϸ��� method�� �����ϰ� ���븸 �ٲٸ� �ȴ�.
	// Overloading : �̸�����, return ��� ����, �Ű����� �ٸ�
	void m() { // void m�� ������ �Ѱ��̴�.
		System.out.println(" �ڽ� Ŭ���� mm()");		
	}	
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding02 ob = new Overriding02();
		ob.m();
		ob.m(100);
		
	}

}
