package com.techlabs.scanners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {
	private String ipString = null;

	public String readInput(String prompt) throws IOException {
		System.out.println(prompt);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ipString = br.readLine();
		if (ipString.length() == 0)
			return null;
		return ipString;
	}

	public String readInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ipString = br.readLine();
		if (ipString.length() == 0)
			return null;
		return ipString;
	}

	public String readInput(String prompt, int num) throws IOException {
		if (num <= 0)
			System.out.print(prompt);
		if (num >= 1)
			System.out.println(prompt);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ipString = br.readLine();
		if (ipString.length() == 0)
			return null;
		return ipString;
	}
}
