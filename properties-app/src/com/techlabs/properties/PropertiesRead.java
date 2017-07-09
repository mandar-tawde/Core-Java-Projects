package com.techlabs.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesRead {
	public static void main(String[] args) {

		Properties properties = new Properties();
		InputStream inputStream;

		try {

			inputStream = new FileInputStream("config.propertis");

			properties.load(inputStream);

			System.out.println("Database Name\t: " + properties.get("dbname"));
			System.out.println("Userame\t\t: " + properties.get("username"));
			System.out.println("Password\t: " + properties.get("password"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
