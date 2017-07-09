package com.techlabs.listeners.screen.test;

import com.techlabs.listeners.screen.EmailActionListener;
import com.techlabs.listeners.screen.SMSActionListener;
import com.techlabs.listeners.screen.Screen;

public class ScreenTest {

	public static void main(String[] args) {

		Screen screen = Screen.getInstance();

		screen.add(new EmailActionListener());
		screen.add(new SMSActionListener());

		screen.display();
	}
}
