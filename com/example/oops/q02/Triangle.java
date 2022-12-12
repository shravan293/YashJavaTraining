package com.example.oops.q02;

public class Triangle implements Shape{

	@Override
	public void area() {
		
		int area ;
		int base=0, height=0;
		area=(1/2)*base*height;
		System.out.println("Area of Triangle ="+area);
	}

	
}
