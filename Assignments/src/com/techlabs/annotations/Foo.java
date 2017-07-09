package com.techlabs.annotations;

public class Foo {
	private int num;
	private String name;

	public void setNum(int num) {
		this.num = num;
	}

	@RequireRefactoring
	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	@RequireRefactoring
	public String getName() {
		return name;
	}

}
