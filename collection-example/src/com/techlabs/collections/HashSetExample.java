package com.techlabs.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> studentSet;
		System.out.println("HashSet Example");
		studentSet = new HashSet<Student>();
		if(studentSet.isEmpty()) {
			System.out.println("HashSet is empty");
		}
		else
		{
			System.out.println("HashSet is not empty");
		}
		for (int i = 0; i < 4; i++) {
			Student s1 = new Student();
			s1.setRollNo(i + 1);
			s1.setName("Student" + String.valueOf(i + 1));
			studentSet.add(s1);
		}
		Iterator<Student> it = studentSet.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			System.out.println(String.valueOf(s.getRollNo())+" : "+s.getName());
		}
		Student sTry = new Student();
		sTry.setName("Student2");
		sTry.setRollNo(2);
		if(studentSet.contains(sTry)) {
			System.out.println("Contains "+sTry.getName());
		}
		else
		{
			System.out.println(sTry.getName()+" is not present");
		}
	}
}
