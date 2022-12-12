package com.example.exception10;

public class Parent {

	public void maxFromList(int[] arr){
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("Max No: "+max);
		
		
		
		try {
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
