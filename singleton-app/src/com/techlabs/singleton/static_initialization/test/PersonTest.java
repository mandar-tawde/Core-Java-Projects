package com.techlabs.singleton.static_initialization.test;

import com.techlabs.singleton.static_initialization.Person;

public class PersonTest {

	public static void main(String[] args) {

		// Person person = new Person();

		Person person1 = Person.getInstance();

		person1.setName("Mandar");
		person1.setAddress("Mumbai");

		System.out.println(person1);

		@SuppressWarnings("unused")
		Person person2 = Person.getInstance();

		person1.setName("Pankaj");
		person1.setAddress("Mumbai");

		System.out.println(person1);
	}

}
