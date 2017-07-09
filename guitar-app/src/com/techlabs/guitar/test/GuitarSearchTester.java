package com.techlabs.guitar.test;

import java.util.List;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.GuitarSpec;
import com.techlabs.guitar.Inventory;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;

public class GuitarSearchTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();

		GuitarSpec guitarSpec1 = new GuitarSpec(Builder.COLLINGS, "C1020",
				Type.ACOUSTIC, Wood.ADIRONDACK, Wood.ALDER, 6);
		GuitarSpec guitarSpec2 = new GuitarSpec(Builder.FENDER, "F1021",
				Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
		GuitarSpec guitarSpec3 = new GuitarSpec(Builder.GIBSON, "G1032",
				Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD,
				Wood.BRAZILIAN_ROSEWOOD, 6);
		GuitarSpec guitarSpec4 = new GuitarSpec(Builder.MARTIN, "M1432",
				Type.ELECTRIC, Wood.CEDAR, Wood.CEDAR, 6);
		GuitarSpec guitarSpec5 = new GuitarSpec(Builder.OLSON, "O1920",
				Type.ACOUSTIC, Wood.COCOBOLO, Wood.COCOBOLO, 6);
		GuitarSpec guitarSpec6 = new GuitarSpec(Builder.PRS, "P1650",
				Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 12);
		GuitarSpec guitarSpec7 = new GuitarSpec(Builder.RYAN, "R1650",
				Type.ACOUSTIC, Wood.MAHOGANY_Maple, Wood.MAHOGANY_Maple, 12);
		GuitarSpec guitarSpec8 = new GuitarSpec(Builder.COLLINGS, "C1030",
				Type.ELECTRIC, Wood.SITKA, Wood.SITKA, 12);
		GuitarSpec guitarSpec9 = new GuitarSpec(Builder.FENDER, "F2020",
				Type.ACOUSTIC, Wood.ADIRONDACK, Wood.INDIAN_ROSEWOOD, 12);
		GuitarSpec guitarSpec10 = new GuitarSpec(Builder.GIBSON, "G1420",
				Type.ELECTRIC, Wood.COCOBOLO, Wood.ALDER, 12);

		inventory.addGuitar(new Guitar("G001", 10000, guitarSpec1));
		inventory.addGuitar(new Guitar("G002", 30000, guitarSpec2));
		inventory.addGuitar(new Guitar("G003", 50000, guitarSpec3));
		inventory.addGuitar(new Guitar("G004", 70000, guitarSpec4));
		inventory.addGuitar(new Guitar("G005", 90000, guitarSpec5));
		inventory.addGuitar(new Guitar("G006", 20000, guitarSpec6));
		inventory.addGuitar(new Guitar("G007", 40000, guitarSpec7));
		inventory.addGuitar(new Guitar("G008", 60000, guitarSpec8));
		inventory.addGuitar(new Guitar("G009", 80000, guitarSpec9));
		inventory.addGuitar(new Guitar("G010", 650000, guitarSpec7));
		inventory.addGuitar(new Guitar("G011", 70000, guitarSpec8));
		inventory.addGuitar(new Guitar("G012", 850000, guitarSpec9));
		inventory.addGuitar(new Guitar("G013", 950000, guitarSpec10));

		System.out.println("Guitar searched by Serial Number");
		System.out.println(inventory.getGuitar("G001"));

		List<Guitar> guitars = inventory.searchGuitar(new GuitarSpec(
				Builder.COLLINGS, "C1030", Type.ELECTRIC, Wood.SITKA,
				Wood.SITKA, 12));

		System.out.println();
		System.out.println("Guitars searched by spec");
		for (Guitar guitar : guitars)
			System.out.println(guitar);
	}
}
