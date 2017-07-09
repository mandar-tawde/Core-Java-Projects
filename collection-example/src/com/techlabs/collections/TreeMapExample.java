package com.techlabs.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> studentTMap;
		System.out.println("Tree Map Example");
		studentTMap = new TreeMap<Student, Integer>();
		for (int i = 0; i < 4; i++) {
			Student s1 = new Student();
			s1.setRollNo(i + 1);
			s1.setName("Student" + String.valueOf(i + 1));
			studentTMap.put(s1, (i + 1) * 10);
		}
		for (Student s : studentTMap.keySet()) {
			System.out.println(s.getName() + " : " + studentTMap.get(s));
		}
		Student sTry = new Student();
		sTry.setName("Student1");
		sTry.setRollNo(1);
		System.out.println(studentTMap.get(sTry));
	}

}
