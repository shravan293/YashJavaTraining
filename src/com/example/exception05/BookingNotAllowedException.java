package com.example.exception05;

public class BookingNotAllowedException extends Exception {

	String msg;

	public BookingNotAllowedException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "BookingNotAllowedException [msg=" + msg + "]";
	}

}
