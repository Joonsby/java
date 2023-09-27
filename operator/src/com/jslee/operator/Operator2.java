package com.jslee.operator;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int j = 2;
		System.out.println("i + j = " + (i + j));
		System.out.println("i - j = " + (i - j));
		System.out.println("i * j =" + (i * j));
		System.out.println("i / j = " + (i / j));
		System.out.println("i % j = " + (i % j));
		System.out.println("i = " + i);

		int k = i++;
		System.out.println("k = " + k);
		System.out.println("i= " + i);

		int p = ++i;
		System.out.println("p = " + i);
		System.out.println("i = " + i);

		int x = 19 + 4 * 3 / 2 - 10 * 2 + 4;
		System.out.println("19 + 4 * 3 / 2 - 10 * 2 + 4 = " + x);
		System.out.println("=======================================");
		
		int a = 10;
		a*= 5;
		System.out.println(a);
	}

}
