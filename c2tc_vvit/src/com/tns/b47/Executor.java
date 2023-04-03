package com.tns.b47;
import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarClass ob=new CarClass();
		ob.backward();
		ob.forward();
		ob.stop();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter");
		int reg = sc.nextInt();
		System.out.println(reg);
	}

}

