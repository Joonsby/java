package com.lymin.condition;

public class WhileBreak {
	public static void main(String[] args) {
		int count = 0;
		
		while(true) {
			System.out.println(count);
			count++;
			
			if(count == 10) {
				break;
			}
		}
		System.out.println("while is break......");
		
	}

}


