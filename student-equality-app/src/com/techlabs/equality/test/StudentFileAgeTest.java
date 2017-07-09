package com.techlabs.equality.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.equality.Student;
import com.techlabs.equality.StudentAgeComparator;

public class StudentFileAgeTest {
	public static void main(String[] args) {

		try {
			File file = new File("resources\\students.csv");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			Set<Student> uniqueStudents = new HashSet<Student>();

			String studentEntry = bufferedReader.readLine();
			while (studentEntry != null) {
				String[] studentData = studentEntry.split(",");
				uniqueStudents.add(new Student(
						Integer.parseInt(studentData[0]), Integer
								.parseInt(studentData[1]), studentData[2],
						Integer.parseInt(studentData[3]), studentData[4]));

				studentEntry = bufferedReader.readLine();
			}
			bufferedReader.close();

			Set<Student> students = new TreeSet<Student>(
					new StudentAgeComparator());
			students.addAll(uniqueStudents);

			for (Student student : students) {
				System.out.println(student.getDetails());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
