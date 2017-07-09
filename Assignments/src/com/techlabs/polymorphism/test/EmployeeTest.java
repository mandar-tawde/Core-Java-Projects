package com.techlabs.polymorphism.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.techlabs.polymorphism.Employee;
import com.techlabs.polymorphism.Manager;
import com.techlabs.polymorphism.Programmer;

public class EmployeeTest {

	public static void main(String[] args) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Manager m = new Manager("M010", "Mandar Tawde",
					dateFormat.parse("02/04/2016"), 30000d);
			Programmer p = new Programmer("P101", "Pankaj Pan",
					dateFormat.parse("01/10/2016"), 10000d);
			generateSalarySlip(m);
			System.out.println();
			generateSalarySlip(p);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void generateSalarySlip(Employee e) {
		System.out.println("Name of the Employee :- " + e.getName());
		System.out.println("Employee Number      :- " + e.getEmployeeNumber());
		System.out.println("Date of joining      :- " + e.getJoiningDate());
		try {
			System.out.println("Tenure of Employee   :- " + e.getTenure()
					+ " Years");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		System.out.println("Total Salary in Rs   :- " + e.calculateSalary());
	}
}
