package com.example.oops.q03;

public class Test {

	public static void main(String[] args) {

		customerData();
	}
	
	
	public static void customerData() {
		
		Branch b1=new Branch();
		b1.setBranchId(01);
		b1.setBranchName("ICIC Bank");
		b1.setBranchAddress("Navi Mumbai");
//		System.out.println(b1);
		
		Branch b2=new Branch();
		b2.setBranchId(02);
		b2.setBranchName("HDFC Bank");
		b2.setBranchAddress(" Thane");
//		System.out.println(b2);
		System.out.println("=========================================================");
       
		Customer c1=new Customer();
        c1.setCustId(1);
        c1.setAccountNo("121212");
        c1.setCustname("Akash");
        c1.setCust_address("Pune");
        c1.setCustDob("1998-03-03");
        c1.setCustAccOpeningDate("2021-08-02");
        c1.setBranchObj(b1);
       // System.out.println(c1);
        
        Customer c2=new Customer();
        c2.setCustId(21);
        c2.setAccountNo("13413232");
        c2.setCustname("Arun");
        c2.setCust_address("Mumbai");
        c2.setCustDob("1995-05-05");
        c2.setCustAccOpeningDate("2022-10-30");
        c2.setBranchObj(b2);
        //System.out.println(c2);
        
        Customer c3=new Customer();
        c3.setCustId(23);
        c3.setAccountNo("1233342");
        c3.setCustname("akshay");
        c3.setCust_address("Nagpur");
        c3.setCustDob("2000-09-09");
        c3.setCustAccOpeningDate("2019-10-10");
        c3.setBranchObj(b1);
        System.out.println(c3);
        
		System.out.println("=========================================================");
        CustomerAccountStatement cas1=new CustomerAccountStatement();
        cas1.setCAID(1122);
        cas1.setCustId(23);
        cas1.setAmount(10000.00);
        cas1.setDepositWithdrawl(7000.00);
        cas1.setDepositDate("2022-09-10");
        System.out.println(cas1);
        
        CustomerAccountStatement cas2=new CustomerAccountStatement();
        cas2.setCAID(1211);
        cas2.setCustId(23);
        cas2.setAmount(15000.00);
        cas2.setDepositWithdrawl(2000.00);
        cas2.setDepositDate("2022-09-15");
        System.out.println(cas2);
        
        CustomerAccountStatement cas3=new CustomerAccountStatement();
        cas3.setCAID(3512);
        cas3.setCustId(23);
        cas3.setAmount(3500.00);
        cas3.setDepositWithdrawl(2000.00);
        cas3.setDepositDate("2022-09-10");
        System.out.println(cas3);
        
		System.out.println("=========================================================");
        
	}

}
