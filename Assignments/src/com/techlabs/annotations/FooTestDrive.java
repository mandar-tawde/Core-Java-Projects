package com.techlabs.annotations;

import java.util.ArrayList;

import com.techlabs.reflector.ReflectorClass;

public class FooTestDrive {
	public static void main(String[] args) {
		Foo a = new Foo();
		ReflectorClass reflectionHandler = new ReflectorClass(a);
		ArrayList<String> methodsList = new ArrayList<String>();
		methodsList = reflectionHandler.getMethods("RequireRefactoring");
		System.out.println("Number of methods who needs attention : "+methodsList.size());
		System.out.println("Following methods need attention");
		for (String methodName : methodsList) {
			System.out.println(methodName);
		}
	}
}
