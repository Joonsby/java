package com.jslee.Interface;

interface Sung_1 { // �������̽� Sung_1 ����
	void sethakbun(String hakbun); // sethakbun �޼ҵ� ����
	void setname(String name); // setname �޼ҵ� ����
}

interface Sung_2 { // �������̽� Sung_2 ����
	void setjumsu(int jumsu); // setjumsu �޼ҵ� ����
}

interface Sung extends Sung_1, Sung_2 { // 5���� �޼ҵ带 ��� ������ �ؾ��Ѵ�.
	void title(); // title �޼ҵ� ����
	void prt_data(); // prt_data �޼ҵ� ����
}

class Sungjuk implements Sung { // Sung �������̽��� implement
	String hakbun = " ";
	String name = " ";
	int jumsu = 0;

	public void title() { // title �޼ҵ� ������
		System.out.println("*** �������̽�(interface) ��� ***");
		System.out.println("*** �ڹ��� ���� ��� ***");
		System.out.println("**�й�** **����** **����**");
		System.out.println("-----------------------");
	}

	public void sethakbun(String hakbun) { // sethakbun �޼ҵ� ������
		this.hakbun = hakbun;
	}

	public void setname(String name) { // setname �޼ҵ� ������
		this.name = name;
	}

	public void setjumsu(int jumsu) { // setjumsu �޼ҵ� ������
		this.jumsu = jumsu;
	}

	public void prt_data() { // prt_data �޼ҵ� ������
		System.out.println(hakbun + " " + name + " " + jumsu);
	}
}

public class Interface02 extends Sungjuk {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sungjuk ken = new Sungjuk(); // ��ü ����
		ken.sethakbun("2060001");
		ken.setname("Nam");
		ken.setjumsu(60);
		Sungjuk sung = new Sungjuk();
		sung.sethakbun("2060002");
		sung.setname("Mi");
		sung.setjumsu(80);

		ken.title();
		ken.prt_data();
		sung.prt_data();

	}
}
