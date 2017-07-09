package com.techlabs.typesafe.exeption;

public class Calculator {

	public int add(int number1, int number2) throws Exception {
		if (number1 >= 0 && number2 >= 0)
			return number1 + number2;
		throw (new Exception("Negative numbers not allowed"));
	}

}
