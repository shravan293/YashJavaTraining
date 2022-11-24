package com.example.oops.q01;

import java.time.LocalDate;

public class Customer extends Person {

	private LocalDate dateOfRegistration;
	private String deliveryAddress;
	private Long contactno;
	private String emailId;

	public Customer() {
		super();
	}

	public Customer(Integer pId, String pName, String pAddress, LocalDate dob) {
		super(pId, pName, pAddress, dob);
	}

	public String getDateOfRegistration() {
		return dateOfRegistration.toString();
	}

	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = LocalDate.parse(dateOfRegistration);
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Long getContactno() {
		return contactno;
	}

	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Customer [dateOfRegistration=" + dateOfRegistration + ", deliveryAddress=" + deliveryAddress
				+ ", contactno=" + contactno + ", emailId=" + emailId + "]";
	}

}
