package com.tns.nestedtry;

import java.util.Scanner;

public class NestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter value of x and y");
		int x=ob.nextInt();
		int y=ob.nextInt();
		System.out.println("value of x="+x+"\n"+"value of y="+y);
		
		NestedTry obj=new NestedTry();
		obj.nestedtry(x, y);


}
}
