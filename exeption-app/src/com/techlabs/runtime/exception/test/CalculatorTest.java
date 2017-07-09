package com.techlabs.runtime.exception.test;

import com.techlabs.runtime.exception.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(-2, 3));
	}
}
