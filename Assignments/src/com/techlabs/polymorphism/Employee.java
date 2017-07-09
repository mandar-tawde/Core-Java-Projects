package com.techlabs.polymorphism;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Employee {
	private final String employeeNumber;
	private final String name;
	private final Date joiningDate;
	protected final double basicSalary;

	public Employee(String employeeNumber, String name, Date joiningDate,
			Double basicSalary) {
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.joiningDate = joiningDate;
		this.basicSalary = basicSalary;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public String getName() {
		return name;
	}

	public String getJoiningDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(joiningDate);
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public int getTenure() throws ParseException {
		int tenure = 0;
		Calendar joiningCalender = Calendar.getInstance();
		Calendar currentCalender = Calendar.getInstance();
		joiningCalender.setTime(joiningDate);
		int month = currentCalender.get(Calendar.MONTH)
				- joiningCalender.get(Calendar.MONTH);
		int year = currentCalender.get(Calendar.YEAR)
				- joiningCalender.get(Calendar.YEAR);
		int day = currentCalender.get(Calendar.DAY_OF_MONTH)
				- joiningCalender.get(Calendar.DAY_OF_MONTH);
		if (year > 1) {
			tenure = year - 1;
			year = 1;
		}
		if (year == 1) {
			if (month >= 1) {
				tenure += 1;
			}
			if (month == 0) {
				if (day >= 0)
					tenure += 1;
			}
		}
		return tenure;
	}

	public abstract double calculateSalary();
}
