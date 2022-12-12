package com.example.collection.segment3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		
		/*
		System.out.println("===================================");
		
		System.out.println(" a) Print the details of facility with highest production per day. (you have to \r\n"
				+ "add at least 3 days details of each facility after that you have to calculate \r\n"
				+ "average of 3 days on the basis of average you have to print the facility with \r\n"
				+ "highest production.");
		System.out.println(" b) Print detail of facility on the basis of names.");
		System.out.println(" c) Print which facility is producing highest item. ");
		System.out.println(" d) Print production detail of each facility on the basis of production date." );		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any option from list:");
		char option = sc.next().charAt(0);
		
		switch (option) {
		case 'a':
			
			break;
		case 'b':
			optionB();
			break;
		case 'c':
			
			break;
		case 'd':
		    
			break;
			
		default:
			System.out.println("You have entered Wrong option.");
			break;
		}
		*/
		
		optionC();
	}
	
	public static void optionC() {
		
		ProductionFacility[] list = list();
		for(int i =0;i<list.length;i++) {
			//list[i].getItemnames()!=null;
			System.out.println(list[i].getItemnames().length);
		}
		

	}
	
	public static void optionB() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Facility Name:");
		String name = sc.next();
		String facName=name.toLowerCase();
		
		ProductionFacility[] list = list();
		for(int i=0;i<list.length;i++) {
			if(facName.equals(list[i].getPro_facility_name())) {
				list[i].display();
			}	 
		}
	}
	
	public static ProductionFacility[] list() {
		
		String[] items1=new String[4];
		items1[0]="mobile";
		items1[1]="tab";
		items1[2]="laptop";
		items1[3]="desktop";
		LocalDate d1 = LocalDate.of(2021, 05, 01); 
		
		ProductionFacility pf1=new ProductionFacility() ;
		pf1.setPliid(02);
		pf1.setPro_facility_name("Apple");
		pf1.setPro_fa_location("pune");
		pf1.setTotalproduction_perday(1000);
		pf1.setItemnames(items1);
		pf1.setProd_date(d1);
		
		String[] items2=new String[4];
		items2[0]="ovan";
		items2[1]="Tv";
		items2[3]="Refigrater";
		LocalDate d2 = LocalDate.of(2021, 04, 02); 
		
		ProductionFacility pf2=new ProductionFacility() ;
		pf2.setPliid(01);
		pf2.setPro_facility_name("SamSung");
		pf2.setPro_fa_location("mumbai");
		pf2.setTotalproduction_perday(13000);
		pf2.setItemnames(items2);
		pf2.setProd_date(d2);
		
		
		String[] items3=new String[4];
		items3[0]="AC";
		items3[1]="BattryBank";
		LocalDate d3 = LocalDate.of(2021, 03, 03); 
		
		ProductionFacility pf3=new ProductionFacility() ;
		pf3.setPliid(03);
		pf3.setPro_facility_name("Mi");
		pf3.setPro_fa_location("Bangalore");
		pf3.setTotalproduction_perday(17000);
		pf3.setItemnames(items3);
		pf3.setProd_date(d3);
		
		ProductionFacility[] pfArr=new ProductionFacility[3];
		pfArr[0]=pf1;
		pfArr[1]=pf2;
		pfArr[2]=pf3;
		
		return pfArr;

	}
}
