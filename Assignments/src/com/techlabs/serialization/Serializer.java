package com.techlabs.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {
	private Object object;
	private ObjectOutputStream objOut;
	private FileOutputStream fileOut;

	public Serializer(Object object) {
		this.object = object;
	}

	public void serializeObject(String filePath) throws IOException {
		fileOut = new FileOutputStream(filePath);
		objOut = new ObjectOutputStream(fileOut);
		objOut.writeObject(object);
		objOut.close();
		fileOut.close();
	}
}
