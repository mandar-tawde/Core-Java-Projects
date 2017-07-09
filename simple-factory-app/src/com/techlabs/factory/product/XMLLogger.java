package com.techlabs.factory.product;

public class XMLLogger implements ILogger {

	public void log(String message) {
		System.out.println("XML logging :- " + message);
		;
	}
}
