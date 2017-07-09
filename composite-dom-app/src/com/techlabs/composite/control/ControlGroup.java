package com.techlabs.composite.control;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IControl {

	private String discription;
	private String extraDiscription;
	private List<IControl> controls;

	private int counter;

	public ControlGroup(String discription, String extraDiscription) {
		this.discription = discription;
		if (!extraDiscription.equals(""))
			this.extraDiscription = " " + extraDiscription;
		else
			this.extraDiscription = extraDiscription;
		controls = new ArrayList<IControl>();
		counter = 0;
	}

	public ControlGroup(String discription) {
		this(discription, "");
	}

	public void add(IControl control) {
		controls.add(control);
		control.setCounter(counter + 1);
	}

	@Override
	public void setCounter(int counter) {
		this.counter = counter;
		for (IControl control : controls)
			control.setCounter(counter + 1);
	}

	@Override
	public void showDom() {
		for (int i = 0; i < counter; i += 1)
			System.out.print("   ");
		System.out.println("<" + discription + extraDiscription + ">");

		for (IControl control : controls) {
			control.showDom();
		}

		for (int i = 0; i < counter; i += 1)
			System.out.print("   ");
		System.out.println("</" + discription + ">");

	}

}
