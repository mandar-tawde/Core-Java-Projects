package com.techlabs.singleton.lazy_initialization;

public class Person {

	private String name;
	private String address;

	private static Person person;

	private Person() {
	}

	public static Person getInstance() {
		if (person == null)
			person = new Person();
		return person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " " + address;
	}
}
