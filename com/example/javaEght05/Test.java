package com.example.javaEght05;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		missingNumList();
	}
	
	public static void missingNumList() {
		int[] numlist = {1,2,3,4,6,7,8,11,13,14,15,19,20,21};		
		Arrays.sort(numlist);
		int currentVal=1;
		for(int i=0;i<numlist.length;i++) {

			if(numlist[i]!=currentVal) {
				for(int j=currentVal;j<numlist[i];j++) {
					System.out.println("Missing Number: "+j);
				}
			}
			currentVal=numlist[i]+1;
		}
	}
}
