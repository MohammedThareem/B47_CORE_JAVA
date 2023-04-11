package com.tns.vectors;

import java.util.Vector;

public class BasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		
		//adding elements
		v.add("Thareem");
		v.add("Touheed");
		v.add("Musavveer");
		v.add("Izhaar");
		v.add("Aman");
		v.add("Shoaib");
		
		System.out.println(v);
		
		//removing element
		
		v.remove(0);
		
		System.out.println(v);
		
		//size of the vector
		System.out.println(v.size());
		
		//total capacity of vector
		System.out.println(v.capacity());
		
		//copying vector
		System.out.println(v.clone());
		
		//deleting elements in vector
		v.clear();
		System.out.println(v);
	}

}
