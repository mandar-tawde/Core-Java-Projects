package com.techlabs.scanners;

import java.io.IOException;

public class ScannerFileTestDrive {

	public static void main(String[] args) {
		InputHandler inputHandler = new InputHandler();
		FileHandler fileHandler = new FileHandler();
		String input = new String();
		String data = new String();
		try {
			input = inputHandler.readInput();
			while (!input.equals("exit")) {
				data = data + input + " ";
				input = inputHandler.readInput();
			}
			fileHandler.setData(data);
			fileHandler.writeData("E:\\text.txt");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
