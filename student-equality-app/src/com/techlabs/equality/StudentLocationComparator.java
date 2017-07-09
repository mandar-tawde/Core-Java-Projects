package com.techlabs.equality;

import java.util.Comparator;

public class StudentLocationComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getLocation().compareTo(o2.getLocation());
	}

}
