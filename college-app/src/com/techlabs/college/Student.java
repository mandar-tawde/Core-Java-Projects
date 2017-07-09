package com.techlabs.college;

import java.util.Date;

public class Student extends Person {

	private final Branch branch;

	public Student(int id, String address, Date dob, Branch branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public Branch getBranch() {
		return branch;
	}

}
