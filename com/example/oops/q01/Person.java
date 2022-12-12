package com.example.oops.q01;

import java.time.LocalDate;

public class Person {

	private Integer pId;
	private String pName;
	private String pAddress;
	private LocalDate dob;

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
