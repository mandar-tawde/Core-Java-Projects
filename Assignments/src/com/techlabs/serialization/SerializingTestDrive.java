package com.techlabs.serialization;

import com.techlabs.reflector.Student;

public class SerializingTestDrive {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Mandar");
		s1.setRollNo(12);
		s1.printInfo("Object Details");
		Serializer serializer = new Serializer(s1);
		try {
			serializer.serializeObject("E:\\serialobject.ser");
			System.out.println("Object Serialized successfully");
			Deserializer deserializer = new Deserializer();
			Student s2 = (Student) deserializer
					.deserializeObject("E:\\serialobject.ser");
			System.out.println("Object Deserialized successfully");
			s2.printInfo("Object Details");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
