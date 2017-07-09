package com.techlabs.door;

public class RemoteControll {
	private final Door door;

	public RemoteControll(Door door) {
		this.door = door;
	}

	public void buttonPressed() {
		System.out.println("Button is pressed");
		if (door.isOpen())
			door.close();
		else
			door.open();
	}
}
