package com.example.oops.q08;

public class Test {

	public static void main(String[] args) {
		
		Electornics elect=new Electornics();
		
		Electornics lap=new Laptop();
		lap.id=113;
		lap.semiconductorType="laptop semi";
		lap.dateOfManufacturing="2022-04-23";
	    
		System.out.println("Id:"+lap.id);
		System.out.println("semiconductorType:"+lap.semiconductorType);
		System.out.println("dateOfManufacturing"+lap.dateOfManufacturing);
		System.out.println("=========================================================");
		
		Electornics lcd=new LCD();
		lcd.id=134;
		lcd.semiconductorType="lcd semi";
		lcd.dateOfManufacturing="2022-05-11";
		
		System.out.println("Id:"+lcd.id);
		System.out.println("semiconductorType:"+lcd.semiconductorType);
		System.out.println("dateOfManufacturing"+lcd.dateOfManufacturing);
		System.out.println("=========================================================");
	    
		Electornics mob=new Mobile();
		mob.id=112;
	    mob.semiconductorType="mobile semi";
	    mob.dateOfManufacturing="2021-08-13";
	    
		System.out.println("Id:"+mob.id);
		System.out.println("semiconductorType:"+mob.semiconductorType);
		System.out.println("dateOfManufacturing"+mob.dateOfManufacturing);
		System.out.println("=========================================================");
		
		
	}
}
