package com.lymin.classes;

public class Tv {
	String company = "";
	String yymmdd = "";
	String name = "";
	String color = "";
	
	public Tv() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Tv default constructor is call.");
	}

	public Tv(String company) {
		super();
		this.company = company;
		System.out.println("Tv constructor param1 is call.");
	}

	public Tv(String company, String yymmdd) {
		super();
		this.company = company;
		this.yymmdd = yymmdd;
		System.out.println("Tv constructor param2 is call.");
	}

	public Tv(String company, String yymmdd, String name) {
		super();
		this.company = company;
		this.yymmdd = yymmdd;
		this.name = name;
		System.out.println("Tv constructor param3 is call.");
	}

	public Tv(String company, String yymmdd, String name, String color) {
		super();
		this.company = company;
		this.yymmdd = yymmdd;
		this.name = name;
		this.color = color;
		System.out.println("Tv constructor param4 is call.");
	}
	

}
