package com.techlabs.collections;

public class Student implements Comparable<Student>{
	private String name;
	private Integer rollNo;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRollNo() {
		return rollNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rollNo == null) ? 0 : rollNo.hashCode());
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
		if (rollNo == null) {
			if (other.rollNo != null)
				return false;
		} else if (!rollNo.equals(other.rollNo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String string;
		string = "Roll no : " + rollNo + "\nName    : " + name + "\nType    : "
				+ super.toString();
		return string;
	}

	@Override
	public int compareTo(Student o) {
		return -o.getName().compareTo(this.name);
	}
}
