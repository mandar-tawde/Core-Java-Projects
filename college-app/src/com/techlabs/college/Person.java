package com.techlabs.college;

import java.util.Date;

public abstract class Person {
	private final int id;
	private String address;
	private final Date dob;

	public Person(int id, String address, Date dob) {
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	public int getID() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public Date getDOB() {
		return dob;
	}

}
