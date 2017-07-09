package com.techlabs.objects;

import java.lang.reflect.Constructor;

import com.techlabs.classes.Student;

public class StudentTest {

	public static void main(String[] args) throws Exception {

		Student student1 = new Student("Mandar", "S123", "Mumbai", 12);

		Class<Student> class1 = Student.class;

		Student student2 = (Student) class1.newInstance();

		Constructor<?> constructor = class1.getDeclaredConstructors()[0];
		Student student3 = (Student) constructor.newInstance("Pankaj", "S124",
				"Pune", 12);

		Student student4 = (Student) student1.clone();

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

	}
}
