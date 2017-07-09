package com.techlabs.moveable.test;

import com.techlabs.moveable.IMoveable;

public class MoveableTest {

	public static void main(String[] args) {
		// Truck truck = new Truck();
		// Car car = new Car();
		// Bike bike = new Bike();
		IMoveable[] moveables = { new IMoveable() {

			@Override
			public void move() {
				System.out.println("BMW is moving");
			}
		}, new IMoveable() {

			@Override
			public void move() {
				System.out.println("Harley is moving");
			}
		}, new IMoveable() {

			@Override
			public void move() {
				System.out.println("Lamborgini is moving");
			}
		} };
		startRace(moveables);
	}

	public static void startRace(IMoveable[] moveables) {
		System.out.println("Race Started");
		for (IMoveable moveable : moveables) {
			moveable.move();
		}
		System.out.println("Race ended");
	}
}
