package com.jslee.inheritance;

class Car{ // class Car ����
	/*
	private : Ŭ���� �ȿ����� ��� ������ ��ɾ��̴�(����). ��� X
	public�� ������Ʈ ������ ��𼭳� ����� �����ϴ�(����).
	protected : ���������� ����� �����ϴ�. �ڽ��� publicó�� ����� �����ϴ�.
	*/
	String carname; // ���ڿ� carname ����
	private int i; // Ŭ���� �ȿ����� ��밡��
	protected int j; // ��ӹ��� �ڽĸ� ��밡��
	public int cost; // ������ cost ����
	void printAttributes() { // printAttributes method ����
		System.out.println("carname = " + carname + "\t cost = " + cost); // carname�� ���� cost�� ���� ����Ѵ�.
		// System.out.println(" Audi a = " + a); -> �θ� �ڽ��� ������ ����� �� ���� ������ ������ ���.
	}
}

class Benz extends Car{ // Car Ŭ������ ��� ����
	public Benz() { // ������ ����
		carname = "Benz"; // carname�� "Benz" ����
		cost = 10000; // cost�� 10000 ����
		// i = 123; private�̱� ������ Car Ŭ���� �ۿ��� ����� �� ����.
		j = 10; // protected�̱� ������ ��ӹ��� �ڽĸ� ����� �� �ְ� �������� ����� �� ����.
	}
}

class Audi extends Car{ // Car Ŭ������ ��� ����	
	public Audi() {// ������ ����
		carname = "Audi"; // carname�� "Audi" ����
		cost = 7000; // cost�� 7000 ����
	}
}

class Bmw extends Car{ // Car Ŭ������ ��� ����
	int a = 10;
	public Bmw() { // ������ ����
		carname = "Bmw"; // carname�� "Bmw" ����
		cost = 8000; // cost�� 8000����
	}
}

public class Inhertance2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car(); // Car Ŭ���� ��ü ����
		Benz benz = new Benz(); // Benz Ŭ���� ��ü ����
		Audi audi = new Audi(); // Audi Ŭ���� ��ü ����
		Bmw bmw = new Bmw(); // Bmw Ŭ���� ��ü ����
		
		c.printAttributes(); // CarŬ���� �ȿ� �ִ� printAttributes() ���
		// c.i = 123;
		benz.printAttributes(); // Car�� ��� ���� benz�� ������ ���� ���Ѽ� ������ ���
		audi.printAttributes(); // Car�� ��� ���� audi�� ������ ���� ���Ѽ� ������ ���
		bmw.printAttributes(); // Car�� ��� ���� bmw�� ������ ���� ���Ѽ� ������ ���
	}

}
