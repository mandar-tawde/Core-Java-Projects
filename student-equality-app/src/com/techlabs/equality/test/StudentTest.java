package com.techlabs.equality.test;

import com.techlabs.equality.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student(1, 5, "Mandar", 20, "Mumbai");
		Student student2 = new Student(1, 5, "Pankaj", 21, "Mumbai");

		System.out.print("( = ) ");
		if (student1 == student2) {
			System.out.println("Students are same");
		} else {
			System.out.println("Students are different");
		}

		System.out.print("( equals ) ");
		if (student1.equals(student2)) {
			System.out.println("Students are same");
		} else {
			System.out.println("Students are different");
		}
	}
}
