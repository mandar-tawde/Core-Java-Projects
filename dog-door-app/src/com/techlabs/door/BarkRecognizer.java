package com.techlabs.door;

public class BarkRecognizer {
	private final Door door;

	public BarkRecognizer(Door door) {
		this.door = door;
	}

	public void recognizeBark() {
		System.out.println("Bark is recognized");
		door.open();
	}
}
