package com.lymin.classes;

public class TvConstructorOverloadingTest {
	public static void main(String[] args) {
		Tv tv = new Tv();

		Tv tv2 = new Tv("SAMSUNG");
		Tv tv3 = new Tv("LG", "1999.01.20");
		Tv tv4 = new Tv("ANAM", "2021.01.20", "OLED TV");
		Tv tv5 = new Tv("SAMSUNG", "2021.01.20", "Super OLED TV", "Black");

		System.out.println("tv value is [" + tv.company + "]");
		System.out.println("tv value is [" + tv.yymmdd + "]");
		System.out.println("tv value is [" + tv.name + "]");
		System.out.println("tv value is [" + tv.color + "]");
		System.out.println("----------------------------------");
		System.out.println("tv2 value is [" + tv2.company + "]");
		System.out.println("tv2 value is [" + tv2.yymmdd + "]");
		System.out.println("tv2 value is [" + tv2.name + "]");
		System.out.println("tv2 value is [" + tv2.color + "]");
		System.out.println("----------------------------------");
		System.out.println("tv3 value is [" + tv3.company + "]");
		System.out.println("tv3 value is [" + tv3.yymmdd + "]");
		System.out.println("tv3 value is [" + tv3.name + "]");
		System.out.println("tv3 value is [" + tv3.color + "]");
		System.out.println("----------------------------------");
		System.out.println("tv4 value is [" + tv4.company + "]");
		System.out.println("tv4 value is [" + tv4.yymmdd + "]");
		System.out.println("tv4 value is [" + tv4.name + "]");
		System.out.println("tv4 value is [" + tv4.color + "]");
		System.out.println("----------------------------------");
		System.out.println("tv5 value is [" + tv5.company + "]");
		System.out.println("tv5 value is [" + tv5.yymmdd + "]");
		System.out.println("tv5 value is [" + tv5.name + "]");
		System.out.println("tv5 value is [" + tv5.color + "]");
		System.out.println("----------------------------------");

	}

}
