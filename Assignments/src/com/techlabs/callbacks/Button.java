package com.techlabs.callbacks;

public class Button {

	public void isClicked(IClickable clickable) {
		clickable.whenClicked();
	}

}
