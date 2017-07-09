package com.techlabs.typesafe.test;

import com.techlabs.typesafe.exeption.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		try {
			System.out.println(calculator.add(-2, 3));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
