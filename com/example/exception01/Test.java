package com.example.exception01;

public class Test {

	public static void main(String[] args) {
		
		
		StudentResult sr=new StudentResult(10,20,30);
		Student s=new Student(11,"abhi","pune",sr);
		
		System.out.println(s);
		
		
		if(sr.passFail().equals("fail")) {
			System.out.println("failed Ecxeption");
		} 
		
		if(sr.percentage()<40.00) {
			System.out.println("less than 40% Ecxeption");
		}
	}
}
