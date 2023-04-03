package com.tns.b47;

public class CarClass {
	int model;
	int reg;
	String color;
	
	//constructor
	CarClass(){
		System.out.println("Model" + model+"reg"+reg );
	}

void forward(){
	System.out.println("Car is moving forward");
}
void backward(){
	System.out.println("Car is moving backward");
}
void stop(){
	System.out.println("Car has stoped moving");
}
}