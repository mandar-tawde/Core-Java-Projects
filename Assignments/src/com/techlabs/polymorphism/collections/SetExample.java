package com.techlabs.polymorphism.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		System.out.println("HashSet Example");
		Set<String> dataSet = new HashSet<String>();
		populate(dataSet);
		print(dataSet);
		System.out.println("Linked HashSet Example");
		dataSet = new LinkedHashSet<String>();
		populate(dataSet);
		print(dataSet);
		System.out.println("TreeSet Example");
		dataSet = new TreeSet<String>();
		populate(dataSet);
		print(dataSet);
	}

	public static void populate(Set<String> dataSet) {
		for (int i = 0; i < 5; i += 1)
			dataSet.add("String " + (i + 1));
	}

	public static void print(Set<String> dataSet) {
		for (String data : dataSet)
			System.out.println(data);
	}

}
