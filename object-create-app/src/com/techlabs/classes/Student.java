package com.techlabs.classes;

import java.io.Serializable;

public class Student implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private String studentName;
	private String studentID;
	private String address;
	private int standard;

	public Student(String studentName, String studentID, String address,
			int standard) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.address = address;
		this.standard = standard;
	}

	public Student() {
		this("name", "ID", "address", 0);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	@Override
	public String toString() {
		return studentID + " " + studentName + " " + address + " " + standard;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
