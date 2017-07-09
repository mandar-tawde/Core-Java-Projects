package com.techlabs.equality.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techlabs.equality.Student;
import com.techlabs.equality.StudentAgeComparator;

public class StudentMapAgeTest {

	public static void main(String[] args) {

		try {

			Map<Student, Student> studentMap = new HashMap<Student, Student>();

			File file = new File("resources\\students.csv");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String studentEntry = bufferedReader.readLine();
			while (studentEntry != null) {
				String[] studentData = studentEntry.split(",");
				Student student = new Student(Integer.parseInt(studentData[0]),
						Integer.parseInt(studentData[1]), studentData[2],
						Integer.parseInt(studentData[3]), studentData[4]);
				studentMap.put(student, student);
				studentEntry = bufferedReader.readLine();
			}
			bufferedReader.close();

			List<Student> keyList = new ArrayList<Student>(studentMap.keySet());
			Collections.sort(keyList, new StudentAgeComparator());

			for (Student student : keyList) {
				System.out.println(studentMap.get(student).getDetails());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
