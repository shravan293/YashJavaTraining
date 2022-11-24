package com.example.oops.q01;

import java.time.LocalDate;

public class Person {

	protected Integer pId;
	protected String pName;
	protected String pAddress;
	protected LocalDate dob;

	public Person() {
		super();
	}

	public Person(Integer pId, String pName, String pAddress, LocalDate dob) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAddress = pAddress;
		this.dob = dob;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpAddress() {
		return pAddress;
	}

	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public String getDob() {
		return dob.toString();
	}

	public void setDob(String dob) {
		this.dob =LocalDate.parse(dob);
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pAddress=" + pAddress + ", dob=" + dob + "]";
	}

}
