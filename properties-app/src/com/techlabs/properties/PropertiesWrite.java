package com.techlabs.properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesWrite {
	public static void main(String[] args) {

		Properties properties = new Properties();
		OutputStream outputStream;

		try {
			outputStream = new FileOutputStream("config.propertis");

			properties.setProperty("dbname", "localhost");
			properties.setProperty("username", "user@123");
			properties.setProperty("password", "Userpassword");

			properties.store(outputStream, null);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
