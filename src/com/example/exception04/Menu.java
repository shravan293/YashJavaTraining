package com.example.exception04;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How many item do you want?Enter here:");
		int totalItem = sc.nextInt();
		
		Item[] itemList=new Item[totalItem];
		
		for(int i=0;i<itemList.length;i++) {
			
			
			System.out.println("Enter Item Name:");
			String n = sc.next();
			System.out.println("Enter Item Price:");
			long p = sc.nextLong();
			System.out.println("Enter max no item:");
			int m = sc.nextInt();
			
			itemList[i].setName(n);
			itemList[i].setPrice(p);
			itemList[i].setMaxNoItem(m);
			
			
		}
		
		System.out.println("================================================");
		
		for(int i=0;i<itemList.length;i++) {
			System.out.println(itemList[i].getName());
		}
		
		itemList[1]=new Item("laptop",50000,1);
		itemList[2]=new Item("wireless mouse",30000,3);
		

		
		
		
	}
}
