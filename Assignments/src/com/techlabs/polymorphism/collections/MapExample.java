package com.techlabs.polymorphism.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {

		System.out.println("HashMap Example");
		Map<Integer, String> dataMap = new HashMap<Integer, String>();
		populate(dataMap);
		print(dataMap);
		System.out.println("Linked HashMap Example");
		dataMap = new LinkedHashMap<Integer, String>();
		populate(dataMap);
		print(dataMap);
		System.out.println("TreeMap Example");
		dataMap = new TreeMap<Integer, String>();
		populate(dataMap);
		print(dataMap);
	}

	public static void populate(Map<Integer, String> dataMap) {
		for (int i = 0; i < 5; i += 1)
			dataMap.put(i, "Data of key " + i);
	}

	public static void print(Map<Integer, String> dataMap) {
		for (int i : dataMap.keySet())
			System.out.println(i + " : " + dataMap.get(i));
	}
}
