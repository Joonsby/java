package com.jslee.exception;

public class ThrowsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExam te = new ThrowsExam();
		
		try {
			te.bb(100);
		} catch (Exception e) {
			System.out.println("**End**");
		}
	}
	
	private void bb(int a) throws Exception{ // throws�� �޼ҵ� ������ ���� �� �ִ�. throws�� �޼ҵ� ��ü ������ try�� �����Ͱ� �����ϴ�.
		int re = 10/a;
		System.out.println("re = " + re);
		System.out.println("bb ��");
	}
}
