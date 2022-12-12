package com.example.exception05;

public class NormalTicketBookingException extends Exception {

	String msg;

	public NormalTicketBookingException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "NormalTicketBookingException [msg=" + msg + "]";
	}

}
