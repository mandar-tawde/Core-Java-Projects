package com.techlabs.equality.test;

import java.util.HashMap;
import java.util.Map;

import com.techlabs.equality.Student;

public class StudentMapTest {
	public static void main(String[] args) {
		Student student1 = new Student(1, 10, "mandar", 21, "Mumbai");
		Student student2 = new Student(1, 10, "rahul", 22, "Pune");

		Map<Student, Student> studentMap = new HashMap<Student, Student>();
		studentMap.put(student1, student1);
		studentMap.put(student2, student2);

		for (Student student : studentMap.keySet()) {
			System.out.println(studentMap.get(student).getDetails());
		}

	}
}
