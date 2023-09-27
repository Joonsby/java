package com.jslee.classes;

public class VaragsExam {
	void aa(int i) {
		System.out.println("aa ȣ���");
	}

	void bb(int...i) { // ...�� ���������̴�. ��� ȣ���ϴ��Ŀ� ���� ���ڰ� ���� �� �ִٴ� ���̴�. type�� �ٲܼ��� ������ �Ű������� ������ ȣ�⿡ ���� ���� �� �ִ�.
		// System.out.println();�� �Ű������� ...�������ڷ� ����Ǿ� �ִ�.
		System.out.println("\n === bbȣ��");
		// System.out.println(i); -> error
		// System.out.println(i[]); -> error
		for (int a : i) { // i�� ������ �ִ� ����ŭ �˾Ƽ� �ݺ��� �� ���̴�.
			System.out.println(a + "\t");
		}
	}

	void cc(String...s) {
		System.out.println("\n === ccȣ��");
		for (String str : s) {
			System.out.println(str + "\t");
		}
	}

	void dd(Object...obj) { // Object�� � ���̵� ������� ������ �� ������ �ִ�. Object�� �� ����� �޸𸮸� maximum���� ��� ������ �޸��� ���� ���� �� �ִ�.
		System.out.println("ddȣ��");
		for(Object ob : obj) {
			System.out.println(ob);
		}
	}

	void ee(int i, String...s) {
		System.out.println("eeȣ��");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VaragsExam ve = new VaragsExam();
		ve.aa(3); // ve.aa("java"); -> ��ȣ���� �Ű������� int���̱� ������ ������ ���.
		
		ve.bb();
		ve.bb(1, 2);
		ve.bb(3, 4, 5);
		
		ve.cc("String");
		ve.cc("String1", "String2");
		
		ve.dd();
		ve.dd(3, 2, "hello", "haha");
		ve.dd(2.5, 'a', "hoho", 7);
		
		ve.ee(2);
		ve.ee(3, "a", "b", "c");
	}

}
