package com.techlabs.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {
	private Object object;
	private FileInputStream fileInput;
	private ObjectInputStream objInput;

	public Object deserializeObject(String filePath) throws Exception {
		fileInput = new FileInputStream(filePath);
		objInput = new ObjectInputStream(fileInput);
		object = objInput.readObject();
		objInput.close();
		fileInput.close();
		return object;
	}
}
