package com.techlabs.boxing;

public class BoxingUnboxing {

	public static void main(String[] args) {
		int a = 10;
		Integer b = a;
		Integer c = new Integer(a);
		int d = c;
		System.out.println("int a     : " + a);
		System.out.println("Integer b : " + b);
		System.out.println("Integer c : " + c);
		System.out.println("int d     : " + d);
	}
}
