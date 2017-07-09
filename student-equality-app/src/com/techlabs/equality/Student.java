package com.techlabs.equality;

public class Student {

	private final int rollNo;
	private final int standard;
	private final String name;
	private final int age;
	private final String location;

	public Student(int rollNo, int standard, String name, int age,
			String location) {
		this.rollNo = rollNo;
		this.standard = standard;
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getStandard() {
		return standard;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getLocation() {
		return location;
	}

	public String getDetails() {
		return rollNo + ",\t" + standard + ",\t" + name + ",\t" + age + ",\t"
				+ location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		result = prime * result + standard;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}

}
