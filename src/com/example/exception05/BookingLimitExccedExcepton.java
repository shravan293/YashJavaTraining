package com.example.exception05;

public class BookingLimitExccedExcepton extends Exception {

	String msg;

	public BookingLimitExccedExcepton(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "BookingLimitExccedExcepton [msg=" + msg + "]";
	}

}
