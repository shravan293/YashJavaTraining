package com.example.exception05;

import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		
//		int normalBooking=0;
//		int tatkalBooking=0;
//		
//		if(normalBooking<6) {
//			
//		}else if(tatkalBooking<4){
//			
//		}else {
//			
//		}
		
		
		
		String small="";
		String capital="";
		String digit="";
		String special="";
		
		String pwd="SK123@";
		char[] charArray = pwd.toCharArray();
		int length = charArray.length;
		
		System.out.println(length);
		
		for(int i = 0; i <= 255; i++)  
		{  
			if(i>=65 && i<=90) {
				System.out.println(" The ASCII value of " + (char)i + "  =  " + i); 
			}else if(i>=97 && i<=122) {
				System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
			}else {
				
			}
		
		}
		
		
	}
	
	
	
	
	

	


	


}
