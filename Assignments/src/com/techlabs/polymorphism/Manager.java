package com.techlabs.polymorphism;

import java.util.Date;

public class Manager extends Employee {
	private double hra;
	private double da;
	private double ta;

	public Manager(String employeeNumber, String name, Date joiningDate,
			Double basicSalary) {
		super(employeeNumber, name, joiningDate, basicSalary);
		hra = this.basicSalary / 2;
		da = this.basicSalary * 2 / 5;
		ta = this.basicSalary * 3 / 10;
	}

	@Override
	public double calculateSalary() {
		return this.basicSalary + hra + da + ta;
	}

}
