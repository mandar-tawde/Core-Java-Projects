package com.techlabs.polymorphism;

import java.util.Date;

public class Programmer extends Employee {

	private double perks;

	public Programmer(String employeeNumber, String name, Date joiningDate,
			Double basicSalary) {
		super(employeeNumber, name, joiningDate, basicSalary);
		perks = this.basicSalary * 3 / 10;
	}

	@Override
	public double calculateSalary() {
		return this.basicSalary + perks;
	}

}
