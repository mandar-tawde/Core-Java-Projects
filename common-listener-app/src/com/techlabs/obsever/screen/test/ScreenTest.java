package com.techlabs.obsever.screen.test;

import com.techlabs.obsever.screen.ButtonClickedListener;
import com.techlabs.obsever.screen.Screen;

public class ScreenTest {

	public static void main(String[] args) {

		Screen screen = Screen.getInstance();

		screen.add(new ButtonClickedListener());

		screen.display();
	}
}
