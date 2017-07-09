package com.techlabs.reflector;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectorClass {
	private Object objectInstance = null;
	private Class<? extends Object> classInstance = null;
	private ArrayList<String> methodsList = new ArrayList<String>();

	public ReflectorClass(Object objectInstance) {
		this.objectInstance = objectInstance;
		classInstance = this.objectInstance.getClass();
	}

	public ReflectorClass(Class<? extends Object> classInstance) {
		this.classInstance = classInstance;
	}

	public String getName() {
		return classInstance.getName();
	}

	public ArrayList<String> getMethods() {
		for (Method method : classInstance.getDeclaredMethods()) {
			methodsList.add(method.getName());
		}
		return methodsList;
	}

	public ArrayList<String> getMethods(String annotationName) {
		Annotation[] annotationArray;
		for (Method method : classInstance.getDeclaredMethods()) {
			annotationArray = method.getDeclaredAnnotations();
			for (Annotation annotation : annotationArray) {
				if (annotation.annotationType().getSimpleName()
						.equals(annotationName))
					methodsList.add(method.getName());
			}
		}
		return methodsList;
	}

}
