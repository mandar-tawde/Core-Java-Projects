package com.techlabs.guitar;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars = new ArrayList<Guitar>();

	public void addGuitar(Guitar guitar) {
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			if (guitar.getSerialNumber() == serialNumber)
				return guitar;
		}
		throw (new RuntimeException("Wrong serial number"));
	}

	public List<Guitar> searchGuitar(GuitarSpec guitarSpec) {
		List<Guitar> matchingGuitars = new ArrayList<Guitar>();
		for (Guitar guitar : guitars) {
			if (guitar.getGuitarSpec().equals(guitarSpec))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}
