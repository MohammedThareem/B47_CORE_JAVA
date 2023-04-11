package com.tns.sync;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSync s=new MethodSync();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		Thread t3=new Thread(s);
		t1.setName("First Thread");
		t1.setName("Second Thread");
		t1.setName("Third Thread");
		t1.start();
		t2.start();
		t3.start();
	}

}
