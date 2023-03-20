package com.tns.packageone;

public class Executor {

	public static void main(String[] args) {
		Base b=new Base();
		b.methodDefault();
		b.methodPublic();
		//b.methodPrivate();//cannot be accessed outside the class
		b.methodProtected();
		
		b.varDefault=23;
		b.methodDefault();
		
		System.out.println(b instanceof Base);
		
	}

}
