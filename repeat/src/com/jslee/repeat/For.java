package com.jslee.repeat;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*		
		for���� �ݺ� Ƚ���� ������ �ִ�.
			//���� 	//���� 	//��ȭ��
		for(�ʱⰪ; ���ǽ�(������); ������){
		 ���๮��;		 
		}		
		*/
		int num;
		for (num = 1; num <= 100; num=num+2) {
			System.out.println("���");
		}
		
		int su;
		int t = 0;
		for(su = 1; su <= 100; su++) {
			t = t + su;
			/* 0 = 0 + 1
			   1 = 1 + 2
			   3 = 3 + 3
			   6 = 6 + 4  
			 */
		}		
		System.out.println("1~100 �հ�:" + t);
	}

}
