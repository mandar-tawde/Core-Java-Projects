package com.techlabs.callbacks;

public class SwitchBoard implements IClickable {
	private Button lightButton = new Button();

	public void lightButtonClicked() {
		lightButton.isClicked(this);
	}

	@Override
	public void whenClicked() {
		System.out.println("Turned on the lights");
	}

}
