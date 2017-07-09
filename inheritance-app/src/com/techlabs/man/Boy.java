package com.techlabs.man;

public class Boy extends Man {

	public Boy() {
		System.out.println("Boy is created");
	}

	public void eat() {
		System.out.println("Boy is eating");
	}

	@Override
	public void play() {
		System.out.println("Boy is playing");
	}
}
