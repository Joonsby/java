package com.jslee.repeat;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*		
		for문은 반복 횟수가 정해져 있다.
			//시작 	//범위 	//변화폭
		for(초기값; 조건식(최종값); 증감식){
		 실행문장;		 
		}		
		*/
		int num;
		for (num = 1; num <= 100; num=num+2) {
			System.out.println("출력");
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
		System.out.println("1~100 합계:" + t);
	}

}
