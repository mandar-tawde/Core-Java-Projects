package com.techlabs.scanners;

import java.io.IOException;

public class ReadHTMLTest {
	public static void main(String[] args) {
		String data;
		FileHandler fileHandler = new FileHandler();
		try {
			data = fileHandler.readData(args[0].toString());
			System.out.println(data);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
