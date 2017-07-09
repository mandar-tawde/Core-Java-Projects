package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;
	private GenderType gender;
	private static int counter;

	static {
		counter = 100;
		System.out.println("Inside static block");
	}

	public Player(int pID, String pName, int pAge, GenderType pGender) {
		id = pID;
		name = pName;
		if (age >= 0)
			age = pAge;
		gender = pGender;
		counter += 1;
		System.out.println("Inside constructor");
	}

	public Player(int pID, String pName, GenderType pGender) {
		this(pID, pName, 18, pGender);
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderType getGender() {
		return gender;
	}

	public Player whoIsElder(Player anotherPlayer) {
		return age < anotherPlayer.age ? anotherPlayer : this;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		String string;
		string = "ID     : " + id + "\nName   : " + name + "\nAge    : " + age
				+ "\nGender : " + gender + "\nType   : " + super.toString();

		return string;
	}
}
