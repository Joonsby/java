package com.lymin.javaapi;

public class ObjectEqualsTest {
	public static void main(String[] args) {
		Customer customer1 = new Customer("ssuni");
		Customer customer2 = new Customer("ssuni");

		if (customer1.equals(customer2)) {
			System.out.println("object equals true");
		} else {
			System.out.println("object equals false");
		}

		if (customer1.name.equals(customer2.name)) {
			System.out.println("name value equals true");
		} else {
			System.out.println("name value equals false");
		}
		
	}

}
