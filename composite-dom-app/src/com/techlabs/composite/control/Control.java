package com.techlabs.composite.control;

public class Control implements IControl {

	private String discription;
	private String extraDiscription;

	private int counter;

	public Control(String discription, String extraDiscription) {
		this.discription = discription;
		if (!extraDiscription.equals(""))
			this.extraDiscription = " " + extraDiscription;
		else
			this.extraDiscription = extraDiscription;
	}

	public Control(String discription) {
		this(discription, "");
	}

	@Override
	public void setCounter(int counter) {
		this.counter = counter;
	}

	@Override
	public void showDom() {
		for (int i = 0; i < counter; i += 1)
			System.out.print("   ");
		System.out.println("<" + discription + extraDiscription + "> </"
				+ discription + ">");
	}

}
