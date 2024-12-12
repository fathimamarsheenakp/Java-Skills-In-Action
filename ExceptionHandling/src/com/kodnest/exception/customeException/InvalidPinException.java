package com.kodnest.exception.customeException;

public class InvalidPinException extends Exception {
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid pin, please try again";
	}
}
