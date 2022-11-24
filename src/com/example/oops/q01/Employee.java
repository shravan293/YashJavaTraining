package com.example.oops.q01;

import java.time.LocalDate;

public class Employee extends Person {

	private Double salary;
	private LocalDate dateOfJoining;
	private String baseLocation;
	private Department deptObj;
	private Long contactNo;
	private String emailId;

	public Employee() {
		super();
	}

	public Employee(Integer pId, String pName, String pAddress, LocalDate dob) {
		super(pId, pName, pAddress, dob);
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDateOfJoining() {
		return dateOfJoining.toString();
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = LocalDate.parse(dateOfJoining);
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public Department getDeptObj() {
		return deptObj;
	}

	public void setDeptObj(Department deptObj) {
		this.deptObj = deptObj;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dateOfJoining=" + dateOfJoining + ", baseLocation=" + baseLocation
				+ "\n deptObj=" + deptObj + ", contactNo=" + contactNo + ", emailId=" + emailId + "]";
	}

}
