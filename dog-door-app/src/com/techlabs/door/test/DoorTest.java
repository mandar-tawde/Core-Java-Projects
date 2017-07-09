package com.techlabs.door.test;

import com.techlabs.door.BarkRecognizer;
import com.techlabs.door.Door;
import com.techlabs.door.RemoteControll;

public class DoorTest {
	public static void main(String[] args) {
		Door door = new Door();
		RemoteControll remoteControll = new RemoteControll(door);
		BarkRecognizer barkRecognizer = new BarkRecognizer(door);
		
		System.out.println("Dog is barking");
		remoteControll.buttonPressed();
		
		
		try {
			Thread.currentThread();
			Thread.sleep(6000);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Dog is barking");
		barkRecognizer.recognizeBark();
	}
}
