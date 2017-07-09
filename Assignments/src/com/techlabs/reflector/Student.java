package com.techlabs.reflector;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -2761141396613584337L;
	private String name;
	private Integer rollNo;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void printInfo() {
		System.out.println("Name    : " + name);
		System.out.println("Roll No : " + rollNo);
	}

	public void printInfo(String promt) {
		System.out.println(promt);
		printInfo();
	}
}