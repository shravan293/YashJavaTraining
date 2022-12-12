package com.example.oops.q01;

public class Answer1 {

	public static void main(String[] args) {

		Department[] depArr=new Department[3];
		
		depArr[0]=new Department(123,"devlopment");		
		depArr[1]=new Department(456,"testing");
		depArr[2]=new Department(789,"support");
		
		Employee e1=new Employee();
		e1.setSalary(10000.00);
		e1.setDateOfJoining("2017-09-08");
		e1.setBaseLocation("magarpatta,pune");
		e1.setDeptObj(depArr[1]);
		e1.setContactNo((long) 902809922);
		e1.setEmailId("abc@gmail.com");
		System.out.println("Employee Details:-"+e1);
		System.out.println("========================================================================");
		Customer c1=new Customer();
		c1.setDateOfRegistration("2022-10-19");
		c1.setDeliveryAddress("aundh");
		c1.setContactno((long) 903293232);
		c1.setEmailId("xyz@gmail.com");
		System.out.println("Customer Details:-"+c1);
		
		c1.setpAddress("Aundh");
		System.out.println(c1.getpAddress());
		
		

		
	}

}
