package com.tns.packageone;

public class Base {
	//access specifiers for variables
	int varDefault=10;
	public int var=20;
	private int var1=30;
	protected int var2=40;
	
	//access specifiers for methods
	void methodDefault() {
		System.out.println("default access base class");
		System.out.println("default variable"+varDefault);
	}
	public void methodPublic() {
		System.out.println("public access base class");
		System.out.println("public variable"+var);
	}
	
	private void methodPrivate() {
		System.out.println("Private access base class");
		System.out.println("Private variable"+var1);
	}
	
	protected void methodProtected() {
		System.out.println("Protected access base class");
		System.out.println("Protected variable"+var2);
	}
}
