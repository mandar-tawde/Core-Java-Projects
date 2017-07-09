package com.techlabs.polymorphism.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		System.out.println("ArrayList Example");
		List<Integer> numList = new ArrayList<Integer>();
		populate(numList);
		print(numList);
		System.out.println("LinkedList Example");
		numList = new LinkedList<Integer>();
		populate(numList);
		print(numList);
	}

	public static void populate(List<Integer> numList) {
		for (int i = 0; i < 5; i += 1)
			numList.add(i);
	}

	public static void print(List<Integer> numList) {
		for (int num : numList)
			System.out.println(num);
	}
}
