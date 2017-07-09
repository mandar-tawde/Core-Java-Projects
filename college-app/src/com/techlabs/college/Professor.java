package com.techlabs.college;

import java.util.Date;

public class Professor extends Person implements SalariedEmployee {

	private double baseSalary;

	public Professor(int id, String address, Date dob, Double baseSalary) {
		super(id, address, dob);
		this.baseSalary = baseSalary;
	}

	@Override
	public double calculateSalary() {
		double salary;
		salary = baseSalary;
		return salary;
	}
}
