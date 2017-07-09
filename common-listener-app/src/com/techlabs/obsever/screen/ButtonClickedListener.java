package com.techlabs.obsever.screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonClickedListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		switch (command) {

		case "Hello":
			JOptionPane.showMessageDialog(null, "Hello Button Clicked",
					"Button Clicked", JOptionPane.DEFAULT_OPTION);
			break;

		case "Exit":
			System.exit(0);
			break;
		}
	}
}
