package com.example.oops.q10;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Product p1=new Product(1,"Milk",35.00,"liter");
		
		Product p2=(Product)p1.clone();
		p2.pName="water";
		p2.price=10.00;
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}
}
