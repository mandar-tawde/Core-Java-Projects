package com.techlabs.scanners;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class FileHandler {

	private String data;

	public void setData(String data) {
		this.data = data;
	}

	public void writeData(String fileName) throws IOException {
		String oldData;
		oldData = this.readData(fileName);
		data = oldData + data;
		FileOutputStream fout = new FileOutputStream(fileName);
		byte b[] = data.getBytes();
		fout.write(b);
		fout.close();
	}

	public String readData(String fileName) throws IOException {
		String data = new String();
		FileInputStream fin = new FileInputStream(fileName);

		int b = fin.read();
		while (b != -1) {
			data = data + (char) b;
			b = fin.read();
		}
		fin.close();

		return data;
	}

	public Set<String> readData(String fileName, Set<String> dataSet)
			throws IOException {
		String data = new String();
		FileInputStream fin = new FileInputStream(fileName);

		int b = fin.read();
		while (b != -1) {
			if (b == '\n' || b == ' ') {
				dataSet.add(data);
				data = new String();
				b = fin.read();
			}
			data = data + (char) b;
			b = fin.read();
		}
		fin.close();

		return dataSet;
	}
}
