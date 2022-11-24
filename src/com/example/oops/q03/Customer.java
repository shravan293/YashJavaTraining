package com.example.oops.q03;

import java.time.LocalDate;

public class Customer {

	private Integer custId;
	private String accountNo;
	private String custname;
	private String cust_address;
	private LocalDate custDob;
	private LocalDate custAccOpeningDate;
	private Branch branchObj;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer custId, String accountNo, String custname, String cust_address, LocalDate custDob,
			LocalDate custAccOpeningDate, Branch branchObj) {
		super();
		this.custId = custId;
		this.accountNo = accountNo;
		this.custname = custname;
		this.cust_address = cust_address;
		this.custDob = custDob;
		this.custAccOpeningDate = custAccOpeningDate;
		this.branchObj = branchObj;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public String getCustDob() {
		return custDob.toString();
	}

	public void setCustDob(String custDob) {
		this.custDob = LocalDate.parse(custDob);
	}

	public String getCustAccOpeningDate() {
		return custAccOpeningDate.toString();
	}

	public void setCustAccOpeningDate(String custAccOpeningDate) {
		this.custAccOpeningDate = LocalDate.parse(custAccOpeningDate);
	}

	public Branch getBranchObj() {
		return branchObj;
	}

	public void setBranchObj(Branch branchObj) {
		this.branchObj = branchObj;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", accountNo=" + accountNo + ", custname=" + custname + ", cust_address="
				+ cust_address + ", custDob=" + custDob + ", custAccOpeningDate=" + custAccOpeningDate + ", branchObj="
				+ branchObj + "]";
	}

}
