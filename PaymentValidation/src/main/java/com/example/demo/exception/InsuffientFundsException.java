package com.example.demo.exception;

public class InsuffientFundsException extends RuntimeException{

	public InsuffientFundsException(String message) {
		super(message);
	}
}
