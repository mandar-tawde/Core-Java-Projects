package com.techlabs.guitar;

public class Guitar {
	private final String serialNumber;
	private double price;
	private final GuitarSpec guitarSpec;

	public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarSpec = guitarSpec;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}

	@Override
	public String toString() {
		return serialNumber + " Rs" + price + " " + guitarSpec;
	}
}
