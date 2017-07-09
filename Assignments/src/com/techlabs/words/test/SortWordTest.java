package com.techlabs.words.test;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.words.SortWords;

public class SortWordTest {

	public static void main(String[] args) {
		Set<String> wordSet = new TreeSet<String>();

		SortWords sortWords = new SortWords();
		try {
			wordSet = sortWords.getWords("E:\\words.txt");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		for (String word : wordSet) {
			System.out.println(word);
		}
	}

}
