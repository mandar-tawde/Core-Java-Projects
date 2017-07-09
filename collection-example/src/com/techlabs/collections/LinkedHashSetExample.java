package com.techlabs.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<Student> studentLSet;
		System.out.println("Linked Hash Set Example");
		studentLSet = new LinkedHashSet<Student>();
		if(studentLSet.isEmpty()) {
			System.out.println("LinkedHashSet is empty");
		}
		else
		{
			System.out.println("LinkedHashSet is not empty");
		}
		for (int i = 0; i < 4; i++) {
			Student s1 = new Student();
			s1.setRollNo(i + 1);
			s1.setName("Student" + String.valueOf(i + 1));
			studentLSet.add(s1);
		}
		Iterator<Student> it = studentLSet.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(String.valueOf(s.getRollNo())+" : "+s.getName());
		}
		Student sTry = new Student();
		sTry.setName("Student2");
		sTry.setRollNo(2);
		if(studentLSet.contains(sTry)) {
			System.out.println("Contains "+sTry.getName());
		}
		else
		{
			System.out.println(sTry.getName()+" is not present");
		}
	}

}
