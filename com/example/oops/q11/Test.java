package com.example.oops.q11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {

	public static void main(String[] args) throws ParseException {
				
	    String sDate1="31/12/1998";  
	    Date dob1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    
		Employee e1=new Employee(1,"lokesh",30000,"jaipur",dob1,dob1);
		System.out.println(e1);
		


	}

}
