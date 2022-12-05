package com.example.exception09;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int totalCollar=10;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Collar Size:");
		int collarSize= sc.nextInt();
		
		float deviation=(float) ((collarSize/100.0)*2)+collarSize;
		
		System.out.println(deviation);
	}
}
