package com.tns.superkeyword;

public class TestParent {
	void test() {
		System.out.println("this is a parent class");
	}

}
class TestChild extends TestParent {
	void test() {
		System.out.println("this is a child class");
		
	}
void display() {
	test();
	super.test();
}
}