package com.techlabs.door;

import java.util.Timer;
import java.util.TimerTask;

public class Door {
	private boolean open;

	public Door() {
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

	public void open() {
		System.out.println("The Door opens");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("The Door closes");
		open = false;
	}

}
