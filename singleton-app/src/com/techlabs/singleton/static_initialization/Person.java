package com.techlabs.singleton.static_initialization;

public class Person {

	private String name;
	private String address;

	private static Person person;

	private Person() {
	}

	static {
		try {
			person = new Person();
		} catch (Exception exception) {
			throw new RuntimeException(
					"Exception occured in static block initialization");
		}
	}

	public static Person getInstance() {
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
