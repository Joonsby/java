package com.jslee.inheritance;

class Base{ // class Base ����
	protected int x; // �ڽĿ��Ը� ��ӵǰ� Ŭ���� �ȿ����� ����� �� �ִ� int x ����
	// this�� Ŭ������ ������ �ִ� �ڽ��� ���� �ǹ��Ѵ�.
	
	Base(){ // ������ ����
		this.x = 0; // Ŭ���� �ȿ� �ִ� x���� 0 ���� 
	}	
	Base(int x){ // ������ �����ε�
		this.x = x; // Ŭ���� �ȿ� �ִ� x���� �Ű������� ���� �����ϰڴٴ� ���̴�.
	}
	void print() { // print method ����
		System.out.println("Base.x = " + x); // x�� ���
	}
}

class Derived extends Base{ // class Derived ���� Base�κ��� ��� ����
	int x; // int x ����
	
	Derived(int x1, int x2){ // int �Ű����� �ΰ��� ���� method Derived ���� 
		// super();�� �׻� �����ϰ� �ִ�. �ڽ� Ŭ������ �θ� Ŭ������ �ݵ�� ȣ���ؾ� �Ѵ�.
		super.x = x1; // class Base(�θ�)�� �ִ� x���� x1 ����
		this.x = x2; // class Derived(�ڽ�)�� �ִ� x���� x2 ����
	}
	void printSub() { // method printSub ����
		super.print(); // Base(�θ�)�� �ִ� method print ȣ�� // super�� ������ ���������� �Ҽ��� ������ ���� super�� ǥ���ߴ�.
		System.out.println("Derived.x = " + x); // x�� ���
	}
}



public class SuperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base a = new Base(10); // Base class ��ü ����, x ���� 10 ����
		System.out.println("-- a --");
		a.print(); // Base�� �ִ� method print ���
		
		Derived b = new Derived(20, 30); // class Derived ��ü ����, x1�� x2�� ���� 20,30 ����
		System.out.println("-- b --");
		b.printSub(); // Derived�� �ִ� method printSub ���
		// b.print();������ ��ӹ��� �θ��� Ŭ������ ��� �ڽ��� ���̱� ������ �θ��� method print�� ����ϴ� ���� �����ϴ�.
		
		Base c = new Derived(1,2); // �θ��� ũ�Ⱑ �ڽĺ��� ũ�� ������ �θ��� �ָӴϿ� �ڽ� Ŭ������ ��� �͵� �����ϴ�.

	}

}
