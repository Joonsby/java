package com.jslee.exception;

public class ExceptionExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int)(Math.random()*3)+1;
		System.out.println("���� = " + i);
		if(i == 3) {
			try {
				throw new Exception(); // ������ ���ܸ� �߻� ��Ų��.
			} catch (Exception e) {
				System.out.println(e + "=> �߻�");
			}
		} else {
			System.out.println("�ùٸ� �����Դϴ�.");
		}
		System.out.println("**end**");
	}

}
