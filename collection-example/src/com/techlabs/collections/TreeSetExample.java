package com.techlabs.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Student s;
		Set<Student> studentTSet;
		System.out.println("Tree Set Example");
		studentTSet = new TreeSet<Student>();
		if (studentTSet.isEmpty()) {
			System.out.println("Tree Set is empty");
		} else {
			System.out.println("Tree Set is not empty");
		}
		for (int i = 0; i < 4; i++) {
			s = new Student();
			s.setRollNo(i + 1);
			s.setName("Name" + String.valueOf(i + 1));
			studentTSet.add(s);
		}
		Iterator<Student> it = studentTSet.iterator();
		while (it.hasNext()) {
			s = it.next();
			System.out.println(s);
		}
		System.out.println("First Student : "
				+ ((TreeSet<Student>) studentTSet).first().getName());
		System.out.println("Last Student  : "
				+ ((TreeSet<Student>) studentTSet).last().getName());
	}
}
