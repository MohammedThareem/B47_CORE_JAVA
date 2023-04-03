package com.tns.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name, city;
		int id;
		System.out.println("enter customer name");
		name = sc.nextLine();

		System.out.println("enter customer id");
		id = sc.nextInt();

		System.out.println("enter customer city");
		city = sc.next();
		sc.nextLine();

		Customer ob = new Customer();
		ob.setCustomerId(id);
		ob.setCustomerName(name);
		ob.setCustomerCity(city);
		System.out.println(name + " " + id + " " + city);

		// Parameterized constructor
		Customer ob1 = new Customer("abc", 123, "blore");
		System.out.println(ob1);

	}
}
