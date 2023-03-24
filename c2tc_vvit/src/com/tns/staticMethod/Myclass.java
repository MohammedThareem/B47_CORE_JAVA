package com.tns.staticMethod;

public class Myclass {
	private int section;
	private static int srNo;
	
	static {
		System.out.println("inside static block");
		srNo=100;
	}
	Myclass(){
		System.out.println("default constructor");
		srNo++;
		section++;
	}
	
	static void display() {
		System.out.println("serial number"+srNo);
	}
}
