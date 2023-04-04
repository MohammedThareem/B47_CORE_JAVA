package com.tns.multithread;

public class Threademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThreadOne t=new CreatingThreadOne();
		t.start();
		t.run();
//		
//		CreatingSecond cs=new CreatingSecond();
//		Thread t=new Thread(cs);
//		t.run();
	}

}
