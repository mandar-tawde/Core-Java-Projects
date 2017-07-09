package com.techlabs.composite.control.test;

import com.techlabs.composite.control.Control;
import com.techlabs.composite.control.ControlGroup;

public class ControlTest {

	public static void main(String[] args) {

		ControlGroup controlGroup1 = new ControlGroup("HTML");

		ControlGroup controlGroup2 = new ControlGroup("BODY");

		ControlGroup controlGroup3 = new ControlGroup("DIV", "1");
		Control control1 = new Control("Input", "Type = Text");
		controlGroup3.add(control1);

		controlGroup2.add(controlGroup3);

		ControlGroup controlGroup4 = new ControlGroup("DIV", "2");
		Control control2 = new Control("Input", "Type = Number");
		controlGroup4.add(control2);

		ControlGroup controlGroup5 = new ControlGroup("Radio Button");
		Control control3 = new Control("Choice", "1");
		Control control4 = new Control("Choice", "2");
		Control control5 = new Control("Choice", "3");
		controlGroup5.add(control3);
		controlGroup5.add(control4);
		controlGroup5.add(control5);
		controlGroup4.add(controlGroup5);

		controlGroup2.add(controlGroup4);

		controlGroup1.add(controlGroup2);

		controlGroup1.showDom();
	}
}
