package com.example.exception10;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,5,4,5,10,17,9,31,3};
		Parent p=new Parent();
		p.maxFromList(arr);
		
		System.out.println("===================================");
		
		Parent pc=new Child();
		pc.maxFromList(arr);
		
	}

}
