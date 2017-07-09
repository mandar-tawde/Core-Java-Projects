package com.techlabs.reflector;

import java.util.ArrayList;

public class ReflectorClassTestDrive {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollNo(12);
		s1.setName("Mandar");
		ReflectorClass reflectionHandler = new ReflectorClass(Student.class);
		String className = reflectionHandler.getName();
		System.out.println("Class Name " + className);
		System.out.println("Methods in this class");
		ArrayList<String> methodsList = new ArrayList<String>();
		methodsList = reflectionHandler.getMethods();
		for (String methodName : methodsList) {
			System.out.println(methodName);
		}
	}
}
