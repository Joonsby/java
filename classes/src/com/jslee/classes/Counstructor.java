package com.jslee.classes;

/*
������
1.Ŭ���� ��� ������ �̸��� �޼ҵ��̴�.
2.��ü�� ������ �Ǹ� �ڵ����� ȣ���� �ȴ�. �ڵ� ȣ�� �Ǵ� �� �ٸ� �޼ҵ�� ���� �޼ҵ��̴�. �����ڰ� ������ �ڵ� ȣ���� ���� ���� ����.
3.�����ڴ� returnType�� �ڸ��� �ƿ� ����. �׷��� return�� �ƿ� �������� �ʴ´�.
4.�ѹ� �ۿ� ȣ���� �ȵǱ� ������ ob.Exam()���� ȣ���� ���� ����.
5.�Ű����� ó���� �����ϴ�.
*/

class Exam{
	int i;
	Exam(int k){
		System.out.println("������");
	}
	void method(String s) {
		System.out.println("�޼ҵ�");
	}
}

public class Counstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Exam ob = new Exam(200); // Exam Ŭ������ ��ü ������ ������ȣ���� ���ÿ� �ϰ� �ִ� ���̴�.
		// ob.Exam(); -> error
		ob.method("aaa");
	}
}
