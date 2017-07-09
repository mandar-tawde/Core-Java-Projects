package com.techlabs.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> nameList;
		System.out.println("ArrayList example");
		nameList = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			nameList.add("Student" + String.valueOf(i + 1));
		}
		nameList.add("Student6");
		System.out.println(nameList);
		nameList.add(4, "Student5");
		System.out.println(nameList);
		boolean presence = nameList.contains("Student2");
		if (presence == true) {
			System.out.println("Studeent2 is present at location "
					+ String.valueOf(nameList.indexOf("Student2")));
		} else {
			System.out.println("Student2 is not present");
		}
		nameList.remove("Student2");
		System.out.println(nameList);
		presence = nameList.contains("Student2");
		if (presence == true) {
			System.out.println("Studeent2 is present at location "
					+ String.valueOf(nameList.indexOf("Student2")));
		} else {
			System.out.println("Student2 is not present");
		}

	}

}
