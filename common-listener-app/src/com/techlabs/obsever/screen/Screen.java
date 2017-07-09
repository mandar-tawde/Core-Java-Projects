package com.techlabs.obsever.screen;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen {

	private static Screen screen;

	private JFrame frame;
	private JButton button1;
	private JButton button2;

	private Screen() {
		frame = new JFrame("Screen");
		frame.setSize(300, 300);
		frame.setResizable(false);
		frame.setLayout(new GridBagLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("Hello");
		button1.setActionCommand("Hello");
		frame.add(button1);

		frame.add(Box.createRigidArea(new Dimension(15, 0)));

		button2 = new JButton("Exit");
		button2.setActionCommand("Exit");
		frame.add(button2);
	}

	public static Screen getInstance() {
		if (screen == null)
			screen = new Screen();

		return screen;
	}

	public void add(ActionListener listener) {
		button1.addActionListener(listener);
		button2.addActionListener(listener);
	}

	public void display() {
		frame.setVisible(true);
	}
}
