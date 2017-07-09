package com.techlabs;

public class WelcomeJava {

	public static void main(String[] args) {
		if (args.length > 0) {
			for (String name : args) {
				System.out.println("Hello " + name);
			}
		} else {
			System.out.println("No arguments found");
		}
	}
	
}