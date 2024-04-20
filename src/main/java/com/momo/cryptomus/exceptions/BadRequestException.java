package com.momo.cryptomus.exceptions;

public class BadRequestException extends RuntimeException {

	public BadRequestException(String response) {
		super(response);
	}

}
