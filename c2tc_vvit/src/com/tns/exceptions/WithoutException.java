package com.tns.exceptions;

public class WithoutException {

	public static void main(String[] args) {
		
		/*int d=0;
		try {
			int a=4/d;//exception occured here
			System.out.println("sorry i cant work");

		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		System.out.println("this will be printed");
	}*/
		String str= null;
		try {
			str.equals("hell");
		}
		catch(NullPointerException e) {
			System.out.println("null pointer exception");
		}
	}
}
