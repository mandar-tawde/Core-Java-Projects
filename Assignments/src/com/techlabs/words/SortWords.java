package com.techlabs.words;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.scanners.FileHandler;

public class SortWords {

	private FileHandler fileHandler = new FileHandler();
	private Set<String> wordSet = new TreeSet<String>();

	public Set<String> getWords(String filePath) throws IOException {
		fileHandler.readData(filePath, wordSet);
		return wordSet;
	}

}
