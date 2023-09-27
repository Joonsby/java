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
	
	private void bb(int a) throws Exception{ // throws는 메소드 옆에만 붙일 수 있다. throws는 메소드 전체 지역에 try로 묶은것과 동일하다.
		int re = 10/a;
		System.out.println("re = " + re);
		System.out.println("bb 끝");
	}
}
