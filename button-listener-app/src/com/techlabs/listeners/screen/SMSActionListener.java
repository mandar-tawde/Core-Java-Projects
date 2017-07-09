package com.techlabs.listeners.screen;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class SMSActionListener extends ButtonClickedListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Sent SMS Successfully",
				"Button Clicked", JOptionPane.DEFAULT_OPTION);
	}

}
