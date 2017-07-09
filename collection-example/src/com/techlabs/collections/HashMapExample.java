package com.techlabs.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> studentHMap;
		System.out.println("HashMap example");
		studentHMap = new HashMap<Student, Integer>();
		for (int i = 0; i < 4; i++) {
			Student s1 = new Student();
			s1.setRollNo(i + 1);
			s1.setName("Student" + String.valueOf(i + 1));
			studentHMap.put(s1, (i + 1) * 10);
		}
		for (Student s : studentHMap.keySet()) {
			System.out.println(s.getName() + " : " + studentHMap.get(s));
		}
		Student sTry = new Student();
		sTry.setRollNo(1);
		sTry.setName("Student1");
		System.out.println(studentHMap.get(sTry));
	}
}
