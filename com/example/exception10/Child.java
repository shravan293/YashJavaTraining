package com.example.exception10;

public class Child extends Parent{

	public void maxFromList(int[] arr){
		
		int max=arr[0];
		int total = arr.length;
		int avg=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			sum=sum+arr[i];
			avg=sum/total;
		}		
		System.out.println("MaxNo: "+max+" Sum: "+sum+" Avg: "+avg);
		
		try {
			
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
