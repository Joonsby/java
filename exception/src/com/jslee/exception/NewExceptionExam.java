package com.jslee.exception;

import java.util.Random;

class Under18Exception extends Exception{
	public Under18Exception() {
		System.out.println("18�� �̸��� ����!");
	}
}


// �����ڰ� ������ ���ܸ� ���Ӱ� ��������
class AdultOnlyShop{
	public void enterTheshop(int age) throws Under18Exception{ // Under18Exception�޼ҵ��� ��� ������ try�Ѵ�.
		if(age >= 18) {
			System.out.println("AdultOnlyShop");
		} else {
			throw new Under18Exception(); // ������ age�� 18 ���ϸ� ���ܸ� �߻���Ų��.
		}
	}
}

public class NewExceptionExam{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdultOnlyShop en = new AdultOnlyShop();
		Random rnd = new Random();
		System.out.println("AdultOnlyShop");
		for (int i = 0; i < 10; i++) {
			int age = rnd.nextInt(55) + 1;
			System.out.println("================== ����" + (i + 1) + " ");
			System.out.println("�մ��� ���̴� [" + age + "] �Դϴ�.");
			try {
				en.enterTheshop(age);
			} catch(Under18Exception e) {
				System.out.println(e);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	

}
