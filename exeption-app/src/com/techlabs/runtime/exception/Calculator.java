package com.techlabs.runtime.exception;

public class Calculator {
	public int add(int number1, int number2) {
		if (number1 >= 0 && number2 >= 0)
			return number1 + number2;
		throw (new RuntimeException("No negatives"));
	}
}
