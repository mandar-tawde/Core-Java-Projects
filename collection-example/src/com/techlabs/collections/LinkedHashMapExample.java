package com.techlabs.collections;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args){
		Map<Student, Integer> nameLHMap;
		System.out.println("Linked HashMap example");
		nameLHMap = new HashMap<Student, Integer>();
		for (int i = 0; i < 4; i++) {
			Student s1 = new Student();
			s1.setRollNo(i + 1);
			s1.setName("Student" + String.valueOf(i + 1));
			nameLHMap.put(s1, (i+1)*10);
		}
		for(Student s : nameLHMap.keySet())
		{
			System.out.println(s.getName()+" : "+nameLHMap.get(s));
		}
		Student sTry = new Student();
		sTry.setRollNo(1);
		sTry.setName("Student1");
		System.out.println(nameLHMap.get(sTry));
	}
}
