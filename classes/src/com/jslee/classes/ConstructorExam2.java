package com.jslee.classes;
class CExam{ // class CExam ����
	String hak; 
	String name;
	int jum;
	
	CExam(){ // class CExam �ȿ� ������ �̸��� CExam ������ ����
		hak = "213";
		name = "java";
		jum = 90;		
	}
	CExam(String con_hak) { // ������ CExam�� ������ �̸��� Method �����ε� // ������ �Ű����� 1��
		hak = con_hak;
		name = "babo";
		jum = 80;
	}
	CExam(String con_hak, String con_name){ // ������ CExam�� ������ �̸��� Method �����ε� // ������ �Ű����� 2��
		hak = con_hak;
		name = con_name;
		jum = 95;
	}
	void show() { // ���� �޼ҵ��� ��ü���� ����ϱ� ���� �޼ҵ� ����
		System.out.println(hak + " " + name + " " + jum);
	}
}

public class ConstructorExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CExam c1 = new CExam(); // ��ü ���� , ù��° ������ ȣ��
		CExam c2 = new CExam("1234567"); // ��ü ���� , �ι�° ������ ȣ��
		CExam c3 = new CExam("987654","goo"); // ��ü ���� , ����° ������ ȣ��
		System.out.println("�ڹ��� ������");
		c1.show(); 
		c2.show();
		c3.show();
		// ������ �������� ����ϱ� ���� show method�� �ٿ��� ���
	}

}
