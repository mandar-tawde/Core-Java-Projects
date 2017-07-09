package com.techlabs.listeners.screen;

import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen {

	private static Screen screen;

	private JFrame frame;
	private JButton button;

	private Screen() {
		frame = new JFrame("Screen");
		frame.setSize(300, 300);
		frame.setResizable(false);
		frame.setLayout(new GridBagLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Notify");
		frame.add(button);
	}

	public static Screen getInstance() {
		if (screen == null)
			screen = new Screen();

		return screen;
	}

	public void add(ButtonClickedListener listener) {
		button.addActionListener(listener);
	}

	public void display() {
		frame.setVisible(true);
	}
}
