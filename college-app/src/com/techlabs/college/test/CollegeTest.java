package com.techlabs.college.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.techlabs.college.Branch;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class CollegeTest {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student student = new Student(01, "Kandivali",
				dateFormat.parse("20/01/1996"), Branch.COMPUTER_ENGINEERING);
		Professor professor = new Professor(101, "Andheri",
				dateFormat.parse("20/01/1986"), 30000d);
		System.out.println("Student\nID      :- " + student.getID()
				+ "\nAddress :- " + student.getAddress() + "\nD.O.B.  :- "
				+ dateFormat.format(student.getDOB()) + "\nBranch  :- "
				+ student.getBranch());
		System.out.println();
		System.out.println("Professor\nID      :- " + professor.getID()
				+ "\nAddress :- " + professor.getAddress() + "\nD.O.B.  :- "
				+ dateFormat.format(professor.getDOB()) + "\nSalary  :- "
				+ professor.calculateSalary());

	}
}
